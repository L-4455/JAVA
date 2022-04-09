package pers.luochen.operator;

/**
 * @author LiZhiHao
 * @date 2022/2/23 15:26
 */
public class Operator03 {
    public static void main(String[] args) {
        /*
         * 逻辑运算符：
         * & 逻辑与(两边的算子都为true，结果才是true)
         * | 逻辑或(两边的算子只要有一个为true，结果就是true)
         * ^ 逻辑异或(两边的算子只要不一样，结果就为true)
         * !逻辑非(!true就是false !false就是true，取反)
         *
         * && 短路与
         * || 短路或
         * */
        System.out.println(5 > 3 & 5 > 2);
        System.out.println(5 < 3 | 5 > 2);
        System.out.println(5 > 3 ^ 5 > 3);
        System.out.println(!true);
        System.out.println(!false);


        int i = 10;
        int n = 5;
        System.out.println(n > i && ++n < 10);
        System.out.println("n = " + n);
        /*
         *  n = 5
         *  说明 && 后面的 ++n < 10并没有执行。
         * */
        int w = 10;
        int b = 5;
        System.out.println(b > w & ++b < 10);
        System.out.println("b = " + b);
        /*
         * b = 6
         * 说明 & 后面的 ++b < 10执行了。
         *
         * */

        /*
         *
         * 也就是说&&只要第一个算子为false那么这个表达式就执行结束，不会往下执行了。
         * 而&不管第一个算子是不是false都会把这个表达式执行下去。
         * */

        int m = 100;
        int g = 10;
        System.out.println(m > g || ++m < 100);
        System.out.println("m = " + m);
        /*
         * m = 100
         * 说明 || 后面的  ++m < 100没执行。
         *
         * */
        int h = 100;
        int v = 10;
        System.out.println(h > v | ++h < 100);
        System.out.println("h = " + h);
        /*
         * h = 101
         * 说明 | 后面的 ++h < 100执行了。
         *
         * */

        /*
         *
         * 也就是说||只要第一个算子为true那么这个表达式就执行结束，不会往下执行了。
         * 而|不管第一个算子是不是true都会把这个表达式执行下去。
         * */
    }
}
