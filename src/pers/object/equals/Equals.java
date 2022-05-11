package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/11/21:58
 */
public class Equals {
    public static void main(String[] args) {
        /*
           equals方法是object中的方法,源码:
                public boolean equals(Object obj) {
                   return (this == obj);
            }
            1:equals是判断两个java对象是否相等的方法.
         */
        int a = 10;
        int b = 10;
        // 这里的"=="判断的是a和b中保存的值
        System.out.println(a == b);//true
        Time time = new Time(2004, 11, 05);//Time time = 0x123;
        Time time1 = new Time(2004, 11, 05);//Time time = 0x234;
        // 判断结果为false,因为"=="作的是对象保存的值判断,也就是内存地址.判断的是该引用保存的对象的内存地址.
        // 在进行java对象判断时我们一般都是判断该对象中的内容,而不是该对象的内存地址.使用equals试试
        System.out.println(time == time1);//false

        //这是为什么?为什么equals判断结果也是false呢?看一下源码:
        /*public boolean equals(Object obj) {
            return (this == obj);
        }
            可以看到,equals中也是用的"=="来进行判断的
            time.equals(time1);
            在equals中this就是time,obj就是time1.
            return(time == time1);
            还是进行了内存地址判断,所以我们要重写equals方法来满足业务需求.
        */

        /*重写之前返回的结果是:
        boolean flag = time.equals(time1);
        System.out.println(flag);// false*/
//        重写之后的返回结果:
        boolean flag = time.equals(time1);
        System.out.println(flag);//true
        Time time2 = new Time(2005, 4, 28);
        boolean flag1 = time.equals(time2);
        System.out.println(flag1);//false

        Time time3 = null;
        boolean flag2 = time.equals(time3);
        System.out.println(flag2);//false

        System.out.println(time2);
        System.out.println(time1);


    }
}
