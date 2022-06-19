package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/17/10:33
 */
public class ExceptionTest01 {
    /*
        异常
        什么是异常?
        异常,就是当程序不符合逻辑或者规则时发生的异常.
        比如说除数为0

        异常是类,异常可以创建对象.
     */
    public static void main(String[] args) {
        NullPointerException exception = new NullPointerException("空指针异常");
        System.out.println(exception);
        int a = 10;
        int b = 0;
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at pers.exception.ExceptionTest01.main(ExceptionTest01.java:17)
	    这就是异常信息:提示为除数为0;

         */
//        int c = a / b;
//        System.out.println(c);

    }
}
