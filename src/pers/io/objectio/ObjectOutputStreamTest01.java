package pers.io.objectio;

import pers.io.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/20:34
 */
public class ObjectOutputStreamTest01 {
    /*
        序列化对象

        NotSerializableException
        Student类无法序列化
        1.一个类想要序列化需要实现Serializable接口,该接口是标识接口
        用来标识一个类的,是给JAVA虚拟机看的,JAVA虚拟机看到这个类被Serializable修饰了就会给这个
        类特殊待遇.会给这个类生成一个序列化版本号

        2.序列化版本号的作用:
            1.一个十年前写的类实现了Serializable接口并且编译了程序生成了序列化版本号.在十年后对这个源程序进行了修改
            修改之后会重新编译程序,此时会重新生成序列化版本号.在对该类进行反编译会报错,是同一个类但是序列化版本号不同
            java虚拟机认为这是两个不同的类.
            2.小明和小红同时写了Student类,类名一样,包名也一样,此时怎么区分这两个类呢?
              JAVA靠的是序列化版本号
            3.同一个类有两个序列化版本号会影响该类的反序列化程序.
            所以序列化版本号的作用:
                在java中区分类的机制:
                    1.以类名来区分,类名不同,类不同.
                    2.类名相同,以序列化版本号区分,序列化不一样,就是两个不同的类,即使类名一样.
             序列化版本号自动生成,这种自动生成的好处是可以区分类.

             但是如果确实是同一个类,在不同的时间对这个类进行了修改,那么如果是自动生成序列化版本号
             JAVA就会认为这是两个不同的类,但实际上确实是同一个类.这就是自动生成序列化版本号的坏处.

             所以一般实现了Serializable接口的类都写一个固定不变且全球唯一的序列化版本号,即使后续对这个代码进行了修改
             也不影响代码的反序列化.

             固定序列化版本号后需要重新序列化一次对象,这样以后在修改源代码,即使不重写序列化也不影响反序列化.

     */
    public static void main(String[] args) {
        Student student = new Student(100, "lisi");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Students"));
            oos.writeObject(student);
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
