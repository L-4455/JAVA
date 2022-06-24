package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/24/15:47
 */
public class ExceptionTest04 {
    /*
        使用try...catch处理异常
     */
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            System.out.println("程序异常");
        }
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("你看啥");
    }
}
