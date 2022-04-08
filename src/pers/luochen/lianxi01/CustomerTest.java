/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-08 19:19:10
 */
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
        w.setId(10001);
        w.setBalance(1000);
        w.take(11);
    }
}
