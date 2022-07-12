package pers.thread.threadtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/11/16:04
 */
public class ThreadTest03 {
    /*
        创建线程的第二中方式
        一个类实现Runnable接口,实现里面的run方法即可.
     */
    public static void main(String[] args) {
//        创建可运行类
        Monkey monkey = new Monkey();
//        创建线程对象,传递一个类型为Runnable的类
        Thread thread = new Thread(monkey);
//        合并代码
        Thread thread1 = new Thread(new Monkey());
//        启动多线程,会自动调用Runnable类型中的run方法.
        thread.start();
        thread1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}

class Monkey implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程--->" + i);
        }
    }
}
