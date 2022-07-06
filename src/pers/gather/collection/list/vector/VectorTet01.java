package pers.gather.collection.list.vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/17:55
 */
public class VectorTet01 {
    /*
        Vector底层也是一个数组
        Vector是线程安全的,所以使用较少.
        Vector扩容是2倍
        扩容之后的容量是扩容之前的2倍
        因为Vector中的方法是synchronized修饰的,
        所以Vector是线程安全的所以使用少

        ArrayList:
        是非线程安全的使用较多

        把非线程安全的转为线程安全的,使用Collections提供的方法
     */
    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
//        Vector集合扩容
        vector.add(10);

//      Vector也可以采用这中迭代遍历方式
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }


        List list = new ArrayList();
        list.add(100);
//      转换为线程安全的
        Collections.synchronizedList(list);
    }
}
