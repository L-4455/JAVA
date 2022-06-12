package pers.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/18:23
 */
public class DateTest01 {
    /*
        Date日期
        1:获取当前系统日期
        2:Date--->String
        3:String--->Date
        注意:SimpleDateFormat的日期格式要和String类型的日期一致.
     */
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date();
        //Sat Jun 11 18:23:52 CST 2022
        System.out.println(nowTime);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒星期F");
        String s1 = sdf.format(nowTime);
        System.out.println(s1);

//        一个字符串日期怎么转换为Date类型的?
        String time = "2004-11-05 00:00:00:000";
//        SimpleDateFormat sdf1 = new SimpleDateFormat("日期格式不能随便写");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        Date w = sdf1.parse(time);
//        Fri Nov 05 00:00:00 CST 2004
        System.out.println(w);
    }
}
