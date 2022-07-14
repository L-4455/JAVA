package pers.thread.threadsafe4;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/16:31
 */
public class Account {
    Object obj = new Object(); // 这是一个实例变量,在Account中只有一份.
    /*
        使用同步机制,保证线程一次执行完代码再让其他线程进来.
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

    //    实例方法使用synchronized修饰,对象锁只能是这个this,而且要同步整个代码块.
    public synchronized void Pick(int money) {
        System.out.println("账户编号:" + this.getActNo() + "余额:" + this.getActBalance());
        int forwardPick = this.getActBalance();
        int lastPick = forwardPick - money;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setActBalance(lastPick);
        System.out.println(Thread.currentThread().getName() + "取款" + money + "元," +
                "余额:" + this.getActBalance() + "元");
    }
}
