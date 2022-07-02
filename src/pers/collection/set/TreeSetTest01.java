package pers.collection.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author LiZiHao
 * @Date 2022/7/2/0002/16:50
 */
public class TreeSetTest01 {
    /*
        TressSet集合

        无序不可重复,但可排序.

        无序:存进集合的顺序和取出来的顺序不一样,集合元素没有下标.
        取出来的数据会按从小到大顺序排序
     */
    public static void main(String[] args) {
//        创建集合对象
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(555);
        set.add(11);
        set.add(20);
        set.add(20);
        set.add(20);
        /*
            11
            20
            100
            200
            300
            555
            按从小到大顺序排序
         */
        for (Integer it : set) {
            System.out.println(it);
        }
    }
}
