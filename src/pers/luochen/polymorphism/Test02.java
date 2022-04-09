package pers.luochen.polymorphism;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-08 21:33:15
 * @LastEditTime: 2022-04-08 21:56:14
 */
public class Test02 {
    /**
     * 调试的使用
     */

    public static void main(String[] arg) {
        int i = 10;
        int j = 20;
        int retValue = sumint(i, j);
        System.out.println(retValue);
    }

    public static int sumint(int i, int j) {
        int c = i + j;
        int a = 10;
        int retvalue = divide(c, a);
        return retvalue;
    }

    private static int divide(int c, int a) {
        int b = c / a;
        return b;
    }


}
