package pers.collection.set;

import java.util.TreeSet;

/**
 * @Author LiZiHao
 * @Date 2022/7/4/0004/16:47
 */
public class TreeSetTest04 {
    /*
        练习
        先按照年龄升序排列,如果年龄相同,那么按照名字升序排列
     */
    public static void main(String[] args) {
//        创建集合对象
        TreeSet<Vip> trees = new TreeSet<>();

//        创建Vip对象
        Vip vip1 = new Vip(678, "lisi");
        Vip vip2 = new Vip(123, "wang");
        Vip vip3 = new Vip(300, "wo");
        Vip vip4 = new Vip(678, "chihuahua");
        /*
            先是按照年龄升序排序,年龄相同时在按照名字升序排序.
            vip4和vip1年龄相同时,但是在字典中c在l前,所以vip4在vip1前面
         */

//        添加元素
        trees.add(vip1);
        trees.add(vip2);
        trees.add(vip3);
        trees.add(vip4);

        for (Vip vip : trees) {
            System.out.println(vip);

        }


    }
}

class Vip implements Comparable<Vip> {
    private final int age;
    private final String name;

    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Vip o) {
        if (this.age == o.age) {
//            如果年龄相同,按照名字升序排序
//            name是String类型,调用String的compareTo方法就行
            return this.name.compareTo(o.name);
        } else {
//            这里也可以调用Integer中的compareTo方法
//            return this.age - o.age;
            return Integer.compare(this.age - o.age, 0);
        }
    }

    @Override
    public String toString() {
        return "Vip[" +
                "age=" + age +
                ", name=\"" + name + '\"' +
                ']';
    }
}
