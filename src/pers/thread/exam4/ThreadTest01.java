package pers.thread.exam4;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/14:51
 */
public class ThreadTest01 {
    /*
        问:doOther方法会不会等待doSome方法执行结束?
            会,因为这两个方法都是static修饰的,static修饰的方法为静态方法,
            静态方法遇上synchronized会去找类锁,而类锁只有一把,即使new再多对象
            只有一把锁,当T1把这把锁占用了后,T2就不能占用了,要等待T1结束,T1掉了doSome方法
            所以doOther要等待doSome方法结束.
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
    public synchronized static void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized static void doOther() {
        System.out.println("other begin");
        System.out.println("other over");
    }
}
