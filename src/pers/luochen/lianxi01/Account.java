package pers.luochen.lianxi01;

/*
 * 需求：创建一个Account的类，属性有：ID，balance
 * */

/**
 * @author LiZhiHao
 */
public class Account {
    private int ID;
    private int balance;

    public Account() {

    }

    /*public Account(int ID, int balance) {
        this.ID = ID;
       this.balance = balance;
   }

     */

   public int getID() {
     return ID;
    }

    public void setID(int ID) {
       this.ID = ID;
        System.out.println("账户" + getID());
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("余额:" + getBalance());
    }

    public void take(int number1) {
        if (balance < number1) {
            System.out.println("你的余额不足,取钱失败");
        } else if (balance > number1) {
            System.out.println("本次操作成功" + "\n" + "成功取出：" + number1 +"元");
            //System.out.println("余额："+ balance - number1);
        }
    }

    public void deposit(int number2) {
        balance = number2;
        System.out.println("本次操作成功，存入RMB" + "\n" + number2 + "元");
    }
}


