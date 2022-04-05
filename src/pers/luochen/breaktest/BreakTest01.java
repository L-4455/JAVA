/**
 * @author: LiZhiHao
 * @Date: 2022-02-26 19:23:24
 * @LastEditTime: 2022-03-29 20:22:12
 */
package pers.luochen.breaktest;

public class BreakTest01 {
    public static void main(String[] args) {
        /*
         *
         *
         * break在java中意思为终止中断
         * break是控制循环的控制语句。
         * break可以控制for，while，do.for。
         * 当某个循环达到特定的条件时需要终止循环，不需要后面的循环的执行，避免浪费系统资源。
         * 此时可以用break;来控制循环达到某种条件。
         * break的语法是：break;
         * break;就是一条完整的java语句。
         * */

        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("----------------");
        int i = 0;
        while (i <= 10) {
            i++;
            if (i == 6) {
                break;
            }
            System.out.println("i----->" + i);
        }
    }
}
