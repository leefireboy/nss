package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/23 22:47
 */
@RestController
public class UserController extends BaseController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView mv = new ModelAndView("addUser");
        mv.addObject("ccList", test.findAllStore());
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

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public ModelAndView userList() {
        ModelAndView mv = new ModelAndView("userList");
        return addBaseAttribute(mv);
    }

    @RequestMapping(value = "/customerList", method = RequestMethod.GET)
    public ModelAndView customerList() {
        ModelAndView mv = new ModelAndView("customerList");
        return addBaseAttribute(mv);
    }
}
