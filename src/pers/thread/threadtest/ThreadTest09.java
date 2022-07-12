package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/10:24
 */
public class ThreadTest09 {
    /*
        终止线程的运行,强制打断线程的运行
        和打断睡眠不一样,这个是直接把线程杀死,不让在继续运行下去.
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable4());
        thread.setName("大胆!!");
        thread.start();

//        5秒之后终止thread线程的运行.
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        已过时,不建议使用.终止线程的运行
//        这样做有坏处.这个相当于直接杀死程序了,对于程序的数据是有损坏的.容易丢失数据
//        应该用合理的方式终止程序的运行.
        thread.stop();
    }
}

class Runnable4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
//            一秒执行一次
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
