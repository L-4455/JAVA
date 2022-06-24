package pers.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author LiZiHao
 * @Date 2022/6/24/15:50
 */
public class ExceptionTest06 {
    /*
        throws和try...catch的联合使用.
     */
    /*
            当文件路径正确且文件存在时执行结果为:
            main begin
            m1 begin
            m2 begin
            m2 over
            m1 over
            main over
            当文件路径错误或文件不存在时执行结果为:
            main begin
            m1 begin
            m2 begin
            文件不存在或文件路径错误
            main over

        总结:如果程序发生异常且使用的是throws来处理的那么出现异常的那行代码后的程序就不会再执行,
            try...catch则不同,try...catch是捕捉异常并处理异常,不会影响到后面的代码执行.

           像这种多个方法依次调用而最后一个方法出现了异常,那么会直接调到第一个调用者,执行代码且后面的不会执行.
     */
    public static void main(String[] args) {
        System.out.println("main begin");
//      m1调用了m2,m2抛出了FileNotFoundException异常,所以m1需要对该异常进行处理.
//      因为main方法通常不使用throws来处理异常,适合使用try...catch来处理更为合适.
        try {
            m1();
            System.out.println("文件读取成功");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在或文件路径错误");
        }
        System.out.println("main over");
    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
//      同样的m1调用了m2,而m2抛出了FileNotFoundException异常
//      m1也需要对该异常进行处理.
        m2();
        System.out.println("m1 over");
    }

    public static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
//        因为m3抛出了FileNotFoundException异常,所以调用者需要对该异常进行处理.
//        不管是抛出也好还是try也好,都可以.
        m3();
        System.out.println("m2 over");
    }

    public static void m3() throws FileNotFoundException {
//        Unhandled exception: java.io.FileNotFoundExceptions;
//        FileInputStream构造方法抛出了FileNotFoundException异常,所以调用者也要处理该异常,否者报错.
//        该异常为编译时异常,不处理就会报错.
        new FileInputStream("D:\\我的账户.txt");
    }
}
