package com.moutai.nss.web;

import com.moutai.nss.base.BaseController;
import com.moutai.nss.entity.Activity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/6 0:06
 */
@RestController
public class ActivityController extends BaseController {

    @RequestMapping(value = "/activity", method = RequestMethod.POST)
    public void add(Activity activity) {

    }

    @RequestMapping(value = "/activity/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {

    }

    @RequestMapping(value = "/activity/id", method = RequestMethod.PUT)
    public void modify(Activity activity) {

    }

    @RequestMapping(value = "/activity/list", method = RequestMethod.GET)
    public Map<String, Object> listByName(String name) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("list", List<ActivityDTO>);
//        map.put("page", Page);
        return null;
    }

    @RequestMapping(value = "/activity/{id}", method = RequestMethod.GET)
    public Activity detail(@PathVariable("id") Long id) {
        return null;
    }

}
