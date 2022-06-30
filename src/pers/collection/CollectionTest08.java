package pers.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/6/30/15:54
 */
public class CollectionTest08 {
    /*
        List集合常用的方法
        void add(int index, E element)
        Object get(int index)
        int indexOf(Object o)
        int lastIndexOf(Object o)
        Object set(int index, E element)
        boolean remove(int index)
     */
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        list.add("E");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
        System.out.println("=====================");
//      void add(int index, E element)
//      向指定位置添加元素(效率较低,使用较少)
        list.add(1, "NO");
        ;
        Iterator it1 = list.iterator();
        while (it1.hasNext()) {
            Object a = it1.next();
            System.out.println(a);
        }
        System.out.println("======================");


//        List集合元素有下标,所以List集合有特有的遍历集合方式.
        Iterator iterator = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
//        获取指定位置上的元素
        Object obj = list.get(2);
        System.out.println(obj);

//        判断指定元素在集合中第一次出现的索引
        int i = list.indexOf("E");
        System.out.println(i);

//        判断指定元素最后一次出现的索引
        int a = list.lastIndexOf("D");
        System.out.println(a);

//        修改指定位置上元素的内容
        list.set(3, "我是你爹");
        Object o = list.get(3);
        System.out.println(o);

        System.out.println("-----------------------");

//        删除指定位置上的元素
        list.remove(1);
        Iterator b = list.iterator();
        for (int s = 0; s < list.size(); s++) {
            Object o1 = b.next();
            System.out.println(o1);
        }

    }
}
