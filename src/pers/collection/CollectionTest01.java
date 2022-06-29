package pers.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author LiZiHao
 * @Date 2022/6/28/15:22
 */
public class CollectionTest01 {
    /*
        collection集合

        collection集合是list和set集合的父接口,collection有的方法他两个也有.
        Collection集合在没有使用泛型之前是可以存放任何Object类的所有子类
        使用泛型之后只能存储具体特定的数据类型.
        集合里无法直接存储基本数类型和java对象,存进去的都是java对象的内存地址.
        即使直接填100也是java使用了自动装箱机制.
        常用方法:
        add(); 向该集合添加一个元素.boolean;
        size(); 返回该集合中元素的个数.int;
        clear(); 清空该集合.void;
        contains(); 判断该集合是否包含指定的元素,是true.boolean
        isEmpty(); 判断该集合是否为空,集合中的元素个数为0.boolean
        remove(); 删除该集合中的指定的元素,如果存在的话.boolean
        toArray(); 讲该集合中的所有元素转换为数组.Object[];


     */
    public static void main(String[] args) {
//        接口无法创建对象,不能实例化.
//        Collection c = new Collection();

//        多态:父类型引用指向子类型对象.
        Collection c = new ArrayList();
//        自动装箱 Integer s = new Integer(100);实际上是把s添加进去了.
        c.add(100);
        c.add(new Object());
        c.add("我爱你");
        c.add(true);
        c.add(3.14);

        int size = c.size();
        System.out.println("元素个数:" + size);
//        清空该元素
        c.clear();
        System.out.println("元素个数:" + c.size());

        c.add("我爱你");
        c.add(false);
        c.add(new String());
        boolean b = c.contains("我爱你");
        System.out.println(b);
        System.out.println(c.contains(false));

//      清空该集合
        c.clear();
//        判断该集合的元素个数是否为空.
//        底层源代码采用的是判断size,size为0就代表了该集合为空.
        boolean b1 = c.isEmpty();
        System.out.println(b1);

        c.add("大傻逼");
        c.add("我是你爹");
        System.out.println(c.size());
//        返回true表示该元素存在且已删除.
        boolean s = c.remove("我是你爹");
        System.out.println(s);
        System.out.println(c.size());

//        toArray();
        c.add("666");
        c.add("2222");
        c.add(new Object());
        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
