package pers.thread.threadsafe1;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/16:31
 */
public class Account {
    /*
        这种没有使用同步机制导致了资金的安全,应当等待线程一次执行完run中的方法才可以继续让其他线程执行
        这样才能保证线程的安全.让线程排队执行
     */
    private String actNo;
    private int actBalance;

    public Account() {
    }

    public Account(String actNo, int actBalance) {
        this.actNo = actNo;
        this.actBalance = actBalance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public int getActBalance() {
        return actBalance;
    }

    public void setActBalance(int actBalance) {
        this.actBalance = actBalance;
    }

    public void Pick(int money) {
        /*
            在这里T1和T2进行了操作,如果T1先进来了,执行了代码,但是代码没有执行完,余额没有来得及更新
            T2就进来了,因为T1已经取走了5000,余额应该是5000,但是没有更新余额,所以T2取的时候余额还是
            10000,这就导致了T1取之后余额5000,T2取之后余额还是5000;这就发生了数据安全问题.

         */
//        取款之前的余额
        int forwardPick = this.getActBalance();
//        取款之后的余额
        int lastPick = forwardPick - money;

//        睡眠一秒,模拟网络延迟.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        更新余额
        this.setActBalance(lastPick);
    }
}
