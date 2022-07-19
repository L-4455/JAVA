package pers.annotation;

/**
 * @Author LiZiHao
 * @Date 2022/07/19/22:44
 */
public class UserAnnotation {

    @MyAnnotation
    private int number;
    @MyAnnotation
    private String name;
    @MyAnnotation
    private boolean sex;
    @MyAnnotation
    private String city;

    @MyAnnotation
    public UserAnnotation() {

    }

    @MyAnnotation
    public UserAnnotation(int number, String name, boolean sex, String city) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.city = city;
    }

    @MyAnnotation
    public static void doSome(int i) {

    }

    @MyAnnotation
    public void doOther(String name) {
        if ("admin".equals(name)) {
            System.out.println("登陆成功");
        }
    }
}
