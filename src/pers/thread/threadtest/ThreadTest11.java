package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/11:07
 */
public class ThreadTest11 {
    /*
        线程的调度
        调度分为两种
        1.抢占式调度
            java采用的就是这种方式,哪个线程的优先级高抢到时间片哪个线程就执行.线程之间的优先级是5
        2.均匀式调度
            每个线程抢到的概率是一样的.平均分配CPU时间片,每个线程的长度和时间片长度一样
            平均分配,一切平等.
        3.每个线程都有优先级
            分别是:
            默认优先级:5
            最低优先级:1
            做高优先级:10
        4.线程优先级指的是该线程抢夺CPU时间片的概率相对较高.
        5.关于线程调度的方法:
            返回该线程的优先级
            int getPriority()
            更改线程的优先级
            void setPriority(int newPriority)
            暂停当前线程,让位给其他线程
            static void yield()
            线程合并
            void join()

     */
    public static void main(String[] args) {
//        设置当前线程的优先级
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getName() + "优先级--->" + Thread.currentThread().getPriority());


        Thread thread = new Thread(new Runnable6());
        thread.setName("WO");
        System.out.println(thread.getName() + "优先级--->" + thread.getPriority());

        thread.start();
//        设置当前线程的优先级

        thread.setPriority(10);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }
}

class Runnable6 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
