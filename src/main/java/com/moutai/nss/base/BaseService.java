package com.moutai.nss.base;

import com.moutai.nss.entity.User;
import com.moutai.nss.enums.StatusEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

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

    /**
     * 获取 增删改 操作结果
     * @param effectNo
     * @return
     */
    protected StatusEnum getCUDStatus(int effectNo) {
        try {
            if (effectNo == 1) {
                return StatusEnum.SUCCESS;
            } else {
                return StatusEnum.FAIL;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return StatusEnum.FAIL;
        }
    }

    /**
     * 判断当前用户是否为管理员及超级管理员用户
     * @return
     */
    protected boolean isManagement() {
        if (getLoginUser().getIsManagement() == 1 || getLoginUser().getIsManagement() == 2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断当前用户是否为超级管理员用户
     * @return
     */
    protected boolean isSuperManagement() {
        if (getLoginUser().getIsManagement() == 2) {
            return true;
        } else {
            return false;
        }
    }

}
