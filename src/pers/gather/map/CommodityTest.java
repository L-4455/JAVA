package pers.gather.map;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author LiZiHao
 * @Date 2022/7/3/0003/18:10
 */
class CommodityTest {
    public static void main(String[] args) {
//        创建对象
        Map<Commodity, Integer> map = new HashMap<>();

        Commodity c = new Commodity(101, "冰激凌");
        Commodity c1 = new Commodity(201, "雪花酪");

//        equals判断不一样
        System.out.println(c.equals(c1));

//        哈希值不一样
        System.out.println(c.hashCode());
        System.out.println(c1.hashCode());


//      添加元素
        map.put(c, 1);
        map.put(c1, 2);
//      集合中元素个数:2
        System.out.println(map.size());
    }
}