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
        System.out.println(x + "");

        Byte b = 22;
        byte q = b;
        System.out.println(q);


        Integer integer = 1000;//等同于Integer integer = new Integer(1000);
        Integer i1 = 1000;//等同于Integer i1 = new Integer(1000);
//        由于进行了两次创建对象,所以integer和i1所保存的对象的内存地址是不同的,
//        在java对象之间作比较时如果使用了==就是永远比较的内存地址
        System.out.println(i1 == integer);//false
    }
}
