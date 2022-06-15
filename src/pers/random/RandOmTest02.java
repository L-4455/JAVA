package pers.random;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author LiZiHao
 * @Date 2022/6/13/20:26
 */
public class RandOmTest02 {
    /*
        随机产生5个不同的随机数放到数组中.
        这5个随机数类型为整型.
     */
    public static void main(String[] args) {
        /*
            第一次测试输出结果
            -1
            -1
            1
            2
            3
            为什么呢?
            因为当Rand随机产生一个数时,放到了数组第一个元素,"-1"变成了产生的随机数,让后数组又进行了升序排序.
            把第一个元素排到了最后一位,就是与最后一位换了位置.所以排序后第一位元素还是"-1".让后index++
            这让在第二次循环时,随机产生的数放到了数组第二位元素上.所以第一位永远都是"-1".
            第二位与第一位同样.那为什么后三位不是呢?
            因为第二次循环结束后,数组后两位不是"-1"是有数据的,当第三次循环来时,Rand产生的随机数就放到了数组第三位,让后
            就对数组进行了升序排序.这养就造成了前两位永远是"-1",而后三位是按升序排序的.
         */

        int[] array = new int[5];
        Random random = new Random();

        /*
        public static void fill(int[] a,int val)
        将指定的 int 值分配给指定 int 型数组的每个元素。
        a - 要填充的数组
        val - 要存储在数组所有元素中的值
        */
        Arrays.fill(array, -1);
        int index = 0;
        while (index < array.length) {
            int number = random.nextInt(6);
            System.out.println("产生随机数" + number);
            if (!include(array, number)) {
                array[index] = number;
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean include(int[] array, int key) {

/*  这个方法有Bug(数组前两位一直是-1)
//        对数组进行升序排序
        Arrays.sort(array);
//        使用二分法查找
        *//*
        可以优化
        int index = Arrays.binarySearch(array, key);
        if (index >= 0) {
            return true;
        }
        return false;
        *//*
        return Arrays.binarySearch(array,key) >= 0;*/
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
