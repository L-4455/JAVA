package pers.luochen.account;

/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-03-27 22:43:24
 */
public class Account {

    private String accountName;
    private int accountNo;
    private int accountAmount;

    /**
     * 无参构造方法
     */
    public Account() {

    }

    /**
     * 获取账号姓名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置账号姓名
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取账号ID
     */
    public int getAccountNo() {
        int maximum = 100001;
        if (accountNo > maximum) {
            return 0;
        }
        return accountNo;
    }

    /**
     * 设置账号ID
     *
     * @param accountNo
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 获取账号金额
     */
    public int getAccountAmount() {
        return accountAmount;
    }

    /**
     * 设置账号金额
     *
     * @param accountAmount
     */
    public void setAccountAmount(int accountAmount) {
        this.accountAmount = accountAmount;
    }

}
