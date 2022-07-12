package pers.thread.threadsafe2;

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
        int money = 10000;

        act.Pick(money);


    }
}
