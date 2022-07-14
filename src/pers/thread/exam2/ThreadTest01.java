package pers.thread.exam2;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/14:51
 */
public class ThreadTest01 {
    /*
        问:doOther方法会不会等待doSome方法执行结束?
        会,因为doOther和doSome都是synchronized修饰的.
        myThread对象只new了一个对象.所以只有一把锁.
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread t1 = new ThreadTest1(myThread);
        Thread t2 = new ThreadTest1(myThread);

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}

class ThreadTest1 extends Thread {
    MyThread myThread;

    public ThreadTest1(MyThread myThread) {
        this.myThread = myThread;
    }

    public void run() {
        if (Thread.currentThread().getName().equals("T1")) {
            myThread.doSome();
        }
        if (Thread.currentThread().getName().equals("T2")) {
            myThread.doOther();
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

    public synchronized void doOther() {
        System.out.println("other begin");
        System.out.println("other over");
    }
}
