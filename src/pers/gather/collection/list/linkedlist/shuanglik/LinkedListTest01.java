package pers.gather.collection.list.linkedlist.shuanglik;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/16:28
 */
public class LinkedListTest01 {
    /*
    LinkedList底层是双向链表数据结构

     */
    public static void main(String[] args) {
//        创建集合对象
        LinkedList LinkedList = new LinkedList();
        LinkedList.add("a");
        LinkedList.add("b");
        LinkedList.add("C");

//        获取迭代器对象
        Iterator it = LinkedList.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
