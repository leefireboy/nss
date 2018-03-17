package com.moutai.nss.service.impl;

import com.moutai.nss.base.BaseDao;
import com.moutai.nss.base.BaseService;
import com.moutai.nss.dao.CompanyDao;
import com.moutai.nss.entity.Company;
import com.moutai.nss.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/17 12:27
 */
@Service
public class CompanyServiceImpl extends BaseService<Company> implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> allCompany() {
        return getBaseDao().selectAll();
    }

    @Override
    protected BaseDao<Company> getBaseDao() {
        return companyDao;
    }

}
