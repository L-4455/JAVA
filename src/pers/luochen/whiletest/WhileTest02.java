package pers.luochen.whiletest;

/**
 * @author LiZhiHao
 * @date 2022/2/26 19:14
 */
public class WhileTest02 {
    public static void main(String [] args){
        int i =1;
        while(i <= 10){
            System.out.println(i++);
        }
        System.out.println("---------------------");
        int q =10;
        while(q >= 0){
            System.out.println(q--);
        }
        System.out.println("---------------------");
        int w =10;
        while(w >= 0){
            System.out.println(--w);
        }
        System.out.println("---------------------");
        int b =10;
        while(b >= 0){
            System.out.println(b--);
            System.out.println("b---->" + b);
        }
    }
}
