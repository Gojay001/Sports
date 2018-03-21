package xin.gojay.nmid.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author Gojay
 * @date 2018/3/6
 */
public class TimeUtil {
    /**
     * 获取当前日期
     * @return "yyyy-MM-dd"日期
     */
    public static String getNowDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }
}
