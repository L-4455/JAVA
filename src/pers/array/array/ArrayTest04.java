package pers.array.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/18/22:11
 */
public class ArrayTest04 {
    public static void main(String[] args) {
//        方法参数是数组时如何省区声明一个变量,直接传入静态数组?
        int[] a = {234, 12334, 345, 56745, 6};
        printArray(a);
        System.out.println("===========================");
//      非法的表达式开始,JAVA中没有这种语法,想要直接传递静态参数.需要另一种方法编写
//        printArray({12,345,123,46});

//        想要直接传递静态参数,需要这编写,注意:int数组和大括号连接不用写=
        printArray(new int[]{123, 34, 57, 123});
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("各数" + (i + 1) + ":" + array[i]);
        }
    }
}
