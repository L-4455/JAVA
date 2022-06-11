package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/16:18
 */
public class IntegerTest06 {
    /*
        Integer的常用类
     */
    public static void main(String[] args) {
//        1.static Integer valueOf(int i)
//          把一个int类型转为Integer类型
//        装箱
        Integer integer = Integer.valueOf(123);
        System.out.println(integer);
//        2.static Integer valueOf(String s);
//        把一个String类型的转为Integer类型
        Integer integer1 = Integer.valueOf("6666");
        System.out.println(integer1);
    }
}
