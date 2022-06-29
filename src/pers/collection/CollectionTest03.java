package pers.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author LiZiHao
 * @Date 2022/6/29/15:43
 */
public class CollectionTest03 {
    /*
        迭代器/遍历
     */
    public static void main(String[] args) {
//        创建集合
        Collection c1 = new ArrayList();
        c1.add(100);
        c1.add(200);
        c1.add(300);
        c1.add(400);
        c1.add(100);

//        获取迭代器对象
        Iterator it = c1.iterator();

//        迭代集合
//        先判断在取值
//        ArrayList集合的元素是有序的可重复的.
//        有序:存进去和取出来的顺序相同.可以存放相同的元素
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("******************************");
//        创建集合对象
        Collection collection = new HashSet();
        collection.add(1);
        collection.add(20);
        collection.add(32);
        collection.add(43);
        collection.add(5);
        collection.add(5);

//        获取迭代器
        Iterator iterator = collection.iterator();
//        迭代集合
        //        HashSet集合是无序不可重复的
        //        无序:存进去和取出来的顺序不一定相同.不可以存放相同的元素,如果存放了只会取出一个,不会报错.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
