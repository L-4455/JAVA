package pers.reflection;

/**
 * @Author LiZiHao
 * @Date 2022/07/16/20:04
 */
public class User {

    public User() {
        System.out.println("无参数构造方法");
    }

    public User(String s) {
        System.out.println("有参数构造方法" + s);
    }

}
