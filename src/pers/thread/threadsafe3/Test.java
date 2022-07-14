package pers.thread.threadsafe3;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/16:44
 */
public class Test {
    public static void main(String[] args) {
//        在run方法中使用synchronized也是可以的.
        Account account = new Account("A100001", 20000);

        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
