package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/24/15:57
 */
public class ExceptionTest05 {
    /*
        方法抛出异常
     */
    public static void main(String[] args) {
//        挡掉用的方法抛出了异常,那么调用者需要处理异常.不管是上抛还是捕捉
//        一般main方法不会使用上抛来处理异常,因为main上抛给了JVM,而JVM对于异常的处理只有一种就是终止JVM程序.
        try {
            Monkey();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Monkey() throws ClassNotFoundException {
        System.out.println("程序执行错误");
    }
}
