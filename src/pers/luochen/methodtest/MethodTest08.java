package pers.luochen.methodtest;
/**
 * @author LiZhiHao
 * @date 2022/3/15 18:35
 */
public class MethodTest08 {
    public static void main(String[] args) {
        //方法的运行时的内存分配空间
        /**
         * 
         * 方法如只定义而不调用是不会被执行的，这个时候后方法为精致的状态。
         * 只有在调用的时候才会执行方法代码片段。
         * 在Java的JVM虚拟机中有三个空间
         * 1.方法区内存
         * 2.堆内存
         * 3.栈内存
         *  
         * "栈"数据结构。         
         * 栈<stack>属于一种数据结构，数据结构是一种独立的学科，大多数编程语言都需要数据结构的支撑.
         * 在java中，栈是一个空间，用来给代码片段分配空间。
         * 
         * 代码片段是属于.class文件的一部分，在类加载的时候会放到方法区中，所以三个内存空间中最先有数据的的方法区内存空间。
         * 当方法被调用的时候会给该方法分配一个内存空间，这个时候代码片段将会放到栈内存空间中。
         * 当方法被调用的瞬间会立即给该方法分配空间，这个时候要压栈，进入到栈内存中。等到方法执行完毕会弹栈。
         * 
         * 压栈：在栈内存中给方法分配内存空间。
         * 弹栈：释放栈内存空间。
         */
        //调用sumInt方法并传递参数。
        sumInt(2,20);
        sumInt(23,1312);
    }
    public static void sumInt(int a,int b){
        System.out.println(a + " + " + b + " = " +(a + b));
    }
}
