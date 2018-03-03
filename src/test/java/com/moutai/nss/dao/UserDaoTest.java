package com.moutai.nss.dao;

import com.moutai.nss.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

//    @Test
    public void insert() {
        User user = new User("test", 1, 9L, "海津皇冠");
        Assert.assertEquals(1, userDao.insert(user));
    }

//    @Test
    public void update() {
        User user = new User("testUpdate", 1, 9L, "海津皇冠");
        user.setId(1000L);// UPDATE user SET id=?, `name`=?, sex=?, company_id=?, company_short_name=? WHERE id=?
        user.setModifyTime(new Date());
        Assert.assertEquals(1, userDao.update(user));
    }

//    @Test
    public void delete() {
        Assert.assertEquals(1, userDao.delete(1000));
    }

//    @Test
    public void selectById() {
        Assert.assertEquals(null, userDao.selectById(1000));
    }

}