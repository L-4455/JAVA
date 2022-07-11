package pers.io.objectio;

import pers.io.bean.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/07/10/10:32
 */
public class ObjectOutputStreamTest02 {
    /*
        序列化多个对象,把对象放到一个集合中,序列化集合就可以了.
        序列化集合,集合中保存的对象需要实现Serializable接口.

        如果不想要某个属性被序列化,要使用transient关键字对属性进行修饰
     */
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(100, "lisi"));
        userList.add(new User(201, "zs"));
        userList.add(new User(301, "ww"));
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Users"));
            oos.writeObject(userList);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
