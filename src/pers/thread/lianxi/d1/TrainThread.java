package pers.thread.lianxi.d1;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/20:09
 */
public class TrainThread extends Thread {
    private Train train;

    public TrainThread() {
    }

    public TrainThread(Train train) {
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public void run() {

        if (Thread.currentThread().getName().equals("T1")) {
            train.BuyWindow01();
        }
        if (Thread.currentThread().getName().equals("T2")) {
            train.BuyWindow02();
        }
        if (Thread.currentThread().getName().equals("T3")) {
            train.BuyWindow02();
        }
    }
}
