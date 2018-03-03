package com.moutai.nss.util;

import org.springframework.util.DigestUtils;

/**
 * @Description: MD5加密工具类
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:23
 */
public class MD5Utils {

    private static final String SALT = "23(*(HFnlfwoei):L|++(~*FLKA,.<>NNfa.,po";

    /**
     * 对传入参数拼接盐值进行 MD5 加密
     * @param resource 加密源数据
     * @return
     */
    public static String getMD5(String resource) {
        resource = SALT + resource;
        return DigestUtils.md5DigestAsHex(resource.getBytes());
    }

}
