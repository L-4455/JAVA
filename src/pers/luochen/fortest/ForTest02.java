/**
 * @author: LiZhiHao
 * @Date: 2022-02-25 19:10:04
 * @LastEditTime: 2022-04-06 21:13:12
 */
package pers.luochen.fortest;

import pers.luochen.a.Au;

import java.util.Objects;

/**
 * @author LiZhiHao
 * @date 2022/2/25 19:10
 */
public class ForTest02 {
    static String register = "register" ; static String  login = "login";
    public static void main(String[] args) {
        try (   /*
                 *
                 * for循环登录注册系统
                 * */
        java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            Au.q("请输入\"login\"/\"register\":");
            String logInRegister = scanner.next();

            int account1 = 0;
            int password1 = 0;

            int account2 = 0;
            int password2 = 0;
            //for (; Objects.equals(logInRegister, "login"); ) {
            //System.out.println("登录成功");
            //logInRegister = scanner.next();

            if (Objects.equals(logInRegister, register)) {
                Au.q("请输入账号：");
                account1 = scanner.nextInt();
                Au.q("请输入密码：");
                password1 = scanner.nextInt();
                Au.q("注册成功,请输入登录");

            }
            logInRegister = scanner.next();
            if (Objects.equals(logInRegister, login)) {
                Au.q("请输入账号：");
                account2 = scanner.nextInt();
                Au.q("请输入密码：");
                password2 = scanner.nextInt();
                if (account2 == account1 && password2 == password1) {
                    Au.q("登录成功");
                } else {
                    Au.q("登录失败");
                }
            }
            //}
        }

        /*
        *
        *
        *
        * 以上代码未完成，待学的够多后在继续来完成次项目。
        *
        *
        * */
    }
    
}
