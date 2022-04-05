package pers.luochen.operator;

/**
 * @author LiZhiHao
 * @date 2022/2/23 13:36
 */
public class Operator {

    public static void main(String[] args) {
        /*
         *++和--在变量名前后的解释
         */
        int i = 10;
        i++;
        System.out.println("i = " + i);
        int q = 100;
        ++q;
        System.out.println("q = " + q);
        /*
         * i == 11
         * q == 101
         * 在以上情况中，不论++在变量前或在变量后，最终结果都会自加1。
         *
         */

        int m = 10;
        int n = m++;
        /*
         * 当在++与=同在时，先做赋值再自加1。也就是说先把m的值(10)赋值给n再自加 1 。
         * 所以：
         * m的值为 11；
         * n的值为 10；
         * */
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int a = 100;
        System.out.println("a1 = " + a++);
        /*
        * 注意：这种情况中虽然a的输出值为100，但以后再次参加运算时a的值是为 101 的。
        * */
        System.out.println("a2 = " + ++a);
        /*
         * 在以上情况中，当++在变量名后时 a的值一直都是原值，其调用了io.PrintStream中的（Sting x）方法
         * public void println(String x = a ++){
         *       synchronized (this){
         *           print(x);
         *           newLine();
         *      }
         * }
         *  先把a赋值给了x在 ++ 所以a1的结果永远都是a的原值，但会自加1。
         *
         * a2的情况就是:
         * public void println(String x = ++ a){
         *      synchronized (this){
         *          print(x);
         *          newLine();
         *      }
         * }
         * 因为此时 是++在变量前，所以先自加1再赋值。a的值为101 + 1 = 102。
         * 所以a2的输出结果为 102.
         * */
    }
}
