package com.moutai.nss.service.impl;

import com.moutai.nss.base.BaseDao;
import com.moutai.nss.base.BaseService;
import com.moutai.nss.dao.ActivityDao;
import com.moutai.nss.entity.Activity;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.service.ActivityService;
import com.moutai.nss.util.PageUtils;
import com.moutai.nss.web.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/6 23:02
 */
@Service
public class ActivityServiceImpl extends BaseService<Activity> implements ActivityService {

    @Autowired
    private ActivityDao activityDao;

    @Override
    public StatusEnum add(Activity activity) {
        if (isSuperManagement()) {
            return getCUDStatus(getBaseDao().insert(activity));
        } else {
            return StatusEnum.NO_AUTHORITY;
        }
    }

    @Override
    public StatusEnum delete(Long id) {
        if (isSuperManagement()) {
            return getCUDStatus(getBaseDao().delete(id));
        } else {
            return StatusEnum.NO_AUTHORITY;
        }
    }

    @Override
    public StatusEnum modify(Activity activity) {
        if (isSuperManagement()) {
            return getCUDStatus(getBaseDao().update(activity));
        } else {
            return StatusEnum.NO_AUTHORITY;
        }
    }

    @Override
    public Activity queryById(Long id) {
        return getBaseDao().selectById(id);
    }

    @Override
    public Map<String, Object> queryByParams(String name, Page page) {
        if (page.getPageNo() == null) {
            page = new Page(1);
        }
        // 计算总页数
        int count = activityDao.count();
        int pageTotal =  count / page.getPageSize() + (count % page.getPageSize() == 0 ? 0 : 1);
        // 更新总页数
        page.setPageTotal(pageTotal);

        // 根据参数查询分页活动列表
        List<Activity> activities;
        if (name == null || "".equals(name)) {
            activities = activityDao.selectByParams(null, PageUtils.getOffset(page.getPageNo(), page.getPageSize()), page.getPageSize());
        } else {
            activities = activityDao.selectByParams(name, PageUtils.getOffset(page.getPageNo(), page.getPageSize()), page.getPageSize());
        }

        logger.debug("activities: " + activities.toString());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("activities", activities);
        logger.debug("page: " + page.toString());
        map.put("page", page);
        return map;
    }

    @Override
    protected BaseDao<Activity> getBaseDao() {
        return this.activityDao;
    }

}
