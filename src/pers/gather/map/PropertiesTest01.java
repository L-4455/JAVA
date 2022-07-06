package pers.gather.map;

import java.util.Properties;

/**
 * @Author LiZiHao
 * @Date 2022/7/4/0004/15:32
 */
public class PropertiesTest01 {
    /*
        Properties类实现于Hashtable
        Properties集合中的key和value只能存String类型
        类中常用方法:
            String getProperty(String key)
            Object setProperty(String key, String value)
     */
    public static void main(String[] args) {
//        创建集合
        Properties pr = new Properties();

//        添加元素
        pr.setProperty("beijing", "henan");
        pr.setProperty("huayuan", "heilongjing");
        pr.setProperty("小黑子", "大胆!!");
        pr.setProperty("1", "我爱你");

//        取元素
        String beijing = pr.getProperty("beijing");
        String s1 = pr.getProperty("1");
//        key值输入错误,取出null
        String huayuan = pr.getProperty("huayua");
        System.out.println(beijing);
        System.out.println(s1);
        System.out.println(huayuan);
    }
}
