package pers.reflection.bean;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/16:26
 */
public class Vip {
    private int no;
    private String name;
    private String city;
    private boolean sex;

    public Vip() {
    }

    public Vip(int no, String name, String city, boolean sex) {
        this.no = no;
        this.name = name;
        this.city = city;
        this.sex = sex;
    }

    public Vip(int no, String name, String city) {
        this.no = no;
        this.name = name;
        this.city = city;
    }

    public Vip(int no, String name, boolean sex) {
        this.no = no;
        this.name = name;
        this.sex = sex;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", sex=" + sex +
                '}';
    }
}
