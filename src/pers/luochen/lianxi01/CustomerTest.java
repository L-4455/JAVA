package pers.luochen.lianxi01;

/**
 * @author LiZhiHao
 * @version v1.0
 * 你看什么看
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer q = new Customer();
        System.out.println("客户信息：");
        q.setName("李四");
        Account w = new Account();
        w.setID(10001);
        w.setBalance(1000);
        w.take(11);
    }
}
