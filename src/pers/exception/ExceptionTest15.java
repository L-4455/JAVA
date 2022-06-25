package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/16:07
 */
public class ExceptionTest15 extends Exception {
    /*
        java中自定义异常类
        自定义异常类有两部:
        1.异常类需要继承Exception或RuntimeException
        2.提供两个构造方法,有参/String参数的.

        这样自定义异常类就完成了.
     */
    public ExceptionTest15() {

    }

    public ExceptionTest15(String s) {
        super(s);
    }
}
