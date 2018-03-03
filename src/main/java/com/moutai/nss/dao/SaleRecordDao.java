package com.moutai.nss.dao;

import com.moutai.nss.base.BaseDao;
import com.moutai.nss.entity.SaleRecord;
import com.moutai.nss.web.vo.SaleRecordQueryParams;

import java.util.List;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/25 10:00
 */
public interface SaleRecordDao extends BaseDao<SaleRecord> {

    /**
     * 根据参数查询销售记录列表
     * @param params 参数
     * @return
     */
    List<SaleRecord> selectByParams(SaleRecordQueryParams params);

}
