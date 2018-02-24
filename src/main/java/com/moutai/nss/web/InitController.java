package com.moutai.nss.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/23 23:02
 */
@RestController
public class InitController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView init() {
        return new ModelAndView("login");
    }

}
