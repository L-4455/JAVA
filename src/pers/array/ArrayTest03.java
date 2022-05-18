package pers.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/18/21:39
 */
public class ArrayTest03 {
    public static void main(String[] args) {
//        当一个方法的参数是数组时,怎么传递参数?
//        静态初始化一维数组,
        int[] a = {123, 34, 1236, 65, 234};
//        传递数组参数
        printArray(a);
        System.out.println("===================");
//        动态初始化一维数组
        int[] b = new int[9];
        printArray(b);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("各数" + (i + 1) + ":" + array[i]);
        }
    }
}

