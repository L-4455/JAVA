package pers.luochen.访问控制权限.默认的;

import pers.luochen.访问控制权限.User;

/**
 * @Author LiZiHao
 * @Date 2022/5/9/22:52
 */
public class Test04 extends User {
    public static void main(String[] args) {
        User user = new User();
        /*name在访问控制权限.User中不是公共的; 无法从外部程序包中对其进行访问
        System.out.println(user.name);*/

    }
}
