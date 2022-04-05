/**
 * @author: LiZhiHao
 * @Date: 2022-02-26 16:44:00
 * @LastEditTime: 2022-03-29 20:24:51
 */
package pers.luochen.whiletest;

/**
 * @author LiZhiHao
 * @date 2022/2/26 16:44
 */
public class WhileTest01 {
    public static void main(String[] args) {
        /*
        *
        * while循环语法结构
        * while(布尔表达式){
        *   循环体;
        * }
        * while循环次数可能会为0也可能是N次。
        * */
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
//        死循环
        /*while(true){
            System.out.println("哈哈哈");
        }*/
//        编译错误：无法访问的语句
//        System.out.println("HHHHH");
        int a = 10;
        int j = 3;
        System.out.println(a);
        System.out.println(j);
//        死循环
        /*while(a > j){
            System.out.println("SHH");
        }
//        编译不会报错，因为编译期间不会检查a > j是否为true或者false.但是执行同样还是无法访问的语句。
        System.out.println("WWW'S");*/
//        死循环
        while (10 > 3) {
            System.out.println("ss");
        }
//        编译报错，因为10>3在编译器间可以判断出来是否为true或false，所以下一条语句也是无法访问的语句.
        //System.out.println("呵呵");
    }
}
