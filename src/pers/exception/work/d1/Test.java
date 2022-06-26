package pers.exception.work.d1;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/17:04
 */
public class Test {
    public static void main(String[] args) {
        FinishRegister finishRegister = new FinishRegister();
        try {
            finishRegister.register("123", "1234123123");
        } catch (lengthException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
    }
}
