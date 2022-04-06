/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-06 18:24:20
 */
/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-06 18:22:47
 */
package pers.luochen.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer q1 = new Customer();
        q1.name = "张三";

        q1.shopping();

        Customer q2 = new Customer();
        q2.name = "李四";

        q2.shopping();
    }
}
