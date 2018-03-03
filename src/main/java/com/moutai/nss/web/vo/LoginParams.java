package com.moutai.nss.web.vo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/3 10:02
 */
public class LoginParams {

    /**
     * 可能为用户名或者手机号
     */
    @NotEmpty(message = "登录名不能为空！")
    private String loginName;

    /**
     * 使用MD5加密登录密码
     */
    @NotEmpty(message = "登录密码不能为空！")
    private String loginPassword;

    /**
     * 是否为公司登录
     */
    @NotEmpty
    @Pattern(regexp = "[01]", message = "状态只能为 0:用户名 1:手机号")
    private String type;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LoginParams{" +
                "loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", type=" + type +
                '}';
    }

}
