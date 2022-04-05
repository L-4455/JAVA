/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-03-27 22:43:24
 */
package pers.luochen.account;

public class Account {
    private int accountNumber;
    private int accountAmount;


    public Account() {

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountAmount(int accountAmount) {
        this.accountAmount = accountAmount;
    }

    public int getAccountNumber() {
        int maximum = 100001;
        if (accountNumber > maximum) {
            return 0;
        }
        return accountNumber;
    }

    public int getAccountAmount() {
        return accountAmount;
    }

}
