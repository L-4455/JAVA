package pers.map;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author LiZiHao
 * @Date 2022/7/3/0003/17:34
 */
public class UserTest {
    /*
         HashMap集合必须重写HashCode和equals
     */
    public static void main(String[] args) {
//        因为HashMap要用两个数据,所以这里使用HashSet来演示为什么要重写equals和hashCode

        Set<User> set = new HashSet<>();

        User user = new User("lisi");
        User user1 = new User("lisi");

//        没有重写equals
        System.out.println(user.equals(user1));// false
//        重写equals方法后
        System.out.println(user.equals(user1));// true

//        获取user和user1的哈希值
        System.out.println("哈希值--->" + user.hashCode());
        System.out.println("哈希值--->" + user1.hashCode());

//        添加元素
        set.add(user);
        set.add(user1);

//        获取集合中的元素个数
//        为2
//        但是equals对比了user和user1,返回结果明明是true,也就说这两个明明是相同的,应当看做一个数据,那么为什么集合中会有两个数据呢.
//        HashSet集合底层调用了hashCode和equals,但最先调用的是hashCode,两个对象的hashCode值不同,就说明了数组下标不同,下标不同就
//        就肯定不是同一个单向链表,那么就说明了hashSet底层数组存储了两个数据.所以size方法结果为2
//        这也说明了重写equals方法同时也要重写hashCode方法.
        int i = set.size();
        System.out.println(i);

//        重写hashCode之后
//        1
        System.out.println(set.size());
    }
}
