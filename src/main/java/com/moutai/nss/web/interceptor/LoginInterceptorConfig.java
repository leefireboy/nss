package com.moutai.nss.web.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/5 9:15
 */
@Configuration
public class LoginInterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private UserLoginInterceptor userLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(userLoginInterceptor).addPathPatterns("/**").excludePathPatterns("/init");
    }

}
