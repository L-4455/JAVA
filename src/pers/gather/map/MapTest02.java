package pers.gather.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author LiZiHao
 * @Date 2022/7/3/0003/11:26
 */
public class MapTest02 {
    /*
        Map集合的遍历
        Set<Map.Entry<K,V>> entrySet()
     */
    public static void main(String[] args) {
//        第一种方式,把Key部分转为Set部分,在迭代Set时通过key部分获取Value部分.
        Map<String, Integer> map = new HashMap<>();

        map.put("lis", 1);
        map.put("ww", 2);
        map.put("zhangsan", 3);

        Set<String> set = map.keySet();
//        使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
//            ss就是Key中的元素
            String ss = it.next();
            Integer integer = map.get(ss);
            System.out.println(ss + "=" + integer);
        }

//      使用foreach
        for (String s : set) {
            System.out.println(s + "=" + map.get(s));
        }
        System.out.println("==================");

//        第二种方式,使用entrySet()方法,把整个map集合转为set集合
        Set<Map.Entry<String, Integer>> entryset = map.entrySet();
//        使用迭代器
        Iterator<Map.Entry<String, Integer>> iterator = entryset.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> ss = iterator.next();
            String key = ss.getKey();
            Integer Value = ss.getValue();
            System.out.println(key + "=" + Value);
        }
        System.out.println("==================");

//        使用foreach
        for (Map.Entry<String, Integer> oo : entryset) {
            System.out.println(oo.getKey() + "==" + oo.getValue());
        }
    }
}
