package com.moutai.nss.service.impl;

import com.moutai.nss.base.BaseDao;
import com.moutai.nss.base.BaseService;
import com.moutai.nss.dao.SaleRecordDao;
import com.moutai.nss.entity.SaleRecord;
import com.moutai.nss.entity.User;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.service.SaleRecordService;
import com.moutai.nss.util.CglibBeanCopierUtils;
import com.moutai.nss.web.vo.SaleRecordAddParams;
import com.moutai.nss.web.vo.SaleRecordQueryParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/27 0:24
 */
@Service
public class SaleRecordServiceImpl extends BaseService implements SaleRecordService {

    @Autowired
    private SaleRecordDao saleRecordDao;

    @Override
    public StatusEnum save(SaleRecordAddParams params) {
        User user = getLoginUser();
        SaleRecord saleRecord = new SaleRecord();
        CglibBeanCopierUtils.copyProperties(params, saleRecord);
        saleRecord.setCreateId(user.getId());
        saleRecord.setModifyId(user.getId());
        saleRecord.setCompanyId(user.getCompanyId());
        saleRecord.setCompanyShortName(user.getCompanyShortName());
        return getCUDStatus(getBaseDao().insert(saleRecord));
    }

    @Override
    public StatusEnum remove(Long id) {
        // 管理员可以进行删除操作
        if (isManagement()) {
            return getCUDStatus(getBaseDao().delete(id));
        } else {
            return StatusEnum.NO_AUTHORITY;
        }
    }

    @Override
    public StatusEnum modify(SaleRecord saleRecord) {
        // 管理员可以进行修改操作
        if (isManagement()) {
            User user = getLoginUser();
            saleRecord.setModifyId(user.getId());
            saleRecord.setModifyTime(new Date());
            return getCUDStatus(getBaseDao().update(saleRecord));
        } else {
            return StatusEnum.NO_AUTHORITY;
        }
    }

    @Override
    public List<SaleRecord> queryByParams(SaleRecordQueryParams params) {
        try {
            return saleRecordDao.selectByParams(params);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    @Override
    protected BaseDao<SaleRecord> getBaseDao() {
        return this.saleRecordDao;
    }

}
