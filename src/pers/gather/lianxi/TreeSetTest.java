package pers.gather.lianxi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * @Author LiZiHao
 * @Date 2022/07/06/17:39
 */
public class TreeSetTest {
    /*
    1.集合的创建
    2.添加元素
    3.查询元素
    4.遍历集合
     */
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(100);
        integerTreeSet.add(30);
        integerTreeSet.add(300);

//        TreeSet没有下标,不能单独获取某个元素,可以转为List集合在获取

        List<Integer> integerList = new ArrayList<>(integerTreeSet);
        System.out.println(integerList.get(0));
        System.out.println(integerList.get(1));

//        迭代器遍历集合是升序
        Iterator<Integer> iterator = integerTreeSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
//        for循环,一般不使用.
        for (Iterator<Integer> iterator1 = integerTreeSet.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator1);
        }
//        foreach
        for (Integer integer : integerTreeSet) {
            System.out.println(integer);
        }

        TreeSet<Dog> dogs = new TreeSet<>();
        dogs.add(new Dog(20));
        dogs.add(new Dog(300));
        dogs.add(new Dog(11));

        Iterator iterator1 = dogs.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

class Dog implements Comparable<Dog> {
    int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog o) {
//        升序
//        return this.age - o.age;

//        降序
        return o.age - this.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
