package com.moutai.nss.service;

import com.moutai.nss.entity.Activity;
import com.moutai.nss.enums.StatusEnum;
import com.moutai.nss.web.vo.Page;

import java.util.Map;

/**
 * @Description: 活动业务接口
 * @Auther: LEE
 * @Date: Create in 2018/3/6 0:57
 */
public interface ActivityService {

    StatusEnum add(Activity activity);

    StatusEnum delete(Long id);

    StatusEnum modify(Activity activity);

    Activity queryById(Long id);

    Map<String, Object> queryByParams(String name, Page page);

}
