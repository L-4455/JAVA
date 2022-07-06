package pers.gather.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/07/06/16:00
 */
public class CollectionsTest {
    /*
        集合工具类
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        把list集合转为线程安全的
        Collections.synchronizedList(list);

        list.add("123");
        list.add("200");
        list.add("2000");
        list.add("21312");
//        对list集合进行排序,升序.
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

//        对自定义类进行使用short排序
        List<Monkey> list1 = new ArrayList<>();
        list1.add(new Monkey(10));
        list1.add(new Monkey(30));
        list1.add(new Monkey(5));

//        编译报错,不符合类型.Monkey没有实现Comparable接口
//        Collections.sort(list1);
//        凡是自定义类型要进行排序,都要实现Comparable接口.
        Collections.sort(list1);
        for (Monkey monkey : list1) {
            System.out.println(monkey);
        }
//      sort也可以使用比较器。
//      可以使用匿名内部类
//        Collections.sort(list1, new MonkeyComparator());
        Collections.sort(list1, new Comparator<Monkey>() {
            @Override
            public int compare(Monkey o1, Monkey o2) {
                return o1.age - o2.age;
            }
        });
        for (Monkey monkey : list1) {
            System.out.println(monkey);
        }
    }
}

class Monkey implements Comparable<Monkey> {
    int age;

    public Monkey(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Monkey o) {
        return this.age - o.age;
    }
}

class MonkeyComparator implements Comparator<Monkey> {
    @Override
    public int compare(Monkey o1, Monkey o2) {
        return o2.age - o1.age;
    }
}