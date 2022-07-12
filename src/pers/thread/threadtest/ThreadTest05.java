package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/11/17:15
 */
public class ThreadTest05 {
    /*
        获取线程的名称
            thread.getName();
        设置线程的名称
            thread.setName();
        获取当前线程对象
            static Thread currentThread()

        线程名称默认:
            Thread-0
            Thread-1
            Thread-2
            Thread-3
            Thread-4
            ....
     */
    public static void main(String[] args) {

//        创建线程对象
        Thread thread = new Thread(new Poke());
        thread.setName("卧槽666");
//        启动线程
        thread.start();

//        获取当前线程对象,currentThread表示当前线程对象
        Thread currentThread = Thread.currentThread();
        currentThread.setName("傻逼玩意");
        String name = currentThread.getName();
        System.out.println(name + "main");


    }
}

class Poke implements Runnable {
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + "Poke");
    }
}