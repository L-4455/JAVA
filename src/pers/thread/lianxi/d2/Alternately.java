package pers.thread.lianxi.d2;

/**
 * @Author LiZiHao
 * @Date 2022/07/15/17:10
 */
public class Alternately {
    /*
        交替输出
            T1--->1
            T2--->2
            T1--->3
            T2--->4
            ...
            要求:必须交替输出,T1输出奇数,T2输出偶数.
     */
    public static void main(String[] args) {
        Num num = new Num();
//        创建生产者和消费者对象
        Thread t1 = new Thread(new Producer(num));
        Thread t2 = new Thread(new Consumer(num));

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}

class Num {
    int i = 0;
}

class Producer implements Runnable {
    private Num num;

    public Producer() {

    }

    public Producer(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num.i % 2 != 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ++num.i;
                System.out.println(Thread.currentThread().getName() + "--->" + num.i);
                num.notify();
            }
        }
    }
}

class Consumer implements Runnable {
    private Num num;

    public Consumer() {

    }

    public Consumer(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num.i % 2 == 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ++num.i;
                System.out.println(Thread.currentThread().getName() + "--->" + num.i);
                num.notify();
            }
        }
    }
}
