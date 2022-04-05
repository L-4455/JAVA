package pers.luochen.operator;

/**
 * @author LiZhiHao
 * @date 2022/2/23 15:56
 */
public class Operator04 {
    public static void main(String [] args){

        /*
        * 赋值运算符
        * =
        *
        * 扩展运算符
        * +=
        * -=
        * *=
        * /=
        * %=
        * 赋值运算符先执行 = 号右边的表达式再赋值给变量。
        * 赋值运算符不会改变运算结果的类型。
        * */
        int i = 10;
        i = i + 5;
        System.out.println("i = " + i);
        i += 5;
        System.out.println("i = " + i);
        /*
        * i += 5;等同于 i = i + 5;
        * i -= 5;等同于 i = i - 5;
        * i *= 5;等同于 i = i * 5;
        * i /= 5;等同于 i = i / 5;
        * i %= 5;等同于 i = i % 5;
        * */

    }
}
