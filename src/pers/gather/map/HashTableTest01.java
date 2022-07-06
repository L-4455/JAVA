package pers.gather.map;

import java.util.Hashtable;

/**
 * @Author LiZiHao
 * @Date 2022/7/4/0004/11:15
 */
public class HashTableTest01 {
    /*
        hashTable集合

        1.hashTable集合的key部分和value部分都不能为空
        2.hashTable底层也是哈希表数据额结构
        3.初始化默认容量为11,加载因子为0.75.
        4.扩容:
            原容量 * 2 + 1 就是新容量.
        5.由于hashtable的方法都是由synchronized修饰的,是线程安全的.
            现在控制线程安全的方式有很多,所以hashtable使用较少.
        6.hashtable的key和value部分不能为null值.
     */
    public static void main(String[] args) {
        Hashtable hashTable = new Hashtable();
//        发生异常,value不为空
//        hashTable.put(null,null);
        System.out.println(hashTable.size());

        hashTable.put(null, 100);
//        空指针异常,key为null的话,没法调用key的hashCode方法.
        System.out.println(hashTable.size());

    }
}
