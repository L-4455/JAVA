package pers.array.bubblesort;

import java.util.Arrays;

/**
 * @Author LiZiHao
 * @Date 2022/6/3/9:40
 */
public class BubbleSortTest {
    /*
        冒泡排序
        冒泡排序是对一组数组进行排序,按从小到大的顺序排.
        冒泡排序就是用左边的元素和相邻的元素进行比较,如果左边的元素大于右边的元素,那么就让这两个元素互换位置.
        原始数据:4,1,7,0,2,5,71,8
        采用冒泡排序:

        第1次循环:
        1,4,7,0,2,5,71,8(第1次比较:4>1,互换位置)
        1,4,7,0,2,5,71,8(第2次比较:4<7,不换位置)
        1,4,0,7,2,5,71,8(第3次比较:7>0,换位置)
        1,4,0,2,7,5,71,8(第4次比较:7>2,换位置)
        1,4,0,2,5,7,71,8(第5次比较:7>5,换位置)
        1,4,0,2,5,7,71,8(第6次比较:7<71,不换位置)
        1,4,0,2,5,7,8,71(第7次比较:71>8,换位置)
        第1次循环结束,最大值为:71

        第2次循环:
        原始数据:1,4,0,2,5,7,8
        1,4,0,2,5,7,8(第1次比较:1<4,不换位置)
        1,0,4,2,5,7,8(第2次比较:4>0,换位置)
        1,0,2,4,5,7,8(第3次比较:4>2,换位置)
        1,0,2,4,5,7,8(第4次比较:4<5,不换位置)
        1,0,2,4,5,7,8(第5次比较:5<7,不换位置)
        1,0,2,4,5,7,8(第6次比较:7<8,不换位置)
        第2次循环结束,最大值为:8

        第3次循环:
        原始数据:1,0,2,4,5,7
        0,1,2,4,5,7(第1次比较:1>0,换位置)
        0,1,2,4,5,7(第2次比较:1<2,不换位置)
        0,1,2,4,5,7(第3次比较:2<4,不换位置)
        0,1,2,4,5,7(第4次比较:4<5,不换位置)
        0,1,2,4,5,7(第5次比较:5<7,不换位置)
        第3次循环结束,最大值为:7

        第4次循环
        原始数据:0,1,2,4,5
        0,1,2,4,5(第1次比较:0<1,不换位置)
        0,1,2,4,5(第2次比较:1<2,不换位置)
        0,1,2,4,5(第3次比较:2<4,不换位置)
        0,1,2,4,5(第4次比较:4<5,不换位置)
        第4次循环结束,最大值为:5

        第5次循环
        原始数据:0,1,2,4
        0,1,2,4(第1次比较:0<1,不换位置)
        0,1,2,4(第2次比较:1<2,不换位置)
        0,1,2,4(第3次比较:2<4,不换位置)
        第5次循环结束,最大值为:4

        第6次循环:
        原始数据:0,1,2
        0,1,2(第1次比较:0<1,不换位置)
        0,1,2(第2次比较:1<2,不换位置)
        第6次循环结束,最大值:2

        第7次循环:
        原始数据:0,1
        0,1(第1次比较:0<1,不换位置)
        第7次循环结束,最大值为:1

 通过以上代码结论:冒泡排序循环次数是数组长度-1;
     */
    public static void main(String[] args) {
        int[] array = {867, 456, 345, 6, 234, 88};

//      0 1 2 4 5 7 8 71
        for (int i = 0; i < array.length - 1; i++) {
            /*
             *   j<7
             *   0 1 2 3 4 5 6
             *   1 2 3 4 5 6
             *   2 3 4 5 6
             *   3 4 5 6
             *   4 5 6
             *   5 6
             *   5
             * */
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
//        0 1 2 4 5 7 8 71
//        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
