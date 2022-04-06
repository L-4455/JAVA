/**
 * @author: LiZhiHao
 * @Date: 2022-02-25 14:32:53
 * @LastEditTime: 2022-04-06 20:58:57
 */
package pers.luochen.fortest;

public class ForTest01 {
    static int number0 = 0 , number1 = 1 , number2 = 2 , number3 =3 ,number10 = 10, number100 = 100;
    public static void main(String[] args) {
        /*
         *
         * for循环结构
         *       for(初始化表达式;布尔类型;更新表达式){
         *               //循环体（Java语句）;
         * }
         *
         * for循环运行原理和过程
         *  for循环运行过程
         *      for循环会先执行一次初始化表达式，再判断布尔类型的true/false，
         *          如果为true则执行循环体，让后再执行更新表达式，再去判断布尔类型的true/false
         *              如果为true，则在此执行更新表达式，再去判断布尔类型的true/false
         *                  直到布尔类型为false，则整个循环体结束。
         *
         * */
        for (int i = number0; i >= number10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        for (int i = number0; i <= number1; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        for (int i = number0; i <= number10; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        for (int i = number0; i <= number10; i += 1) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        for (int i = number2; i <= number10 ; i += number2) {
            System.out.println("i---->" + i);
            //1-10的偶数
        }
        System.out.println("----------------------------");
        for (int i = number0; i <= number10; i += number2) {
            System.out.println("i----->" + i);
            //1-10的奇数
        }
        System.out.println("----------------------------");
        /*
         * for循环可以嵌套使用
         *   可以和控制语句嵌套使用。
         *   for(;;){
         *       if(){
         *           for(){
         *           }
         *       }
         *   }
         * */
        for (int i = number0; i <= number10; i++) {
            //循环10次，但没有输出执行结果，只循环。
            for (int j = number0; j <= number3; j++) {
                //循环3次
                //0 1 2 3
                System.out.println("j---->" + j);
            }
        }
        /*
         *
         * 最外一层的循环控制内循环的循环次数，内循环次数只是一个普通的for循环，不要特例化。
         * 当内循环结束后，在去执行外循环的更新表达式，再去判断布尔类型的true/false，如果为true则继续执行内循环，反之结束整个循环体.
         * */
        /*
         *
         * 输出1-100的奇数，使用for和if来完成。
         *
         * */
        System.out.println("----------------------------");
        //for嵌套使用
        for (int i = number1; i <= number100; i++) {
            if (i % 2 != 0) {
                //判断是否为奇数和偶数，对2求余数，如果余数等于0则为偶数，如果不等于0则为奇数.
                System.out.println(i);
            }
        }
        System.out.println("----------------------------");
        for (int i = number1; i <= number100; i += number2) {
            //累加2，求出奇数。
            System.out.println(i);
        }
        /*
         * 对于以上两种方式，更推荐为第二种，代码短，执行效率高。
         * */
    }
}
