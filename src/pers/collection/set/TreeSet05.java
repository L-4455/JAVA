package pers.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author LiZiHao
 * @Date 2022/07/06/15:16
 */
public class TreeSet05 {
    /*
        排序的第二种方式
        Comparable和Comparator两种比较方法都可以使用.
        在比较规则频繁变化更改时,使用Comparator更好.
        如果比较规则固定不变,那么使用Comparable更好.
     */
    public static void main(String[] args) {
//        第一种方式
        TreeSet<Cat> tree = new TreeSet<>();

        tree.add(new Cat(20));
        tree.add(new Cat(30));
        for (Cat cat : tree) {
            System.out.println(cat);
        }

//        第二种方式
//        使用构造方法给TreeSet传递一个比较器
        TreeSet<Cat> treeSet = new TreeSet<>(new CatComparator());
        treeSet.add(new Cat(200));
        treeSet.add(new Cat(300));
        for (Cat cat : treeSet) {
            System.out.println(cat);
        }

    }
}
class Cat implements Comparable<Cat> {
    int age;

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "猫[" +
                "age=" + age +
                ']';
    }
}

/**
 * Cat的比较器
 */
class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}

