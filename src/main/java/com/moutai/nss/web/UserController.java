package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import com.moutai.nss.entity.User;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.service.CompanyService;
import com.moutai.nss.service.UserService;
import com.moutai.nss.util.CglibBeanCopierUtils;
import com.moutai.nss.web.vo.Page;
import com.moutai.nss.web.vo.UserParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/23 22:47
 */
@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/user/initUser", method = RequestMethod.GET)
    public ModelAndView userInitPage() {
        ModelAndView mv = new ModelAndView("addUser");
        mv.addObject("companys", companyService.allCompany());
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModelAndView add(UserParams userParams) {
        ModelAndView mv = new ModelAndView("addUser");
        User user = new User();
        if (userParams.getPassword().equals(userParams.getRepeatPassword())) {
            CglibBeanCopierUtils.copyProperties(userParams, user);
            mv.addObject("status", userService.modify(user).getStatusInfo());
        } else {
            mv.addObject("status", StatusEnum.FAIL.getStatusInfo());
            mv.addObject("message", "两次输入密码不一致！");
        }
//        mv.addObject("ccList", test.findAllStore());
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ModelAndView remove(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("status", userService.remove(id).getStatusInfo());
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public ModelAndView modify(UserParams userParams) {
        ModelAndView mv = new ModelAndView("");
        User user = new User();
        if (userParams.getPassword().equals(userParams.getRepeatPassword())) {
            CglibBeanCopierUtils.copyProperties(userParams, user);
            mv.addObject("status", userService.modify(user).getStatusInfo());
        } else {
            mv.addObject("message", "两次输入密码不一致！");
        }
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("user", userService.detail(id));
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public ModelAndView userList(String name, Integer pageNo) {
        ModelAndView mv = new ModelAndView("userList");
        Map<String, Object> map = userService.queryByParams(name, new Page(pageNo));
        mv.addObject("list", map.get("users"));
        mv.addObject("page", map.get("page"));
        return addBaseAttribute(mv);
    }

    @GetMapping(value = "/test")
    public String test() {
        logger.info("test baseController logger");
        return "test";
    }

    @RequestMapping(value = "/addSalerecord", method = RequestMethod.GET)
    public ModelAndView userAddSalerecord() {

        ModelAndView mv = new ModelAndView("addSalerecord");
        mv.addObject("actList", test.findAllAct());
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/addActivity", method = RequestMethod.GET)
    public ModelAndView userAddActivity() {

        ModelAndView mv = new ModelAndView("addActivity");
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/customerList", method = RequestMethod.GET)
    public ModelAndView customerList() {
        ModelAndView mv = new ModelAndView("customerList");
        return addBaseAttribute(mv);
    }

}
