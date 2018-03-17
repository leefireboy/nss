package com.moutai.nss.dao;

import com.moutai.nss.entity.SaleRecord;
import com.moutai.nss.web.vo.SaleRecordQuerySqlParams;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleRecordDaoTest {

    @Autowired
    private SaleRecordDao saleRecordDao;

//    @Test
    public void insert() {
        SaleRecord saleRecord = new SaleRecord("test", "412326199207130910", 9L, "海津皇冠", 0L);
        saleRecord.setCreateId(0L);
        Assert.assertEquals(1, saleRecordDao.insert(saleRecord));
    }

//    @Test
    public void update() {
        SaleRecord saleRecord = new SaleRecord("testUpdate", "412326199207130000", 9L, "海津皇冠", 0L);
        saleRecord.setId(1L);
        Assert.assertEquals(1L, saleRecordDao.update(saleRecord));
    }

//    @Test
    public void delete() {
        Assert.assertEquals(1, saleRecordDao.delete(1L));
    }

//    @Test
    public void selectById() {
        Assert.assertEquals(null, saleRecordDao.selectById(1L));
    }

//    @Test
    public void selectAll() {
        Assert.assertEquals(0, saleRecordDao.selectAll().size());
    }

//    @Test
    public void selectByParams() {
        SaleRecordQuerySqlParams params = new SaleRecordQuerySqlParams();
        params.setActivityId(0L);
        Assert.assertEquals(0, saleRecordDao.selectByParams(params).size());
    }

}