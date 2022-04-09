package pers.luochen.methodtest;
/**
 * @author: LiZhiHao
 * @Date: 2022-02-28 15:13:03
 * @LastEditTime: 2022-04-09 23:12:58
 */

/**
 * @author: LiZhiHao
 * @Date: 2022-02-28 15:13:03
 * @LastEditTime: 2022-04-09 23:12:57
 */


public class MethodTest04 {
    public static void main(String[] args) {
        /*
         * 方法的的执行顺序
         * */
        System.out.println("m begin");
        MethodTest04.m1();
        //暂停
        System.out.println("m over");

    }

    public static void m1() {
        System.out.println("m1 begin");
        m2();
        //暂停
        System.out.println("m1 over");
    }

    public static void m2() {
        System.out.println("m2 begin");
        m3();
        //暂停
        System.out.println("m2 over");
    }

    public static void m3() {
        System.out.println("m3 begin");
        System.out.println("m3 over");
    }
}
/*
* 执行结果：
    m begin
    m1 begin
    m2 begin
    m3 begin
    m3 over
    m2 over
    m1 over
    m over
    * 由此可以看出代码是自上而下依次执行的。当调用代码没有执行完时，下一行代码是无法执行到的。
    * 只有调用方法结束后，才回去执行下一行代码。
* */
