package pers.thread.deadlock;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/15:34
 */
public class DeadlockTest {
    /*
        死锁
        此时程序发生死锁,即不报错也不异常,会一直等待下去.
     */
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread1(o1, o2);
        Thread t2 = new Thread2(o1, o2);

        t1.start();
        t2.start();

    }
}

class Thread1 extends Thread {
    Object o1;
    Object o2;

    public Thread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                System.out.println("SB");

            }
        }
    }
}

class Thread2 extends Thread {
    Object o1;
    Object o2;

    public Thread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {
                System.out.println("SB");
            }
        }
    }
}
