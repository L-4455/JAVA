package pers.array.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/29/14:24
 */
public class ArrayTest10 {
    /*
        二维数组的读/改
     */
    public static void main(String[] args) {
        String[][] array = {
                {"www", "aaa", "dddd"},
                {"hhhh", "qwq", "wc", "sb"},
                {"aaa", "bbb", "an", "AC"},
        };

//        读
        System.out.println(array[0][0]); //www
        System.out.println(array[2][3]); //sb
        System.out.println(array[1][1]); //qwq

//        改
        array[0][0] = "张山";
        array[1][1] = "李四";
        array[2][2] = "韩梅梅";
        System.out.println(array[0][0]);
        System.out.println(array[1][1]);
        System.out.println(array[2][2]);

        /*
            array[0]表示读取array中第一个元素
            array[0][0]表示读取array第一个元素中的第一个元素
         */
    }
}
