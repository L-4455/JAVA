package pers.array.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/29/14:51
 */
public class ArrayTest12 {
    /*
        方法的参数是二维数组以及动态初始化二维数组
     */
    public static void main(String[] args) {
        /*
            定义一个二维数组
            这个数组有4行5列
         */
        /*
        int[][] array = new int[4][5];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        */

        int[][] a = {
                {1, 2, 3, 4},
                {11, 12, 13},
                {22, 23, 24, 123, 123123},
        };
        printArray(a);

        int[][] b = new int[5][2];
        printArray(b);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
