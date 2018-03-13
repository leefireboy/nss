package com.moutai.nss.service;

import com.moutai.nss.entity.SaleRecord;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.web.vo.SaleRecordParams;
import com.moutai.nss.web.vo.SaleRecordQueryParams;

import java.util.List;

/**
 * @Description: 销售记录业务
 * @Auther: LEE
 * @Date: Create in 2018/2/27 0:23
 */
public interface SaleRecordService {

    /**
     * 新增销售记录
     * @param params 销售记录参数
     * @return
     */
    StatusEnum save(SaleRecordParams params);

    /**
     * 删除销售记录
     * @param id
     * @return
     */
    StatusEnum remove(Long id);

    /**
     * 修改销售记录
     * @param params 销售记录
     * @return
     */
    StatusEnum modify(SaleRecordParams params);

    /**
     * 查询销售记录详情
     * @param id ID
     * @return 销售记录
     */
    SaleRecord detail(Long id);

    /**
     * 根据参数查询销售记录
     * @param params 参数
     * @return
     */
    List<SaleRecord> queryByParams(SaleRecordQueryParams params);

}
