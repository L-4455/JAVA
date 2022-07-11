package pers.io.bean;

import java.io.Serializable;

/**
 * @Author LiZiHao
 * @Date 2022/07/10/10:34
 */
public class User implements Serializable {
    //    快捷键生成的.
    private static final long serialVersionUID = 1638192099231484160L;
    /*
    NotSerializableException: pers.io.bean.User
     */
//    IDEA生成序列化版本号

    //    手动的
//    private final static long serialVersionUID = 4759735789327658932L;
    private int no;
    //    transient表示为游离的,不参加序列化操作.
    private transient String name;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
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
}
