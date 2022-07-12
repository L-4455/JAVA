package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/9:59
 */
public class ThreadTest07 {
    /*
        线程睡眠面试题:
        分析以下程序中的线程是否会被打断睡眠
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable3());
        thread.setName("6");
        thread.start();
        try {
//            这行代码并不会打断thread线程的睡眠,因为sleep是静态方法,和对象没关系
//            即使调用这个方法的是个引用,也不会去睡眠这个引用的线程.而是睡眠当前线程
//            thread.sleep()---->Thread.sleep();
            thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Runnable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}