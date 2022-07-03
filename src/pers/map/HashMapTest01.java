package pers.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author LiZiHao
 * @Date 2022/7/3/0003/15:54
 */
public class HashMapTest01 {
    /*
        HashMap底层是一个哈希表/散列表数据结构
        1、哈希表底层是数组加单向链表。
        2、数组中的每一个元素是一个node节点,该节点中有4个属性：
            hash值
            key
            value
            next下一个node的内存地址.
        3、因为哈希表是数组加单项链表,
            数组:查询效率高,随机增删效率低;
            单向链表:随机增删效率高,查询效率低.
        4、哈希表使用得当可以发挥出数组和单向链表的各个优点.
        5、hashMap集合key部分的特点:
            无序不可重复
            无序:因为存储不一定在哪个单向链表上.
            不可重复:equals来保证数据不重复,如果key重复了会覆盖value
            方在hashMap集合key部分的元素其实就是方到了hashSet集合中了
            所以hashSet集合也要同时重写equals和hashCode.
        6、hashCode返回值不能固定,因为这样会导致所有node节点在同一个单向链表中,
            这就成了纯单向链表.这种情况为:散列分布不均匀
        7、hashCode返回值不能全部不一样,因为这样会导致所有node节点方法到了数组中
            这就成了纯数组,这种情况称为:散列分布不均匀
        8、散列分布均匀：
            100个数据,就分10个单向链表,一个单向链表上有10个数据,这就是散列分布均匀。
            散列分布均匀需要同时重写hashCode和equals.
        9、HashMap默认初始化容量是16,默认加载因子是0.75
            默认加载因子是:当HashMap底层数组容量达到满容量的百分之75时开始扩容.
            he default initial capacity - MUST be a power of two
            HashMap初始化容量最好是2的倍数,这是官方推荐的
            因为2的倍数更容易散列分布均匀.提高存取的效率
     */
    public static void main(String[] args) {
//        创建map集合
        Map<String, Integer> map = new HashMap<>();

        map.put("lisi", 123123);
        map.put("hangman", 567);
//        重复key,会自动覆盖value
        map.put("wang", 567);
        map.put("wang", 7890);
        System.out.println(map.size());

//        迭代map集合
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : set) {
            System.out.println(stringIntegerEntry.getKey() + " = " + stringIntegerEntry.getValue());
        }
    }
}
