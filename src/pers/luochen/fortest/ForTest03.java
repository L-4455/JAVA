/**
 * @author: LiZhiHao
 * @Date: 2022-02-26 13:59:27
 * @LastEditTime: 2022-04-06 21:14:12
 */
package pers.luochen.fortest;

/**
 * @author LiZhiHao
 * @date 2022/2/26 13:59
 */
public class ForTest03 {
    public static void main(String[] args) {
        /*
         *
         * 使用for循环完成9*9表
         * 1*1=1
         * 1*2=2 2*2=4
         * 1*3=3 2*3=6
         * 1*4=4 2*4=8
         * */
        int number1 =1 ,number9 = 9;
        for (int num = number1; num <= number9; num++) {
            for (int num1 = 1; num1 <= num; num1++) {
                System.out.print(num1 + "*" + num + "="+ (num1  * num + " "));
            }
            System.out.println();
        }
        /*
        *
        * 输出方式是一行一行的输出
        * 遍历1-9，让num1小于num，同时让num1自加1
        *
        * 当num等于1时，num1是1 因为1<=1,所以会执行一次。当num自加1时，输出下一条java语句，再回去执行更新表达式，再去判断 布尔类型的ture或false
        * 因为num1自加1了，所以此时num1等于2，2<=1为fasle，所以跳出内循环。
        * 内循环结束了，就执行外循环，所以此时num等于2
        * 当num等于2时，num1是1 因为1<=1 1<=2,所以会执行两次，输出两次。
        *
        * 就这样一行一行的执行，直到外循环执行完毕，整个循环结束。
        *
        * */
    }
}
