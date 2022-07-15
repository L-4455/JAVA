package pers.thread.threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author LiZiHao
 * @Date 2022/07/15/10:03
 */
public class ThreadTest16 {
    /*
        实现线程的第三种方式
        这种方式可以获取线程执行结束后的返回值
     */
    public static void main(String[] args) {
        /*
        匿名内部类的方式
       FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println(Thread.currentThread().getName() + "--->" + "begin");
                Thread.sleep(1000 * 10);
                System.out.println(Thread.currentThread().getName() + "--->" + "end");
                return 100 + 300;
            }
        });
        */
        Thread02 t = new Thread02();
        FutureTask task = new FutureTask(t);
        Thread thread = new Thread(task);
        thread.setName("T1");
        thread.start();

        try {
//            这个方法出现在主线程中.
//            这个方法会造成当前线程受阻塞,因为get会获取 T1 线程结束
//            T1 线程不结束,get就获取不到返回值,就没发往下继续执行.所以当前线程
//            main会受阻塞.
            Object o = task.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
//        T1线程不结束,这行代码不会执行.
        System.out.println("Hello World");
    }
}

class Thread02 implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "--->" + "begin");
        Thread.sleep(1000 * 10);
        System.out.println(Thread.currentThread().getName() + "--->" + "end");
        return 100 + 300;
    }
}