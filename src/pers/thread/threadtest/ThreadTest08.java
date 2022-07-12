package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/9:54
 */
public class ThreadTest08 {
    /*
        终断线程的睡眠,如一个线程睡了好久,想要在某个时间打断她的睡眠.
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable2());
        thread.setName("tt");
        thread.start();

//        睡眠5秒,5秒之后打断tt线程的睡眠
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        使用interrupt是终断线程的睡眠,使线程睡眠的哪一行代码会发生异常
//        异常之后会执行catch里面的语句,发生异后这个try...catch结束.会继续执行下面的代码
//        所以来说:interrupt是依靠Java的异常机制来打断线程睡眠的.
        thread.interrupt();

    }
}

class Runnable2 implements Runnable {

    //      子类不能比父类方法抛出更多异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->" + "begin");
//            睡眠一年
        try {
//                java.lang.InterruptedException: sleep interrupted
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--->" + "end");
    }

}
