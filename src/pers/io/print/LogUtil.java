package pers.io.print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/15:28
 */
public class LogUtil {
    /*
        记录日志工具类
     */
    public void record(Object obj) {
        try {
//            创建标准输入流
            PrintStream printStream = new PrintStream(new FileOutputStream("src/pers/io/print/Log.txt", true));
//            改变输入方向
            System.setOut(printStream);

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/M/d HH:mm:ss:S");
            String Date = simpleDateFormat.format(date);

//            写入日志
//            System.out.println(Date + obj);

            printStream.println(Date + " " + obj);
//            刷新
            printStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
