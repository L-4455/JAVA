package pers.io.bean;

import java.io.Serializable;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/20:44
 */
public class Student implements Serializable {

    /*
      java会自动在这里提供一个序列化本号,一般不采用
      一般要手动写一个固定不变且全球唯一的序列化本号
      序列化版本号固定了,即使后续对程序修改了,也不影响反序列化
     */
    private static final long serialVersionUID = 1L;

    private int no;
//    private String name;

    private String city;

    private int age;

    private int shenGao;

    public Student() {

    }

    public Student(int no, String name) {
        this.no = no;
//        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    /*public String getName() {
        return name;
    }*/

 /*   public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", shenGao=" + shenGao +
                '}';
    }
}
