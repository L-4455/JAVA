package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/24/15:19
 */
public class ExceptionTest03 {
    /*
        异常的处理方式有两种
        1:在方法声明的位置上使用throws来抛出异常.
        2:使用try...catch捕捉异常.
     */
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            为什么会报错?
            因为sum方法抛出了ClassNotFoundException异常,该异常为编译时异常
            编译时异常需要程序编写时进行处理,如果不处理就无法编译程序就会报错.
            可以再调用者的方法位置上抛出异常,也可以使用tyr...catch来捕捉异常.
         */
        sum();

    }

    public static void sum() throws ClassNotFoundException {
        System.out.println("66");
    }
}
