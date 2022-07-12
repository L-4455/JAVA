package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/11:38
 */
public class ThreadTest12 {
    /*
        线程的让位,暂停当前线程的执行,让给其他线程.
        让位并不是100%让给其他线程.
        线程让位不会造成阻塞,而是让线程运行状态回到就绪状态
        有可能下次抢夺CPU时间线还是抢到了

     */
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable7());
        thread.setName("t");
        thread.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }
}

class Runnable7 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (i % 100 == 0) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + "--->" + i);

        }
    }
}
