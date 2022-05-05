package 访问控制权限;

/**
 * @Author LiZiHao
 * @Date 2022/5/9/22:04
 */
public class Test01 {
    public static void main(String[] args) {

        User user = new User();

        /*
        age 在 访问控制权限.User 中是 private 访问控制
        System.out.println(user.age);
        */
        System.out.println(user.id);
        System.out.println(user.weight);
        System.out.println(user.name);
    }
}
