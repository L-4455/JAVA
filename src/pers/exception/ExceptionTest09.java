package pers.exception;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author LiZiHao
 * @Date 2022/6/24/21:40
 */
public class ExceptionTest09 {
    /*
        异常常用类
        e.printStackTrack();打印的信息:
        java.io.FileNotFoundException: D:\我2的账户.txt (系统找不到指定的文件。)
            at java.io.FileInputStream.open0(Native Method)
            at java.io.FileInputStream.open(FileInputStream.java:195)
            at java.io.FileInputStream.<init>(FileInputStream.java:138)
            at java.io.FileInputStream.<init>(FileInputStream.java:93)
            at pers.exception.ExceptionTest09.m3(ExceptionTest09.java:42)
            at pers.exception.ExceptionTest09.m2(ExceptionTest09.java:38)
            at pers.exception.ExceptionTest09.m1(ExceptionTest09.java:34)
            at pers.exception.ExceptionTest09.main(ExceptionTest09.java:18)

       异常提示信息要怎么看?
       从上往下看,SUN公司的代码不看,看自己的代码,一般第一行就是直接错误原因.
       42行的错误导致38行错误
       38行错错误导致34行错误
       34行的错误导致18行错误


     */
    public static void main(String[] args) {

        try {
            m1();
        } catch (FileNotFoundException e) {
//            打印异常追踪的堆栈信息
            e.printStackTrace();
//            这行代码不影响执行
            System.out.println("HelloWorld");
        }
        /*
        catch代码的自动生成jetBrains公司有改动.
        try {
            m1();
        } catch (FileNotFoundException e) {
//            老版本生成的代码是
//            e.printStackTrace();
            throw new RuntimeException(e);
        }*/
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("D:\\我2的账户.txt");
    }
}
