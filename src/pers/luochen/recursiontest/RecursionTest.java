package pers.luochen.recursiontest;

/**
 * @author LiZhiHao
 */
public class RecursionTest {
    public static void main(String[] args) {
        /*
         *
         * 不是用递归，计算1-N的和。
         */
        int n = 4;
        int retValue = sum(n);
        System.out.println("1~" + n + "的和是：" + retValue);
    }

    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
