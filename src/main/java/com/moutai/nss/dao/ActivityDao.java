package com.moutai.nss.dao;

import com.moutai.nss.base.BaseDao;
import com.moutai.nss.entity.Activity;

import java.util.List;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/25 9:59
 */
public interface ActivityDao extends BaseDao<Activity> {

    /**
     * 查询活动总数
     * @return
     */
    int count();

    /**
     * 根据名字查询分页活动列表
     * @param name
     * @param offset
     * @param limit
     * @return
     */
    List<Activity> selectByParams(String name, Integer offset, Integer limit);

}
