package pers.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/14:24
 */
public class ExceptionTest14 {
    /*
        final finally finalize的区别

        1.final修饰的变量不可重新赋值
        2.final修饰的类不能被继承
        3.final修饰的方法不能被重写.

        finally和try联用,finally中的语句一定会被执行.

        finalize由垃圾回收器GC调用,负责回收一些空引用,垃圾代码.

     */
    public static void main(String[] args) {
        final int i = 100;
//        i = 200; final修饰的变量不能重新赋值.


//        finally和try联用,finally中的语句块一定会执行.
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\我的账户.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//          finalize由垃圾回收器调用.
        }
    }
}
