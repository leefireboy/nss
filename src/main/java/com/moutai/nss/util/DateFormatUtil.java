package com.moutai.nss.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/3/17 11:27
 */
public class DateFormatUtil {

    private final static Logger logger = LoggerFactory.getLogger(DateFormatUtil.class);

    /*
     * yyyyMMddHHmm格式format
     */
    public static String formatYYYYMMddHHMM(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        return sdf.format(date);
    }

    /*
     * yyyy-MM-dd HH:mm:ss格式format
     */
    public static String formatYYYYMMddHHMMSS(Date date) {
        if(date == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /*
     * yyyyMMddHHmm格式parse
     */
    public static Date parse(String dateStr, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateStr);
    }

    /*
     * yyyyMMddHHmm格式parse
     */
    public static Date parseYYYYMMddHHMM(String dateStr) throws ParseException {
        return parse(dateStr, "yyyyMMddHHmm");
    }

    /**
     * yyyyMMddHH格式parse
     *
     * @throws ParseException
     */
    public static Date parseYYYYMMddHH(String dateStr) throws ParseException {
        return parse(dateStr, "yyyyMMddHH");
    }


    /*
     * yyyy-MM-dd格式parse
     */
    public static Date parseYYYY_MM_dd(String dateStr) throws ParseException {
        return parse(dateStr, "yyyy-MM-dd");
    }

    /**
     * yyyyMMdd格式parse
     */
    public static Date parseYYYYMMdd(String dateStr) throws ParseException {
        return parse(dateStr, "yyyyMMdd");
    }


    public static Date getDateByFormat(String date, String format) {
        SimpleDateFormat sf = new SimpleDateFormat(format);
        Date result = null;
        try {
            result = sf.parse(date);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }

}
