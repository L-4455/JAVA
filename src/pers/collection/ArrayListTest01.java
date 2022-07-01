package pers.collection;

import java.util.ArrayList;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/10:20
 */
public class ArrayListTest01 {
    /*
        ArrayList常用方法
        构造方法有三个:
        ArrayList()
          构造一个初始容量为 10 的空列表。
        ArrayList(Collection<? extends E> c)
          构造一个包含指定 collection 的元素的列表，
          这些元素是按照该 collection 的迭代器返回它们的顺序排列的。
        ArrayList(int initialCapacity)
          构造一个具有指定初始容量的空列表。

          ArrayList集合底层是数组数据结构
          所以要尽量的少使用自动扩容机制,效率较低.
          数组:检索效率高,随机增删效率低,末尾增删效率不受影响.
          ArrayList扩容机制:
            扩容后的容量是扩容之前的1.5倍.



     */
    public static void main(String[] args) {
//        创建ArrayList集合对象,使用无参构造方法,ArrayList初始默认容量为10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
//        使用有参数构造方法指定集合初始化容量.
        ArrayList arrayList1 = new ArrayList(100);
        arrayList1.add(100);
        arrayList1.add(200);
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        /*
            ArrayList集合满容量满了会自动扩容
            扩容后的容量是扩容之前的1.5倍;
         */
    }
}
