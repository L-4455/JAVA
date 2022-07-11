package pers.thread;

/**
 * @Author LiZiHao
 * @Date 2022/07/10/18:24
 */
public class ThreadTest01 {
    /*
        分析一下程序有几个线程

        以下程序中只有一个线程,因为这些方法都在同一个栈中,方法并不会创建新的栈,所以不会有其他线程,
     */
    public static void main(String[] args) {
        System.out.println("main begin");
        m2();
        System.out.println("main over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
        System.out.println("m3 begin");
        System.out.println("m3 over");
    }
}
