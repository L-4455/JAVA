package pers.reflection.reflect;

import java.util.Date;

/**
 * @Author LiZiHao
 * @Date 2022/07/16/18:19
 */
public class ReflectionTest01 {
    /*
        获取Class文件的三种方式
        1.Class.forName("这里是带包名的类名");
        2.Object obj = User.getClass;
        3.Class c = int.class;
     */
    public static void main(String[] args) {

//        第一种方式
        /*
            Class.forName();
            1.这是一个静态方法;
            2.该方法的参数是一个完整的类(带包名的);
            3.该方法的返回值是一个Class类型的;
         */
        Class s = null;
        Class x = null;
        try {
//            Class.forName("这里写的是完整的带包名的类);
            s = Class.forName("java.lang.String"); // s表示String.class,代表了String类型
            x = Class.forName("java.util.Date"); // x表示Date.class,代表了Date类型
            System.out.println(s);
            System.out.println(x);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//        第二种方式
//        java每个对象都有getClass属性.
        String s1 = "Ss";
        Class c = s1.getClass(); // c代表String类型

//        ==号在对java对象做比较时,比较的是:内存地址,==为true表示java对象的内存地址是一样的.
//        也就是说c和s指向了同一个java对象.
        System.out.println(c == s);

        Date date = new Date();
        Class da = date.getClass(); // da代表Date类型
        System.out.println(da == x);


//        第三种方式
//        java每个数据类型都有class属性,包括基本数据类型
        Class a = String.class; // a就表示了String类型
        Class b = int.class; // b就代表了int类型
        Class n = Object.class; // n就表示了Object类型

    }
}
