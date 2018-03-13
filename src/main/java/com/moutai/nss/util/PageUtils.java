package com.moutai.nss.util;

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

}
