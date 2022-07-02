package pers.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author LiZiHao
 * @Date 2022/7/2/0002/16:46
 */
public class HashSetTest01 {
    /*
        HashSet集合的特点:
            无序不可重复,
     */
    public static void main(String[] args) {
//        创建集合对象
        Set<String> stringSet = new HashSet<>();
        stringSet.add("1");
        stringSet.add("3");
        stringSet.add("4");
        stringSet.add("5");
        stringSet.add("58");
        stringSet.add("213");
        stringSet.add("213");
        stringSet.add("4");

//        使用增强for循环
        /*
            1
            3
            58
            4
            213
            5
            无序不可重复
        */
        for (String se : stringSet) {
            System.out.println(se);
        }
    }
}
