package com.moutai.nss.base;

import com.moutai.nss.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by libing on 2016/11/4.
 */
@Controller
public abstract class BaseController {

    public static final String LOGIN_USER_SESSION = "Access-User-Session";

    private static Validator validator;

    static {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    /**
     * 获取登录的用户信息
     * @return user info
     */
    protected User getLoginUser() {
        return (User) getRequest().getSession().getAttribute(LOGIN_USER_SESSION);
    }

    /**
     * 用户登录
     * @param user
     */
    protected void login(User user) {
        getRequest().getSession().setAttribute(LOGIN_USER_SESSION, user);
    }

    /**
     * 用户注销
     */
    protected void logout() {
        getRequest().getSession().removeAttribute(LOGIN_USER_SESSION);
    }

    /**
     * 校验 bean 属性是否符合约束
     * @param object 校验对象
     * @param <T>
     */
    protected <T> void volidator(T object) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(object);
        if (!constraintViolations.isEmpty()) {
            ConstraintViolation<T> firstViolation = constraintViolations.iterator().next();
            String msg = String.format("[%s.%s]: %s", firstViolation.getRootBeanClass().getSimpleName(),
                    firstViolation.getPropertyPath().toString(), firstViolation.getMessage());
            throw new RuntimeException(msg);
        }
    }

    /**
     * 获得 HttpServletRequest 对象，在服务响应时间可以获得
     * @return HttpServletRequest
     */
    protected HttpServletRequest getRequest() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            throw new RuntimeException("非法 HTTP 请求");
        }
        return attributes.getRequest();
    }

}
