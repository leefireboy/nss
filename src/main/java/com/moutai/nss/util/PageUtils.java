package com.moutai.nss.util;

import static com.moutai.nss.web.vo.Page.DEFAULT_PAGE_NO;

/**
 * @Description: 分页工具类
 * @Auther: LEE
 * @Date: Create in 2018/3/8 8:54
 */
public class PageUtils {

    /**
     * 计算分页偏移量
     * @param pageNo
     * @param pageSize
     * @return
     */
    public static int getOffset(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize + 1;
    }


    /**
     *
     * @param count
     * @return
     */
    public static int getPageTotal(int count) {
        return count / DEFAULT_PAGE_NO + (count % DEFAULT_PAGE_NO == 0 ? 0 : 1);
    }

}
