package pers.io.print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/15:18
 */
public class PrintStreamTest {
    /*
        标准输出流,标椎输出流默认向控制台输出
        标准输出流不需要手动关闭,但要刷新
        通过System的方法可以改变输出方向
     */
    public static void main(String[] args) {
        System.out.println("我爱你");
        PrintStream Ps = System.out;
        Ps.println(100);
        Ps.println(200);
        Ps.println("i love you");

        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("src/pers/io/print/loges.txt"));
            System.setOut(printStream);
//            改变了输出的方向,输出到了log文件
            System.out.println("我草厉害啊");
            System.out.println("我草厉害啊");
            System.out.println("我草厉害啊");
            System.out.println("我草厉害啊");
//            刷新
            printStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
