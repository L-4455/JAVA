package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/9:55
 */
public class IntegerTest03 {
    /*
        在java1.5之后支持自动装箱
     */
    public static void main(String[] args) {
//        自动装箱
        Integer x = 100;
//        自动拆箱
        int w = x;
        System.out.println(w);

        Byte b = 22;
        byte q = b;
        System.out.println(q);
    }
}
