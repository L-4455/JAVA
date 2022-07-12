package pers.thread.threadsafe1;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/16:43
 */
public class AccountThread extends Thread {
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    //    两个线程操作一个账户
    public void run() {
//        取钱
        int money = 5000;

        act.Pick(money);

        System.out.println(Thread.currentThread().getName() + "取款" + money + "元" +
                "余额:" + act.getActBalance());
    }
}
