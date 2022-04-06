/**
 * @author: LiZhiHao
 * @Date: 2022-03-20 01:55:16
 * @LastEditTime: 2022-04-06 17:47:25
 */
package pers.luochen.recursiontest;


public class RecursionTest02 {
    public static void main(String [] args){
        /**
         * 使用递归计算1-N的和。
         */
        int retVlaue = sum(4);
        System.out.println(retVlaue);
    }
     public static int sum(int n){
         if(n == 1){
            return 1;
         }
         return n + sum(n -1);
     }
}
// 4 
