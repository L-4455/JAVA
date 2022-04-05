/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-03-27 22:44:41
 */

package pers.luochen.account;

public class AccountTest {
    public static void main(String[] args) {
        Account w = new Account();

        w.setAccountAmount(1111);
        w.setAccountNumber(10000);

        System.out.println(w.getAccountNumber());
        System.out.println(w.getAccountAmount());
    }
}
