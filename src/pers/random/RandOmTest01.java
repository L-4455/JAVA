package pers.random;

import java.util.Random;

/**
 * @Author LiZiHao
 * @Date 2022/6/13/20:18
 */
public class RandOmTest01 {
    /*
        产生随机数
     */
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);

        Random random1 = new Random();
//        bound:临界值,不能超过这个数也不包括这个数.
//        取值范围在[0-100],不包括101
        int i1 = random1.nextInt(101);
        System.out.println(i1);
    }
}
