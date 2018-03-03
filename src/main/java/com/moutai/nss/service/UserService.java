package com.moutai.nss.service;

import com.moutai.nss.entity.User;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.web.vo.LoginParams;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/3 11:18
 */
public interface UserService {

    StatusEnum save(LoginParams params);

    StatusEnum remove(Long id);

    StatusEnum modify(User user);

    User queryByLoginParams(LoginParams params);

}
