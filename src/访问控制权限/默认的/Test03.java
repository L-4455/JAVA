package 访问控制权限.默认的;

import 访问控制权限.User;

/**
 * @Author LiZiHao
 * @Date 2022/5/9/22:21
 */
public class Test03 {
    public static void main(String[] args) {
        User user = new User();

        /*age 在 访问控制权限.User 中是 private 访问控制
        System.out.println(user.age);*/

        /*id 在 访问控制权限.User 中是 protected 访问控制
        System.out.println(user.id);*/

        System.out.println(user.weight);
        System.out.println(user.weight);
        System.out.println(user.weight);
        /*name在访问控制权限.User中不是公共的; 无法从外部程序包中对其进行访问
        System.out.println(user.name);*/
    }
}
