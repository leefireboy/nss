package com.moutai.nss.base;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 基础 DAO
 * @Auther: LEE
 * @Date: Create in 2018/2/9 13:52
 */
public interface BaseDao<T> {

    /**
     * 新增
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 修改
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Serializable id);

    /**
     * 根据 ID 查找
     * @param id
     * @return
     */
    T selectById(Serializable id);

    /**
     * 查询全部
     * @return
     */
    List<T> selectAll();

}
