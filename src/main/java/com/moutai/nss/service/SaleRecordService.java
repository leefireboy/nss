package com.moutai.nss.service;

import com.moutai.nss.entity.SaleRecord;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.web.vo.SaleRecordAddParams;
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
    StatusEnum save(SaleRecordAddParams params);

    /**
     * 删除销售记录
     * @param id
     * @return
     */
    StatusEnum remove(Long id);

    /**
     * 修改销售记录
     * @param saleRecord 销售记录
     * @return
     */
    StatusEnum modify(SaleRecord saleRecord);

    /**
     * 根据参数查询销售记录
     * @param params 参数
     * @return
     */
    List<SaleRecord> queryByParams(SaleRecordQueryParams params);

}
