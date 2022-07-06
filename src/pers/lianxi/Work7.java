package pers.lianxi;

import java.util.*;

/**
 * @Author LiZiHao
 * @Date 2022/07/06/21:47
 */
public class Work7 {
    public static void main(String[] args) {
        /*
        6.定义一个泛型为String类型的List集合，统计该集合中每个字符
        （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
        程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
     */
        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("bcd");

        StringBuffer stringBUffer = new StringBuffer();

        for (String s : list) {
            stringBUffer.append(s);
        }
        char[] chars = stringBUffer.toString().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }
            }
            map.put(chars[i], count);
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> characterIntegerEntry : entrySet) {
            System.out.println(characterIntegerEntry);
        }
    }
}
