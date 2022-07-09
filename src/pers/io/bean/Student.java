package pers.io.bean;

import java.io.Serializable;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/20:44
 */
public class Student implements Serializable {
    /*
        NotSerializableException
        Student类无法序列化
        1.一个类想要序列化需要实现Serializable接口,该接口是标识接口
        用来标识一个类的,是给JAVA虚拟机看的,JAVA虚拟机看到这个类被Serializable修饰了就会给这个
        类特殊待遇.会给这个类生成一个序列化版本号
        2.序列化版本号的作用:
     */
    private int no;
    private String name;

    public Student() {

    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
