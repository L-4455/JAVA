package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/10/18:27
 */
public class ThreadTest02 {
    /*
        多线程的启动
        1.类直接继承Thread,重写run方法
        2.为什么输出结果
        有前有后,有多有少.
        因为:各个线程都在抢夺CPU时间片,谁抢到了谁就执行,执行的多,就是抢的时间片长.
        也有可能是连续抢到了好几次.
     */
    public static void main(String[] args) {
//        创建线程对象
        MyThread myThread = new MyThread();
//        这个只是调用了run方法,这个方法执行不结束,下面就不会执行,而且还是在同一栈内,并不会创建新的栈
//        myThread.run();
//        启动分支线程
//        start的执行是瞬间结束
//        start的作用是用来开辟一个全新的栈空间,这个叫分支栈,他只是开辟空间,开辟完以后瞬间结束
//        栈空间开辟成功会自动调用run方法,这个run方法和main方法实在不同的栈中,两个执行互不干扰.
        myThread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程---->" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程---->" + i);
        }
    }
}
