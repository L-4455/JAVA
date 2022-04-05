/**
 * @author: LiZhiHao
 * @Date: 2022-03-26 16:00:56
 * @LastEditTime: 2022-03-27 22:41:03
 */
package pers.luochen.objectoriented;

public class Ootset01 {
    public static void main(String [] args){

        /**
         * 对象的创建与使用
         * 想要访问Student类体中的对象，需要先创建对象
         * 创建对象的语法为：new 类名();
         * new在java中是一个运算符，用来创建一个新的对象，创建好的对象保存在堆内存当中。
         * 实例变量在没有赋值情况下，系统会赋默认值。
         * 什么是引用？
         * A a =new A();
         * a就是引用 指的是指向一个A对象内存地址，只能通过a来操作对象A。
         * 我的理解是：引用指向的是一个对象内存地址，不再是一个字面值。这个对象里可能有很多个实例变量或者方法，引用就相当于C语言的指针
         * 但是java中没有指针，所以想要访问对象内部的实例变量和方法时需要通过引用来操作。
         */

        //因为Student是一个引用数据类型，所以需要Student 变量名 = new Student();来保存数据。

        Student s = new Student();
        
        //对于对象中的实例变量又两种访问形式
        //读取数据：变量名.属性名
        //修改数据: 变量名.属性名 = 值;

        
        int stNo = s.no;
        int stAge = s.age;
        String stName = s.name;
        String stAdder = s.adder;
        boolean stSex = s.sex;
        
        System.out.println("学号-->" + stNo);
        System.out.println("年龄-->" + stAge);
        System.out.println("姓名-->" + stName);
        System.out.println("住址-->" + stAdder);
        System.out.println("性别-->" + stSex);
        
        /*
        System.out.println("学号-->" + s.no);
        System.out.println("年龄-->" + s.age);
        System.out.println("姓名-->" + s.name);
        System.out.println("住址-->" + s.adder);
        System.out.println("性别-->" + s.sex);

        //修改对象中实例变量的值

        /** 
        int stNo = s.no = 10;
        int stAge = s.age = 23;
        String stName = s.name = "Jack";
        String stAddr = s.addr = "北京";
        boolean stSex = s.sex = true;

        System.out.println("学号-->" + stNo);
        System.out.println("年龄-->" + stAge);
        System.out.println("姓名-->" + stName);
        System.out.println("住址-->" + stAddr);
        System.out.println("性别-->" + stSex);
        */

    }
}
