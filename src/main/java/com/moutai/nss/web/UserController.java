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

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModelAndView add() {
        return null;
    }

    @GetMapping(value = "/test")
    public String test() {
        logger.info("test baseController logger");
        return "test";
    }

}
