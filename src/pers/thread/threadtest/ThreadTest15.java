package pers.thread.threadtest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author LiZiHao
 * @Date 2022/07/15/9:33
 */
public class ThreadTest15 {
    /*
        定时器的使用
     */
    public static void main(String[] args) throws Exception {
//        创建定时器
        Timer timer = new Timer();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/dd HH:mm:ss");
        Date date = sdf.parse("2022/7/15 10:02:00");
        timer.schedule(new LogFormat(), date, 1000 * 10);
    }
}

class LogFormat extends TimerTask {

    @Override
    public void run() {
//        这里的代码就是要执行的代码
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/M/dd HH:mm:ss");
        Date date = new Date();
        String format = dateFormat.format(date);
        System.out.println(format + "备份数据成功.");
    }
}