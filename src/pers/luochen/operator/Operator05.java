package pers.luochen.operator;

/**
 * @author LiZhiHao
 * @date 2022/2/23 16:15
 */
public class Operator05 {
    public static void main(String [] args){
        /*
        *
        * 字符串连接 +
        *
        * */
        int a = 22;
        int b = 33;
        //int c = a + b;
        System.out.println(a + "+" + b + "=" + (a + b));
        /*
        *
        * 三目运算符/三元运算符/条件运算符
        * 表达式：
        * 布尔类型 ? 表达式1 : 表达式2
        * 当布尔类型的结果为true，就选择表达式1作为整个表达式的结果。
        * 当布尔类型的结果为false，就选择表达式2作为整个表达式的结果。
        * */
        boolean c = true;
        String sex = c ? "男" : "女的";
        System.out.println(sex);

    }
}
