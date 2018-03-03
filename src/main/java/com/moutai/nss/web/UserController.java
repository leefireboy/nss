package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/23 22:47
 */
@RestController
public class UserController extends BaseController {

    @GetMapping(value = "/login")
    public String userLogin() {
        return "testname";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView userLogout() {
        return new ModelAndView("");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView userRegister() {
        return null;
    }

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public ModelAndView userIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/addSalerecord", method = RequestMethod.GET)
    public ModelAndView userAddSalerecord() {

        ModelAndView mv = new ModelAndView("addSalerecord");
        mv.addObject("actList", test.findAllAct());
        return mv;
    }

    @RequestMapping(value = "/actList", method = RequestMethod.GET)
    public ModelAndView userActList() {
        return new ModelAndView("actList");
    }

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public ModelAndView userSignIn() {
        return new ModelAndView("signIn");
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public ModelAndView userSignUp() {
        ModelAndView mv = new ModelAndView("signUp");
        mv.addObject("storeList", test.findAllStore());
        return mv;
    }
}
