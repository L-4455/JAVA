package pers.luochen.recursionTest;


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
