package pers.reflection.bean;

/**
 * @Author LiZiHao
 * @Date 2022/07/16/20:04
 */
public class User {

    public User() {
    }

    public User(String s) {
        System.out.println("有参数构造方法" + s);
    }

    public void doSome(String no1, String no2) {
        if ("123".equals(no1) && "query".equals(no2)) {
            System.out.println("煞笔");
        } else {
            System.out.println("我是你爹");
        }
    }

}
