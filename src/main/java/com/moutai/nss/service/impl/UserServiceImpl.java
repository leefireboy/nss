package com.moutai.nss.service.impl;

import com.moutai.nss.base.BaseDao;
import com.moutai.nss.base.BaseService;
import com.moutai.nss.dao.UserDao;
import com.moutai.nss.entity.User;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.service.UserService;
import com.moutai.nss.util.PageUtils;
import com.moutai.nss.web.vo.LoginParams;
import com.moutai.nss.web.vo.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/3 11:18
 */
@Service
public class UserServiceImpl extends BaseService<User> implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    public StatusEnum save(LoginParams params) {
        User user = new User();


        try {
            if (userDao.insert(user) == 1) {
                return StatusEnum.SUCCESS;
            } else {
                return StatusEnum.FAIL;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return StatusEnum.FAIL;
        }
    }

    @Override
    public StatusEnum remove(Long id) {
        return null;
    }

    @Override
    public StatusEnum modify(User user) {
        return null;
    }

    @Override
    public User detail(Long id) {
        return null;
    }

    @Override
    public User queryByLoginParams(LoginParams params) {
        if ("0".equals(params.getType())) {
            return userDao.selectByNameOrMobilePhone(params.getLoginName(), null);
        } else {
            return userDao.selectByNameOrMobilePhone(null, params.getLoginPassword());
        }
    }

    @Override
    public Map<String, Object> queryByParams(String name, Page page) {
        if (page.getPageNo() == null) {
            page = new Page(1);
        }
        // 计算总页数
        int count = userDao.count(getLoginUser().getCompanyId());
        int pageTotal =  PageUtils.getPageTotal(count);
        // 更新总页数
        page.setPageTotal(pageTotal);
        // 根据参数查询分页用户列表
        List<User> users;
        int offset = PageUtils.getOffset(page.getPageNo(), page.getPageSize());
        int limit = page.getPageSize();
        if (name == null || "".equals(name)) {
            users = userDao.selectByParams(null, getLoginUser().getCompanyId(), offset, limit);
        } else {
            users = userDao.selectByParams(name, getLoginUser().getCompanyId(), offset, limit);
        }

        logger.debug("users: " + users.toString());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("users", users);
        logger.debug("page: " + page.toString());
        map.put("page", page);
        return map;
    }

    @Override
    protected BaseDao<User> getBaseDao() {
        return this.userDao;
    }

}
