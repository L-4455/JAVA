package pers.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/15:46
 */
public class ArrayListTest02 {
    /*
         ArrayList(Collection<? extends E> c)
          构造一个包含指定 collection 的元素的列表，
          这些元素是按照该 collection 的迭代器返回它们的顺序排列的。
     */
    public static void main(String[] args) {
        Collection collection = new LinkedList();
        collection.add(100);
        collection.add(200);
        collection.add(300);

//        特殊的构造方法
//        把LinkedList集合转换为ArrayList集合
        ArrayList arrayList = new ArrayList(collection);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
