package pers.luochen.thistest;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-04 22:42:15
 * @LastEditTime: 2022-04-04 23:31:59
 */
public class CustomerTest {
    public static void main(String[] args) {

        /**
         * 测试类
         */
        //在这里就已经有了this关键字的应用
        Customer customer1 = new Customer();
        customer1.name = "zhangsan";
        //调用Customer中没带有static的方法
        customer1.doSome();

        //在这里就已经有了this关键字的应用
        Customer customer2 = new Customer();
        customer2.name = "lisi";
        //调用Customer中没带有static的方法
        customer2.doSome();

        //调用Customer中带有static的方法
        Customer.doOther();

    }

}
