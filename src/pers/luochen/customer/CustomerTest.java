package pers.luochen.customer;

/**
 * @Author LiZiHao
 * @Date 2022/04/15/14:20
 */
public class CustomerTest {
    public static void main(String[] args) {
        /*
         * 创建customer对象
         */
        Customer customer = new Customer("hhh");

        customer.setName("hangman");
        customer.shopping();
        System.out.println(customer.getName());
    }
}
