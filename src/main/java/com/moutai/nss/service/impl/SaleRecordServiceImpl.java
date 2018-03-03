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

import java.util.List;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/27 0:24
 */
@Service
public class SaleRecordServiceImpl extends BaseService implements SaleRecordService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

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

        try {

            if (getBaseDao().insert(saleRecord) == 1) {
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
        // 只有管理员权限才可以进行删除
//        User user = getLoginUser();
//        if (user.getIsManagement() == 0) {
//            return StatusEnum.NO_AUTHORITY;
//        }

        try {
            if (getBaseDao().delete(id) == 1) {
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
    public StatusEnum modify(SaleRecord saleRecord) {
        try {
        // 登录完成后使用
//            User user = getLoginUser();
//            saleRecord.setModifyId(user.getId());
//            saleRecord.setModifyTime(new Date());

            if (getBaseDao().update(saleRecord) == 1) {
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
        return saleRecordDao;
    }

}
