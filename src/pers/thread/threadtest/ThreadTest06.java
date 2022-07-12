package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/11/17:38
 */
public class ThreadTest06 {
    /*
        sleep方法
        对这个线程进行睡眠,醒了之后再去执行代码
        static void sleep(long millis)
        1.静态的
        2.参数是毫秒

     */
    public static void main(String[] args) {
        /*卧槽
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");*/

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
