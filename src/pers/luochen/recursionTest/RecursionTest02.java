package pers.luochen.recursiontest;

/**
 * @author: LiZhiHao
 * @Date: 2022-03-20 01:55:16
 * @LastEditTime: 2022-04-09 23:36:57
 */
public class RecursionTest02 {
    public static void main(String[] args) {
        /*
         * 使用递归计算1-N的和。
         */
        int retValue = sum(4);
        System.out.println(retValue);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
// 4 
