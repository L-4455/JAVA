package pers.thread.exam3;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/14:51
 */
public class ThreadTest01 {
    /*
        问:doOther方法会不会等待doSome方法执行结束?
            不会,因为MyThread有两个对象,T1调用了doSome,T2调用了doOther.分别是不同的对象调用的,不是同一把锁
     */
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        Thread t1 = new ThreadTest1(m1);
        Thread t2 = new ThreadTest1(m2);

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

    public synchronized void doOther() {
        System.out.println("other begin");
        System.out.println("other over");
    }
}
