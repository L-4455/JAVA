package pers.gather.lianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author LiZiHao
 * @Date 2022/07/06/21:31
 */
public class PropertiesTest {
    /*
        1.集合的创建
        2.添加元素
        3.查询元素
        4.遍历集合
     */
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("love", "noLove");
        properties.setProperty("no Can", "i can");

        System.out.println(properties.getProperty("love"));
        System.out.println(properties.get("love"));

        System.out.println(properties.get("no Can"));

        Map<Object, Object> map = new HashMap<>(properties);

        Set<Map.Entry<Object, Object>> entrySet = map.entrySet();

        for (Map.Entry<Object, Object> entry : entrySet) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
            System.out.println(entry);
        }
    }
}
