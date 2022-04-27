package pers.luochen.interfacetest;

/**
 * @Author LiZiHao
 * @Date 2022/04/27/15:38
 */
/*
    接口的基础语法:
        1:接口是一个"引用数据类型"
        2:接口是完全抽象的,抽象类是半抽象的.接口是特殊的抽象类.
        3:接口语法:
            [修饰符] interface 接口名{
            }
        4:接口中只有常量和抽象方法两部分.
        5:接口中常量的:public static final可以省略.
        6:接口中抽象方法:public abstract可以省略.
        7:接口与接口可以多继承.
        8:重点:当一个类实现接口时,需要要同时实现接口中的所有方法.
 */
public class InterFaceTest01 {
    public static void main(String []args){
        
    }
}

interface A{
    //常量
//    public static final double PI = 3.1415926;
    //抽象方法
//    public abstract void sum(int a,int b);
//    省略写法
    double PI = 3.1415926;
    void sum(int a,int b);
}


interface B{

}

interface C{

}
interface D extends A,B,C{

}

