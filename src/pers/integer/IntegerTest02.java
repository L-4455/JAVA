package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/9:37
 */
public class IntegerTest02 {
    /*
        八种基本数据类型对应的包装类
        基本数据类型                  包装类
        --------------------------------------
        byte                        Byte
        short                       Short
        int                         Integer
        long                        Long
        float                       Float
        double                      Double
        boolean                     Boolean
        char                        Character

     */
    public static void main(String[] args) {
//        基本数据类型转换为引用数据类型称为:装箱
        Integer x = new Integer(10);
//        引用数据类型转换为基本数据类型称为:拆箱
        int y = x.intValue();
        System.out.println(y);
//        基本数据类型转换为引用数据类型称为:装箱
        Integer q = new Integer("123");
//        基本数据类型转换为引用数据类型称为:装箱
        int z = q.intValue();
        System.out.println(z);

        double i = q.doubleValue();
        System.out.println(i);
//        doSome(q);
//        doSome(x);

    }

    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}
