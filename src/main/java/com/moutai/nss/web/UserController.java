package com.moutai.nss.web;

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
public class UserController {

    @GetMapping(value = "/login")
    public String userLogin() {
        return "test";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView userLogout() {
        return null;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView userRegister() {
        return null;
    }

}
