package pers.luochen.lianxi01;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/22:41
 */
public class GuessTheNumber02 {
    /*
        随机生成一个0-100的数字让用户猜,猜大猜小都有提示.
     */
    public static void main(String[] args) {
        Cai();
    }

    public static void Cai() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);
        while (true) {
            int i = scanner.nextInt();
            if (i > num) {
                System.out.println("猜大了");
            } else if (i < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
