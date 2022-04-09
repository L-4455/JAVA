package pers.luochen.operator;

/**
 * @author LiZhiHao
 * @date 2022/2/23 14:20
 */
public class Operator02 {
    public static void main(String[] args) {
        /*
         * 关系运算符：
         *   int q = 100;
         *   int b = 10;
         *   q > b 做比较时比较的是 q 保存的“100”这个值和 b 保存的“10”这个值
         *  ==也是如此
         * */
        int a = 100;
        System.out.println(a > 100);
        System.out.println(a >= 100);
        System.out.println(a < 100);
        System.out.println(a <= 100);
        System.out.println(a == 100);
        System.out.println(a != 100);
    }
}
