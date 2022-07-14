package pers.thread.exam1;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/14:51
 */
public class ThreadTest01 {
    /*
        问:doOther方法会不会等待doSome方法执行结束?
        不会,因为doOther不是synchronized修饰的.
     */
    public static void main(String[] args) {
        MyThread mc = new MyThread();
        Thread t1 = new ThreadTest1(mc);
        Thread t2 = new ThreadTest1(mc);

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}

class ThreadTest1 extends Thread {
    MyThread mc;

    public ThreadTest1(MyThread mc) {
        this.mc = mc;
    }

    public void run() {
        if (Thread.currentThread().getName().equals("T1")) {
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("T2")) {
            mc.doOther();
        }
    }
}

class MyThread {
    public synchronized void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public void doOther() {
        System.out.println("other begin");
        System.out.println("other over");
    }
}
