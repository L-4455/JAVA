package pers.gather.collection.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author LiZiHao
 * @Date 2022/6/29/16:44
 */
public class CollectionTest04 {
    /*
        Collection中的contains方法深入
     */
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);

        String a = new String("abc");
        /*
        分析结果是true/false
        结果:true
        解析:contains判断集合中是否有指定的元素使用的是equals方式判断,ArrayList类重写了equals
        所以在使用c调用contains相当于调用了c.equals.equals是比较对象的内容,而不是地址,所以即使new了两次
        "abc",在集合中比较的不是内存地址而是对象的内容.
        c.contains(a);相当于:
        a.equals(elementData[i]);
        期中elementData[i]就是集合中的元素.如果equals返回了true就等于集合中有a引用所保存的内容,如果返回false就表示没有.
        在上述代码中a引用保存了"abc"的内存地址,c集合里保存了s1的内存地址,而s1保存的内存地址指向了"abc".
        即使集合里没有保存a的内存地址,但也不影响判断,因为contains判断的肯本就不是内存地址而是内存地址所指向的内容.
        所以当c使用contains判断a是否存在集合中,当然返回true了.
        因为contains判断是否存在使用的是equals而不是==.
        */
        System.out.println(c.contains(a));

    }
}
