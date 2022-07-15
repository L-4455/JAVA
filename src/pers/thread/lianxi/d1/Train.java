package pers.thread.lianxi.d1;

import java.util.Scanner;

/**
 * @Author LiZiHao
 * @Date 2022/07/14/20:09
 */
public class Train {
    private int ticket = 100;

    public Train() {
    }

    public Train(int ticket) {
        this.ticket = ticket;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public void BuyWindow01() {
        synchronized (this) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("你要买几张?");
            int i = scanner.nextInt();
            System.out.println("总票:" + this.getTicket() + "张,");
            System.out.println(Thread.currentThread().getName() + "购票" + i + "张");

            int lastTicket = this.getTicket() - i;
            this.setTicket(lastTicket);
            System.out.println("余票:" + this.getTicket() + "张,");

        }
    }

    public void BuyWindow02() {
        synchronized (this) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("你要买几张?");
            int i = scanner.nextInt();

            System.out.println("总票:" + this.getTicket() + "张");
            System.out.println(Thread.currentThread().getName() + "购票" + i + "张");
            int lastTicket = this.getTicket() - i;
            this.setTicket(lastTicket);
            System.out.println("余票:" + this.getTicket() + "张,");

        }
    }
}
