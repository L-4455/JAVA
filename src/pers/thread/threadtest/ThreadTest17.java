package pers.thread.threadtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/07/15/16:26
 */
public class ThreadTest17 {
    /*
    1.使用wait和notify实现生产者和消费者模式

    2.什么是"生产者和消费者模式"?
          生产线程负责生产,消费线程负责消费
          两者达到关系均衡
    3.wait和notify方法不是线程对象的方法,是所有java对象的一个方法.

    4.wait方法和notify方法建立在线程安全基础之上

    5.wait方法作用:o.wait()让正在o对象上活动的线程进入等待状态,并且会释放掉之前占有的对象锁.

    6.notify的作用:o.notify()唤醒正在o对象上等待的线程,但是不会释放对象之前占有的对象锁.

    7.模拟这样一个需求:
        仓库采用List集合.
        list集合中只能存放1个数据,
        1个数据表示仓库满了.
        如果list集合中的元素个数是0,就去生产.如果不是0,就去消费.
        保证list集合中永远都是最多1个元素.



         */
    public static void main(String[] args) {
//        创建仓库对象,设仓库只能放一个东西.
        List list = new ArrayList();
//        创建线程对象
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者");
        t2.setName("消费者");

        t1.start();
        t2.start();
    }
}

/**
 * 生产者
 */
class Producer implements Runnable {
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
//        一直生产
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    try {
//                    如果集合里有数据,那么就不在生产,线程进入等待,让消费者去消费.
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                仓库没有数据
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "--->" + obj);
//                唤醒消费者
                list.notify();
            }
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable {
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    try {
//                    如果仓库中数据为0,就不再消费,该线程进入等待,让生产者去生产.
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                仓库有数据
                for (int i = 0; i < list.size(); i++) {
                    Object remove = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "--->" + remove);
                }
//                唤醒生产者
                list.notify();
            }
        }
    }
}

