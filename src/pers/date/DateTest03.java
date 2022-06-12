package pers.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author LiZiHao
 * @Date 2022/6/12/13:42
 */
public class DateTest03 {
    /*
        通过毫秒构造Date对象
        Date(long date)
        date - 自 1970 年 1 月 1 日 00:00:00 GMT 以来的毫秒数。
        分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
     */
    public static void main(String[] args) throws Exception {

        Date date = new Date(1);
//        Thu Jan 01 08:00:00 CST 1970
//        时间差,北京东8区与厉元标准时间相差8个小时,早8个小时.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String time = sdf.format(date);
        System.out.println(time);

//        求昨天的今天这个时间
        String nowTime = sdf.format(System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 365);
        System.out.println(nowTime);


//        求2022-6-12到2022-9-1之间的天数
        String today = "2022-6-12";
        String future = "2022-9-1";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf1.parse(today);
        Date date2 = sdf1.parse(future);
        System.out.println((date2.getTime() - date1.getTime()) / 1000 / 60 / 60 / 24);
    }
}
