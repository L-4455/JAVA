package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/18/22:30
 */
public class ExceptionTest02 {
    /*
        输入new出来的对象
     */
    public static void main(String[] args) {

        // 创建空指针异常
        NullPointerException npe = new NullPointerException();
        /*
        NullPointerException继承RuntimeException继承Throwable
        Throwable重写了toString
         */
        System.out.println(npe.toString());

        //创建数组下标越界异常
        ArrayIndexOutOfBoundsException abc = new ArrayIndexOutOfBoundsException();
        System.out.println(abc.toString());
    }
}
