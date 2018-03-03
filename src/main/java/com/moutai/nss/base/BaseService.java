package com.moutai.nss.base;

import com.moutai.nss.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import static com.moutai.nss.base.BaseController.LOGIN_USER_SESSION;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/27 0:51
 */
public abstract class BaseService<T> {

    /**
     * 获取对应DAO
     * @return
     */
    protected abstract BaseDao<T> getBaseDao();

    /**
     * 获取登录的用户信息
     * @return 用户信息
     */
    protected User getLoginUser() {
        return (User) getRequest().getSession().getAttribute(LOGIN_USER_SESSION);
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
