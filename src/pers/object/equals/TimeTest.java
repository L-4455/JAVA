package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/11/21:58
 */
public class TimeTest {
    public static void main(String[] args) {
        /*
           equals方法是object中的方法,
           源码:
                public boolean equals(Object obj) {
                   return (this == obj);
            }
            1、equals是判断两个JAVA对象是否相等的方法。判断两个JAVA对象所保存的内存地址指向的"内容"是否相等,而不是内存地址是否相等。
            2、在没有重写equals方法前，equals判断的对象如果是JAVA对象那么对比的是JAVA对象的内存地址。
            3、对于基本数据类型不需要使用equals
         */

        int a = 10;
        int b = 10;
//         这里的"=="判断的是a和b中保存的值,因为是基本数据类型.
        System.out.println(a == b);//true
        System.out.println("=====================");

//         Time time = 0x123;
        Time time = new Time(2004, 11, 05);
//         Time time = 0x234;
        Time time1 = new Time(2004, 11, 05);

//         判断结果为false,因为"=="判断的是JAVA对象保存的值判断,也就是内存地址。判断的是该引用保存对象的内存地址.
//         而time和time1都是new出来的,内存地址肯定不同.
//         在进行JAVA对象判断时我们一般都是判断该对象中的内容,而不是该对象的内存地址。应当使用equals
//        false
        System.out.println(time == time1);

        /*为什么equals判断结果也是false呢?
        看一下源码:
        public boolean equals(Object obj) {
            return (this == obj);
        }
            可以看到,equals中也是用的 "==" 来进行判断的
            代码:time.equals(time1);
            在equals中this就是time,obj就是time1.
            return(time == time1);
            还是进行了内存地址判断,所以我们要重写equals方法来满足业务需求。
        */
//        重写之前返回的结果是:false
//        boolean flag = time.equals(time1);
//        System.out.println(flag);

//        重写equals之后的返回结果:true
        boolean flag = time.equals(time1);
        //true
        System.out.println(flag);

//        测试
        Time time2 = new Time(2005, 4, 28);
        boolean flag1 = time.equals(time2);
        //false
        System.out.println(flag1);

//        测试
        Time time3 = null;
        boolean flag2 = time.equals(time3);
        //false
        System.out.println(flag2);

//        直接输出time1和time2会调用Time的重写后的toString方法,如果不重写就调用Object的toString方法.
        System.out.println(time2);
        System.out.println(time1);


    }
}
