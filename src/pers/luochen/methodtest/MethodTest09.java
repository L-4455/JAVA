package pers.luochen.methodtest;

/**
 * @author LiZhiHao
 * @date 2022/3/15 20:45
 */
public class MethodTest09 {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int retValue = sumInt(a,b);
        System.out.println("retValue" + " = " + retValue);
    }
    public static int sumInt(int a , int b){
        int result1 = a + b;
        int num = 3;
        return divide(result1,num);
    }
    public static int divide(int x, int y){
        return x / y;
    }
}
