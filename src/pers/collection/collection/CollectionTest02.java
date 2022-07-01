package pers.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author LiZiHao
 * @Date 2022/6/28/15:56
 */
public class CollectionTest02 {
    /*
        iterator方法专题

        iterator是Collection中的一个方法,该方法是迭代器.用来迭代集合/遍历集合.
        iterator的返回值是Iterator
        Iterator是接口
        Iterator中有三个方法:
        hasNext();
        next();
        remove();
     */
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        collection.add("我爱你");
        collection.add("我是你爹");
        collection.add("7777");
        collection.add(new Object());
        collection.add(new Student());

//        迭代集合步骤:
//        获取集合的迭代器
        Iterator it = collection.iterator();


        while (it.hasNext()) {
            /*合并
            Object next = it.next();
            System.out.println(next);*/
            System.out.println(it.next());
        }
//        调用迭代器中的方法
        /*使用循环
        boolean flag = it.hasNext();
        if(flag){
            System.out.println(it.next());
        }

        if(flag){
            System.out.println(it.next());
        }
        if(flag){
            System.out.println(it.next());
        }*/

        /*异常,没有更多的元素可迭代.
        if(flag){
            System.out.println(it.next());
        }*/
    }
}

class Student {
    @Override
    public String toString() {
        return "Student";
    }
}
