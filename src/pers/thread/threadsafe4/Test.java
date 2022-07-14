package pers.thread.threadsafe4;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/16:44
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account("B00001", 20000);

        Thread t1 = new AccountThread(account);
        Thread t2 = new AccountThread(account);

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
