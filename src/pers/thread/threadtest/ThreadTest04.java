package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/11/16:12
 */
public class ThreadTest04 {
    /*
        采用匿名内部类的形式创建并启动多线程
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程--->" + i);
                }
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}
