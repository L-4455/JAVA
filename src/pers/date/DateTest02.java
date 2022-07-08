package pers.date;

import java.util.Date;

/**
 * @Author LiZiHao
 * @Date 2022/6/12/13:13
 */
public class DateTest02 {
    /*
        System.currentTimeMillis
        自1970-1-1 0:0:0:000到当前系统日期之间的毫秒数总和
     */
    public static void main(String[] args) {
        Date date = new Date();
        long w = System.currentTimeMillis();
//        1655011564902
        System.out.println(w);

//        记录开始时间
        long begin = System.currentTimeMillis();
        Monkey();
//        记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - begin) + "ms");

    }

    //        需求:输出一个方法的执行所耗时的时间
    public static void Monkey() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }
}
