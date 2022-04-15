package pers.luochen.supertest;

/**
 * @Author LiZiHao
 * @Date 2022/04/15/13:36
 */
public class Animal {

    private String name;

    public Animal() {
        System.out.println("无参数构造方法");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

