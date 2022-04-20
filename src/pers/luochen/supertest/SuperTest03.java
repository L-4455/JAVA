package pers.luochen.supertest;

/**
 * @Author LiZiHao
 * @Date 2022/04/19/23:27
 */
public class SuperTest03 {
    /*
            super(实际参数);的用法.
     */
    public static void main(String[] args) {
        /*
            想要通过子类的有参数构造方法修改父类中由private修饰的属性要怎么实现?
         */
        Account account1 = new Account();
        System.out.println(account1.getId() + " , " + account1.getBalance());
        Cedit cedit = new Cedit(111, 11111110, 0.99999);
        System.out.println(cedit.getCredibility() + " , " + cedit.getBalance() + " , " + cedit.getId());

    }
}

class Account {
    private int id;
    private double balance;

    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Cedit extends Account {
    /*
            子类特有的属性.
     */
    private double Credibility;

    public Cedit() {

    }

    public Cedit(int id, double balance, double Credibility) {
        /*
            this.id = id;
            this.balance = balance;
            id ,balance 在 pers.luochen.supertest.Account 中是 private 访问控制.
            仔细想,我们在这里调用的就是父类中的有参数构造方法,那么当父类中的属性是私有地,要怎么调用?
            super(实际参数列表);来调用父类中的有参数构造方法.

        */
        super(id, balance);
        this.Credibility = Credibility;
    }

    public double getCredibility() {
        return Credibility;
    }

    public void setCredibility(double credibility) {
        Credibility = credibility;
    }
}
