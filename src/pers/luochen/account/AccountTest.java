package pers.luochen.account;

/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-03-27 22:44:41
 */
public class AccountTest {
    public static void main(String[] args) {
        /*
         * 创建"账号"对象
         */
        Account w = new Account();

        /*
         * 设置账号姓名,金额
         */
        w.setAccountName("Jack");
        w.setAccountNo(10010);
        w.setAccountAmount(1111);
        /*
         * 输出账号姓名,Id,金额
         */
        System.out.println("姓名: " + w.getAccountName());
        System.out.println("ID: " + w.getAccountNo());
        System.out.println("余额$: " + w.getAccountAmount());
    }
}
