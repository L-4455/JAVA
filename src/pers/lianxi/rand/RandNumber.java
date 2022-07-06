package pers.lianxi.rand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author LiZiHao
 * @Date 2022/7/5/16:47
 */
public class RandNumber {
    /*
        1.产生10个1-100的随机数，并放到一个数组中，
            把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] >= 10) {
                list.add(array[i]);
            }
            System.out.println(array[i]);
        }
        System.out.println("=============");
        for (Integer integer : list) {
            System.out.println(integer);

        }
    }
}
