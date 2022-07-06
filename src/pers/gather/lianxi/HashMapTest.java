package pers.gather.lianxi;

import java.util.*;

/**
 * @Author LiZiHao
 * @Date 2022/07/06/17:53
 */
public class HashMapTest {
    /*
    1.集合的创建
    2.添加元素
    3.查询元素
    4.遍历集合
    */
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("lisi", 10);
        hashMap.put("wang", 20);
        hashMap.put("hhh", 30);

        System.out.println(hashMap.get("lisi"));
        System.out.println(hashMap.get("wang"));
        System.out.println(hashMap.get("hhh"));

//        遍历集合第一种方式,把集合key部分转为set集合,遍历set集合时候通过key取到value
        Set<String> set = hashMap.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next + "=" + hashMap.get(next));
        }
        for (String s : set) {
            System.out.println(s + "=" + hashMap.get(s));
        }

//        第二种方式,把整个map集合转为set集合
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();

//        迭代器遍历
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
//            System.out.println("----->"+next.getKey() + "=" + next.getValue());
            System.out.println("----->" + next);

        }
//        foreach遍历
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println(stringIntegerEntry);
        }

        HashMap<Vip, SVip> vipHashMap = new HashMap<>();

        vipHashMap.put(new Vip(10), new SVip(30));
        vipHashMap.put(new Vip(20), new SVip(40));

        Set<Vip> vipSet = vipHashMap.keySet();
        for (Vip vip : vipSet) {
            System.out.println(vip + "" + vipHashMap.get(vip));
        }

        Set<Map.Entry<Vip, SVip>> entrySet1 = vipHashMap.entrySet();
        for (Map.Entry<Vip, SVip> entry : entrySet1) {
            System.out.println(entry);
        }
    }
}

class Vip {
    int no;

    public Vip(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vip vip = (Vip) o;
        return no == vip.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}

class SVip {
    int no;

    public SVip(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "SVip{" +
                "no=" + no +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SVip sVip = (SVip) o;
        return no == sVip.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}

