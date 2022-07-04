package pers.collection.set;

import java.util.TreeSet;

/**
 * @Author LiZiHao
 * @Date 2022/7/4/0004/15:39
 */
public class TreeSetTest02 {
    /*
        1.TreeSet底层是TreeMap
        2.TreeMap底层是二叉树
        3.放在TreeSet中的元素实际上是放到了TreeMap中的key部分了.
        4.TreeSet集合的特点:无序不可重复,但可排序.按照字典升序排序.
     */
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("lisi");
        tr.add("wangwu");
        tr.add("zaoliu");

        for (Object o : tr) {
//            按照字典升序排列
            System.out.println(o);
        }

        TreeSet<Integer> te = new TreeSet<>();
        te.add(100);
        te.add(999);
        te.add(222);
        te.add(333);
        te.add(8388);

        for (Integer integer : te) {
//            按照字典升序排列
            System.out.println(integer);
        }
    }
}
