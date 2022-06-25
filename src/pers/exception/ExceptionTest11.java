package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/10:31
 */
public class ExceptionTest11 {
    /*
        finally语句

        finally语句可以和try联用
     */
    public static void main(String[] args) {
        try {
            System.out.println("try....");
            /*
                return语句会执行,finally语句也会执行.
                在try中遇到return语句,JVM会检查try语句块中是否跟着finally语句
                如果有就跳过return语句块去执行finally,直到finally语句执行完毕再去执行return语句.
                JAVA规则:
                    return语句一定是最后一个执行且return语句一旦执行整个程序结束.(亘古不变)
             */
            return;
        } finally {
            System.out.println("finally...");
        }
    }
}
