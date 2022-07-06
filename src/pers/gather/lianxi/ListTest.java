package pers.gather.lianxi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/07/06/17:29
 */
public class ListTest {
    /*
        1.集合的创建
        2.添加元素
        3.查询元素
        4.遍历集合
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("bcd");
        list.add("cad");

//        通过下标获取元素
        String s1 = list.get(0);
        System.out.println(s1);

        String s2 = list.get(2);
        System.out.println(s2);

//        迭代器遍历集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

//        for循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        foreach遍历集合
        for (String s : list) {
            System.out.println(s);
        }

        List<Love> loveList = new ArrayList<>();
        loveList.add(new Love(20));
        loveList.add(new Love(10));

        System.out.println(loveList.get(0));

        for (Love love : loveList) {
            System.out.println(love);
        }
    }
}

class Love {
    int age;

    public Love(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Love{" +
                "age=" + age +
                '}';
    }
}
