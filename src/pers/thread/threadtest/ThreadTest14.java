package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/15/8:52
 */
public class ThreadTest14 {
    /*
        守护线程的实现

        线程为守护线程,即使是一个死循环,只要用户线程结束,守护线程也会结束,不受死循环的控制.

     */
    public static void main(String[] args) {
        Thread thread = new Thread01();
        thread.setName("T1");
        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread01 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "-->" + ++i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
