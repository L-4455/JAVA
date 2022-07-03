package pers.map;

import java.util.*;

/**
 * @Author LiZiHao
 * @Date 2022/7/3/0003/10:40
 */
public class MapTest01 {
    /*
        Map接口常用类
        1.Map与collection没有继承关系.
        2.Map是以Key和Value的键值对存储方式存储数据.
        3.Key和Value存储的都是JAVA对象的内存地址.
        4.所有Map集合的Key部分是一个Set集合,无序不可重复的.
        5.Map接口中常用的方法:
              void clear() 清空map集合
              boolean containsKey(Object key) 判断某个元素是否包含在map集合中的key部分.
              boolean containsValue(Object value) 判断某个元素是否包含在map集合中的value部分.
              V get(Object key) 通过指定的key获取对应的value.
              boolean isEmpty() 判断这个Map集合是否为空.
              Set<K> keySet() 获取所有key元素,返回一个Set集合.key部分就是一个Set集合.
              V put(K key, V value)向集合中添加元素
              V remove(Object key)通过key部分删除这个键值对
              int size() 获取键值对的个数
              Collection<V> values() 获取所有value部分,返回一个Collection类型

              Set<Map.Entry<K,V>> entrySet()把一个Map集合转为Set集合,这个Set集合中的元素类型为:Map.Entry<K,V>
                                                                Map.Entry是一个静态内部接口,是一个完整的接口名

                Map集合 map
                key             value
                ---------------------
                1               "lisi"
                2               "ww"
                3               "333"
                4               "2131"
                调用entrySet方法后Map集合转为一个Set集合
                Set集合
                ---------------------
                1="lisi;
                2="ww"
                3="333"
                4="2131"

                Set集合中的数据类型为Map.Entry<K,V>,K和V的数据类型还要看Map中设定的类型



     */
    public static void main(String[] args) {
//        创建Map集合,指定存储数据类型为:String,Integer
        Map<String, Integer> map = new HashMap<>();

//        添加元素
        map.put("李四", 1);
        map.put("wang", 2);
        map.put("6", 3);
        map.put("hh", 4);

//        获取Key部分,key部分就是一个set集合,遍历set集合.
        Set<String> s = map.keySet();
//        获取迭代器遍历Set集合,输出key部分的内容
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String s1 = it.next();
            System.out.println(s1);
        }
//        使用foreach
        for (String wu : s) {
            System.out.println(wu);
        }
        System.out.println("==========================");
//        获取Value部分
        Collection<Integer> oo = map.values();
//        使用迭代器遍历集合
        Iterator<Integer> iterator = oo.iterator();
        while (iterator.hasNext()) {
            Integer ak = iterator.next();
            System.out.println(ak);
        }
//        使用foreach
        for (Integer ak : oo) {
            System.out.println(ak);
        }


//        判断某个元素是否在key部分内
        boolean flag = map.containsKey("6"); // true
        boolean i = map.containsKey("999"); // false
        System.out.println(flag);
        System.out.println(i);

//        判断某个元素是否在value部分内
        boolean o = map.containsValue(99); // false
        boolean k = map.containsValue(11); // false
        boolean u = map.containsValue(1); // true
        System.out.println(o);
        System.out.println(k);
        System.out.println(u);

//        获取Map集合中兼职对的个数
        int g = map.size();
        System.out.println("键值对个数:" + g);

//      通过key,获取对应的value,如果没有返回null
        Integer n = map.get("2");
        System.out.println(n); // null

        Integer l = map.get("李四");
        System.out.println(l); // 1

//        删除某个键值对
        map.remove("李四");
        System.out.println("键值对个数:" + map.size());

//        清空map集合
        map.clear();

//        判断map集合是否为空.底层调用了size;
        boolean empty = map.isEmpty();
        System.out.println(empty);
    }
}
