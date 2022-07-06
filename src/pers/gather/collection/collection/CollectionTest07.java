package pers.gather.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author LiZiHao
 * @Date 2022/6/30/11:25
 */
public class CollectionTest07 {
    /*
        在迭代集合中删除元素
     */
    public static void main(String[] args) {
//        创建集合对象
        Collection ce = new ArrayList();
//        java.util.ConcurrentModificationException
//        获取迭代器,此迭代器指向集合没有任何元素的状态.
//        在迭代器指向一个集合时,会对集合进行快照,如果后续集合结构放生了改变而没有重新获取迭代器
//        那么迭代器就会按照最初的快照进行迭代.在迭代过程中如果集合添加元素了,而之前的快照没有元素,那么next()就会
//        发生异常:java.util.ConcurrentModificationException
//        Iterator it = ce.iterator();

        ce.add(10);
        ce.add(100);
        ce.add(20);
        ce.add(30);

        Iterator it = ce.iterator();
        /*发生异常
        不行,会发生异常,如果集合的结构改变了要重新获取迭代器.
        ce.add(200);*/
        while (it.hasNext()) {
            Object obj = it.next();
/*
            java.util.ConcurrentModificationException
            在迭代集合中删除元素
            发生异常:java.util.ConcurrentModificationException
            使用集合的remove在集合被迭代时删除元素会发生异常.
            ce.remove(obj);
            在获取迭代器后,迭代器对象会对集合进行快照,当集合结构发生了改变而快照没有发生
            且没有重新获取迭代器那么迭代器就会发生异常
            也就是说删除元素时一定要通知迭代器哪个元素被删除了.
            而使用集合的remove方法就很明显没哟通知迭代器说某个元素被删除了.
            所以在集合被迭代时要使用迭代器里的remove方法;
            这样快照里的集合也发生了改变,不会 发生异常了.
            在集合被迭代时删除集合中的元素必须使用迭代器的remove方法
*/
            /*
            迭代器中的remove方法
            是删除迭代器所指向的那个元素.
             */
            it.remove();
            System.out.println(obj);
        }
        System.out.println("集合中元素个数:" + ce.size());
    }
}
