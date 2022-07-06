package pers.gather.collection.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/7/2/0002/16:27
 */
public class ForEachTest02 {
    /*
        foreach
     */
    public static void main(String[] args) {
//        创建集合对象
        List<String> stringList = new ArrayList<>();

//        添加元素
        stringList.add("23");
        stringList.add("qwe");
        stringList.add("afd");
        stringList.add("sfa");

//        使用迭代器遍历数组
        Iterator<String> it = stringList.iterator();
        while (it.hasNext()) {
            String a = it.next();
            System.out.println(a);
        }

        System.out.println("=======================");

//        使用for循环遍历集合(只针对有下标的集合)
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("==========================");

//        使用增强for循环遍历集合
        for (String xyz : stringList) {
//            xyz表示为集合中的元素
            System.out.println(xyz);
        }

        System.out.println("==================");


        List<String> myList = new LinkedList<>();
        myList.add("我爱你");
        myList.add("我是你爹");

//        使用迭代器遍历集合
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String o = iterator.next();
            System.out.println(o);
        }

        System.out.println("==================");

//        使用增强for循环遍历集合
        for (String l : myList) {
            System.out.println(l);
        }
    }
}
