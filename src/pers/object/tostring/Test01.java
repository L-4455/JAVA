package pers.object.tostring;

/**
 * @Author LiZiHao
 * @Date 2022/5/9/23:22
 */
public class Test01 {
    private int age;
    private String name;

    public Test01() {

    }

    public Test01(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String name() {
        return name;
    }

    //重写toString方法.
    public String toString() {
        return this.name;
    }
}
