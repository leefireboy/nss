package com.moutai.nss.dao;

import com.moutai.nss.base.BaseDao;
import com.moutai.nss.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/25 9:58
 */
public interface UserDao extends BaseDao<User> {

    /**
     * 分页查询用户列表
     * @param offset
     * @param limit
     * @return
     */
    List<User> selectByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 根据用户名和手机号查询用户
     * @param name
     * @param mobilePhone
     * @return
     */
    User selectByNameOrMobilePhone(@Param("name") String name, @Param("mobilePhone") String mobilePhone);

    List<User> selectByParams(@Param("name") String name, @Param("companyId") Long companyId,
                              @Param("offset") Integer offset, @Param("limit") Integer limit);

    int count(Long companyId);

}
