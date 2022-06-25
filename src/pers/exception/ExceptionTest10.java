package pers.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/10:05
 */
public class ExceptionTest10 {
    /*
        finally语句
        1、finally语句是和try...catch联用的,不能单独使用。
        2、finally语句是一定会执行的,即使try语句出现了异常,finally也会执行。
        3、finally语句块通常用来释放/关闭某些资源.
     */
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
//            创建输入流
            fileInputStream = new FileInputStream("D:\\我的账户.txt");

            String s1 = "ss";
            s1.toString();

            /*
                关闭输入流,close抛出IOException异常,IO流是占用资源的,不关闭会造成资源消耗.
                思考以下两行代码是否会执行?

                并不会,当s1为空时,调用了toString方法,会出抛出:空指针异常,
                当try里的语句出现了异常会执行匹配的catch语句.所以流的关闭并没有执行.

             */
            /*
            并没有执行
            fileInputStream.close();
            System.out.println("输入流关闭成功");*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            try {
//                fileInputStream可能会new对象失败也可能不会new对象.所以要加判断.
                if (fileInputStream != null) {
//                    避免空指针异常.
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
