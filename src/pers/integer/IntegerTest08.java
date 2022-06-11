package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/17:17
 */
public class IntegerTest08 {
    /*
        String int Integer之间的转换
     */
    public static void main(String[] args) {
//        String ---> int
        int q1 = Integer.parseInt("100");
        System.out.println(q1 + 1);//101

//        int --->String
        String s1 = String.valueOf(q1);
        System.out.println(s1 + "1");//1001

//        String--->Integer
        Integer i1 = Integer.parseInt(s1);
        System.out.println(i1);//100

//        Integer --->String
        String i2 = String.valueOf(i1);
        System.out.println(i2);//100

//        int ---> Integer
        Integer a = q1;
        System.out.println(a);//100

//        Integer ---> int
        q1 = a;
        System.out.println(q1);//100
    }
}
