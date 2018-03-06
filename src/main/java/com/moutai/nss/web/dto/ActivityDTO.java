package com.moutai.nss.web.dto;

import java.util.Date;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/6 0:12
 */
public class ActivityDTO {

    private Long id;

    private String name;

    private Date startTime;

    private Date endTime;

    // 0:无效 1:有效
    private Integer status;

}
