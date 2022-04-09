package pers.luochen.methodtest;

/**
 * @author: LiZhiHao
 * @Date: 2022-03-15 20:45:46
 * @LastEditTime: 2022-04-09 23:13:30
 */


public class MethodTest09 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int retValue = sumInt(a, b);
        System.out.println("retValue" + " = " + retValue);
    }

    public static int sumInt(int a, int b) {
        int result1 = a + b;
        int num = 3;
        return divide(result1, num);
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
