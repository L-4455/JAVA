package pers.gather.collection.foreach;

/**
 * @Author LiZiHao
 * @Date 2022/7/2/0002/16:23
 */
public class ForEachTest01 {
    /*
        增强for循环
        foreach
        语法格式:
        for(数据类型 变量名 : 集合或数组){

        }
     */
    public static void main(String[] args) {
        int[] s = {123, 123, 345, 456, 123};

//        普通for循环遍历数组;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
//        增强for循环遍历数组,增强for循环缺点:
//        没有下标,对于需要使用下标的操作不建议使用foreach
        for (int w : s) {
//            w表示数组中的元素
            System.out.println(w);
        }
    }
}
