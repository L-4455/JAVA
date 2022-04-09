package pers.luochen.methodtest;

/**
 * @author: LiZhiHao
 * @Date: 2022-02-28 15:23:34
 * @LastEditTime: 2022-04-09 23:12:41
 */


public class MethodTest02 {
    public static void num(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        MethodTest02.number();
        //方法的调用不一定是在主方法main中，凡是可以执行到的代码的方法体都可以调用方法。
        //main的方法是方法入口，由JVM调用。
    }

    public static void main(String[] args) {
        MethodTest02.num(20, 30);
    }

    public static void number() {
        System.out.println("Hello World");
    }

}
