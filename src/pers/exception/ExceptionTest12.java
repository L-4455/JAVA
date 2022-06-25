package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/10:39
 */
public class ExceptionTest12 {
    /*
        谁能终结finally语句块的执行?

        退出JVM.
     */
    public static void main(String[] args) {
        try {
            System.out.println("你好啊");
//            一旦这行代码执行,整个JVM结束,finally语句不会执行.
            System.exit(0);
        } finally {
            System.out.println("Hello,finally");
        }
    }
}
