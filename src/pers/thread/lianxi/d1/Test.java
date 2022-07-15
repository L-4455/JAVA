package pers.thread.lianxi.d1;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/20:18
 */
public class Test {
    public static void main(String[] args) {
        Train train = new Train();

        Thread t1 = new TrainThread(train);

        Thread t2 = new TrainThread(train);

        Thread t3 = new TrainThread(train);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");


        t1.start();
        t2.start();
        t3.start();


    }
}
