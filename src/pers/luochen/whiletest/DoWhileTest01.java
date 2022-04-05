package pers.luochen.whiletest;

/**
 * @author LiZhiHao
 * @date 2022/2/26 19:55
 */
public class DoWhileTest01 {
    public static void main(String [] args){
        /*
        *
        *
        * do.while的语法结构
        * do{
        *
        * }while();
        *
        * do.while和while不同
        * while有可能会一次也不执行
        * 但是do.while不同，do.while总会执行一次，即使while为false.
        * */
        do{
            System.out.println("Hello World");
        }while(true);
    }
}
