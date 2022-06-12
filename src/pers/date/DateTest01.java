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
     */
    public static void main(String[] args) {
        Date nowTime = new Date();
        //Sat Jun 11 18:23:52 CST 2022
        System.out.println(nowTime);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒星期F");
        String s1 = sdf.format(nowTime);
        System.out.println(s1);

    }
}
