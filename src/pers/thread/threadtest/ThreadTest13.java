package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/11:51
 */
public class ThreadTest13 {
    /*
        线程的合并
        线程合并不是两个栈合成一个栈,而是两个栈之间发生了关系.
        线程合并会造成线程阻塞
     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "--->" + "begin");
        Thread thread = new Thread(new Runnable8());
        thread.setName("ww");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--->" + "end");
    }
}

class Runnable8 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -->" + i);
        }
    }
}
