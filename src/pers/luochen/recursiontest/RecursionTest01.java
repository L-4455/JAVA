package pers.luochen.recursiontest;

import java.util.Date;

/**
 * @author: LiZhiHao
 * @Date: 2022-03-18 22:14:03
 * @LastEditTime: 2022-04-09 23:36:32
 */
public class RecursionTest01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前系统时间是：" + date);
        /*class InnerRecursionTest01 {
        
            ---方法递归---
            1:什么是方法递归？
                方法调用自身就是方法递归。
            2:方法递是很消耗栈内存空间的，所以能不用的时候尽量别用。
            3:方法递归如果没有结束语句会报错(error)而不是异常。报错无法挽回，只能停止JVM的工作。
            4:但是有的功能必须只用方法递归，比如：拷贝目录。
            5:方法递归会使栈内存溢出，所以能不用尽量不用。内存溢出无法挽回。
        } */
        //doSome();
    }

    public static void doSome() {
        System.out.println("doSome begin");
        doSome();
        System.out.println("doSome over");
        System.out.println();
    }
}
