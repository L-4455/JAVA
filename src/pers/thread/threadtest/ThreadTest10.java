package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/10:31
 */
public class ThreadTest10 {
    /*
         使用合理的方式终止程序的运行
         在需要终止的线程中打印一个boolean标记,标记为false表示程序要终止了.可以对终止前的数据进行保护..
     */
    public static void main(String[] args) {
        Runnable5 r = new Runnable5();
        Thread thread = new Thread(r);
        thread.setName("oo");
        thread.start();

//        五秒之后终止程序
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        r.run = false;

    }
}

class Runnable5 implements Runnable {

    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
}
