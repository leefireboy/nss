package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import com.moutai.nss.entity.Activity;
import com.moutai.nss.service.ActivityService;
import com.moutai.nss.web.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Description: 活动控制器
 * @Auther: LEE
 * @Date: Create in 2018/3/6 0:06
 */
@RestController
public class ActivityController extends BaseController {

    @Autowired
    private ActivityService activityService;

    /**
     * 新增活动
     * @param activity 数据
     * @return status user
     */
    @RequestMapping(value = "/activity", method = RequestMethod.POST)
    public ModelAndView add(Activity activity) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("status", activityService.add(activity).getStatusInfo());
        return addBaseAttribute(mv);
    }

    /**
     * 查看活动详情
     * @param id ID
     * @return activity user
     */
    @RequestMapping(value = "/activity/{id}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("activity", activityService.queryById(id));
        return addBaseAttribute(mv);
    }

    /**
     * 删除活动
     * @param id ID
     * @return status user
     */
    @RequestMapping(value = "/activity/{id}", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("status", activityService.delete(id).getStatusInfo());
        return addBaseAttribute(mv);
    }

    /**
     * 修改活动
     * @param activity 数据
     * @return status user
     */
    @RequestMapping(value = "/activity/id", method = RequestMethod.PUT)
    public ModelAndView modify(Activity activity) {
        ModelAndView mv = new ModelAndView("");
        mv.addObject("status", activityService.modify(activity).getStatusInfo());
        return addBaseAttribute(mv);
    }

    /**
     * 查询活动分页列表
     * @param name 活动名
     * @param page 页面数据
     * @return list page user
     */
    @RequestMapping(value = "/activity/list", method = RequestMethod.GET)
    public ModelAndView listByName(String name, Page page) {
        ModelAndView mv = new ModelAndView("index");
        Map<String, Object> map = activityService.queryByParams(name, page);
        mv.addObject("list", map.get("activities"));
        mv.addObject("page", map.get("page"));
        return addBaseAttribute(mv);
    }

}
