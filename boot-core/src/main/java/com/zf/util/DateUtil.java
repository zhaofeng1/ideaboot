package com.zf.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author zhaofeng
 * @Date2019/3/19 15:50
 * @Version V1.0
 **/
public class DateUtil {
    public static final String simplePattern = "yyyy-MM-dd";
    public static final String datePattern = "yyyy-MM-dd HH:mm:ss";

    public static String getDateStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat(datePattern);
        String str = format.format(date);
        return str;
    }
}
