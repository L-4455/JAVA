package pers.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author LiZiHao
 * @Date 2022/6/29/22:30
 */
public class CollectionTest06 {
    /*
        Collection中的remove方法;
        remove方法是否调用了equals
        调用了
        总结:在自定义类添加到集合里时,要重写remove;
     */
    public static void main(String[] args) {
//        创建集合对象
        Collection collection = new ArrayList();
        String s = new String("123");
        collection.add(s);
//        输出集合中元素的个数
        System.out.println("删除元素之前元素个数:" + collection.size());
//        创建String对象
        String s1 = new String("123");
//        删除s1对象,s1对象并不在集合里,为什么删除s1集合里的s也被删除了.
//        因为remove调用了equals来判断要删除的元素是否在集合里,equals判断的是内容而不是内存地址
//        虽然s和s1的内存地址不同,但是内容相同,所以JVM认为s和s1相同,所以删除了s1就等于删除了s
        collection.remove(s1);
        System.out.println("删除元素之后元素个数:" + collection.size());

//      创建集合对象
        Collection c = new ArrayList();
//      创建Monkey对象
        Monkey monkey = new Monkey("jack");
        c.add(monkey);
//        输出集合中元素的个数
        System.out.println("删除元素之前元素个数:" + c.size());

//      创建Monkey对象
        Monkey a = new Monkey("jack");
//        删除a对象
//        删除a对象为什么集合里的monkey对象也没了?
        /*
            在Monkey没有重写equals情况下,删除a对象并不会删除集合里的monkey对象.
            因为没有重写equals的话remove调用了Object的equals,Object的equals判断的是对象的内存地址,
            a和monkey都是new出来的,所以内存地址不同.
            但当调用remove的类重写了equals,那么remove就会调用重写后的equals,
            重写equals后肯定判断的是对象的内容而不是内存地址.所以
            当重写equals后,把a对象删除了,就等于把集合里的monkey删除了.
            因为equals判断的是对象的内容,当集合调用remove删除a时,a中保存的内容是jack
            而集合使用equals判断后发现集合里也有jack这个元素,所以就认为集合里这个元素monkey和a这个数据是相同的
            所以把a删除了就等于把集合里的monkey删除了.
         */
        c.remove(a);
        System.out.println("删除元素之后元素个数:" + c.size());


    }
}

class Monkey {
    private String name;

    public Monkey() {
    }

    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Monkey)) return false;
        if (o == this) return true;
        Monkey m = (Monkey) o;
        return m.name.equals(this.name);
    }
}
