package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import com.moutai.nss.entity.User;
import com.moutai.nss.service.UserService;
import com.moutai.nss.util.MD5Utils;
import com.moutai.nss.web.vo.LoginParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * @Description: 登录控制器
 * @Auther: LEE
 * @Date: Create in 2018/3/3 9:55
 */
@RestController
public class LoginController extends BaseController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView userLogin(@Valid LoginParams params) {
        logger.info("用户登录参数： " + params);
        ModelAndView mv = new ModelAndView();
        User user = userService.queryByLoginParams(params);

        if (user != null && user.getPassword().equals(MD5Utils.getMD5(params.getLoginPassword()))) {
            login(user);
            mv.setViewName("redirect:/activity/list");
            return mv;
        } else {
            mv.setViewName("signIn");
            mv.addObject("message", "用户名或密码错误！");
            mv.addObject("user", user);
            return mv;
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ModelAndView userLogout() {
        logout();
        return new ModelAndView("login");
    }

}
