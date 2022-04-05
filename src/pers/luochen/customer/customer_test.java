package pers.luochen.customer;

/**
 * @author LiZhiHao
 */
public class customer_test {
    public static void main(String[] args) {
        customer q1 = new customer();
        q1.name = "张三";

        q1.shopping();

        customer q2 = new customer();
        q2.name = "李四";

        q2.shopping();
    }
}
