package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/24/21:32
 */
public class ExceptionTest08 {
    /*
        异常常用的两个方法

        //获取异常的简单描述
        e.getMessage();
        //打印异常追踪的堆栈信息
        e.printStackTrace();

     */
    public static void main(String[] args) {
        NullPointerException abc = new NullPointerException("空指针异常");
        String message = abc.getMessage();
        System.out.println(message);

//      这里的信息只是打印出来的,不是程序错误.
        abc.printStackTrace();

//        并不影响这行代码的执行
        System.out.println("Hello World");
    }
}
