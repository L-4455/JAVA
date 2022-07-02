package pers.array.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/23/21:53
 */
public class ArrayTest09 {
    /*
        JAVA中二维数组的定义:
            二位数组本质上就是数组的数组,数组中保存的元素是一个数组.
            二维数组是一个特殊的一维数组,特殊在二维数组中保存的每一个元素是一维数组.
            int[][] array={
                {12,3123,123},
                {234,123,345},
                {567,345,123},
            };
            String[][] array1 = {
                {"java","c++","c#","python"},
                {"张三","李四","王五","韩梅梅"},
                {"jack","rose","dock"},
            };
     */
    public static void main(String[] args) {
        int[][] array = {
                {123, 345, 56, 123},
                {78, 123345, 567, 45, 45},
                {678, 2547, 245, 589, 5345, 67},
                {689, 3415, 695, 8714, 6789},
        };

//        取array数组的长度
        System.out.println(array.length); // 4
//        取array数组中的第一个元素,第一个元素是一个一维数组,所以返回结果也是一维数组.
        int[] a = array[0];
//        a是一个int类型的数组,所以a有length属性.这里的a.length是array数组中第一个元素一维数组的长度.
        System.out.println("array数组中第一个元素一维数组的长度:" + a.length);

        int[] b = array[1];
        System.out.println("array数组中第二个元素一维数组的长度:" + b.length);

        int[] x = array[2];
        System.out.println("array数组中第三个元素一维数组的长度:" + x.length);

        int[] y = array[3];
        System.out.println("array数组中第四个元素一维数组的长度:" + y.length);

//        合并起来

        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);
        System.out.println(array[3].length);

        System.out.println("==========================");

//        取第一个元素中的第一个元素
//        取到第一个元素.这个元素是一个一维数组
        int[] q = array[0];
        System.out.println(q[0]);//123

//        取第二个元素中第三个元素
        int[] w = array[1];
        System.out.println(w[2]);

//        取第三个元素中第四个元素
        int[] e = array[2];
        System.out.println(e[3]);

//        取第四个元素中第五个元素
        int[] r = array[3];
        System.out.println(r[4]);

        System.out.println("===============================");

//        合并
        System.out.println(array[0][2]);
        System.out.println(array[1][3]);
        System.out.println(array[2][1]);
        System.out.println(array[3][3]);

    }
}
