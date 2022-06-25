package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/16:13
 */
public class ExceptionTest16 {
    public static void main(String[] args) {
//        使用自定义的异常类
        ExceptionTest15 test15 = new ExceptionTest15("异常了异常了..跑路吧");
        System.out.println(test15.getMessage());
    }
}
