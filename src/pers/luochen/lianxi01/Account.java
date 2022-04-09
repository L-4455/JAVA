/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-08 19:19:28
 */
package pers.luochen.lianxi01;

/*
 * 需求：创建一个Account的类，属性有：id，balance
 * */
public class Account {
    private int id;
    private int balance;

    public Account() {

    }

    /*public Account(int id, int balance) {
        this.id = id;
       this.balance = balance;
   }
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("账户" + getId());
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
            System.out.println("本次操作成功" + "\n" + "成功取出：" + number1 + "元");
            //System.out.println("余额："+ balance - number1);
        }
    }

    public void deposit(int number2) {
        balance = number2;
        System.out.println("本次操作成功,存入RMB" + "\n" + number2 + "元");
    }
}


