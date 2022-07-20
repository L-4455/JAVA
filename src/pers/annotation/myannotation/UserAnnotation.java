package pers.annotation.myannotation;

/**
 * @Author LiZiHao
 * @Date 2022/07/19/22:44
 */
public class UserAnnotation {

    @MyAnnotation01
    private int number;
    @MyAnnotation01
    private String name;
    @MyAnnotation01
    private boolean sex;
    @MyAnnotation01
    private String city;

    @MyAnnotation01
    public UserAnnotation() {

    }

    @MyAnnotation01
    public UserAnnotation(int number, String name, boolean sex, String city) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.city = city;
    }

    @MyAnnotation01
    public static void doSome(int i) {

    }

    @MyAnnotation01
    public void doOther(String name) {
        if ("admin".equals(name)) {
            System.out.println("登陆成功");
        }
    }


    /*
        Override注解是给编译器看的,当编译器看到这个注解时,会插件该注解修饰的方法是否是父类的方法
        凡是被该注解修饰的一般表示为:该方法是重写父类的方法.
     */
    @Override
    public String toString() {
        return "UserAnnotation{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", city='" + city + '\'' +
                '}';
    }
}
