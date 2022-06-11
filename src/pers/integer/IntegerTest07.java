package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/16:37
 */
public class IntegerTest07 {
    /*
        特殊值使用==比较
     */
    public static void main(String[] args) {
        Integer q = -128;
        Integer w = 128;
        System.out.println(q == w);//false

        Integer x = 127;//这里没有new Integer对象,而是直接在方法区的整数型常量池里面拿的
        Integer y = 127;// 这里没有new Integer对象,而是直接在方法区的整数型常量池里面拿的
        /*
            为什么这个为true
            因为java在jvm的方法区中有整数型常量池机制
            只要是在byte的取值范围内,就不在new对象而是直接从里面拿.
         */
        System.out.println(x == y);//true
    }
}
