package pers.luochen.methodtest;

/**
 * MethodTest010
 * @author LiZhiHao
 */
public class MethodTest010 {

    public static void main(String[] args) {
        /**
         * 
         * 方法重载机制
         * 
         * 1：方法重载的目的是为了优化代码的执行效率，让多个相似功能的代码组成一个方法
         * 这样我们使用者调用的时候不用记太多的方法名。
         * 2：方法重载要满足哪些条件？
         * (1)方法的功能相似，在同一类中。
         * (2)方法的形式参数列表不能再同一类中重复出现，但是顺序，数量，数据类型可以不同。
         * 顺序不同就是一个方法。
         * 3：方法重载和什么有关系？和什么没关系？
         * (1)方法重载和方法名，形参有关系
         * (2)方法重载和修饰符列表无关，和返回值类型无关。
         */

        sumInt(20,10);
        sumInt(20.0,10.0);
        sumInt(20.90,10.90);
        sumInt(20333,103333);
        sumInt(20.90909,10.0000);
        sumInt('a','s');
        sumInt(true,false);
      
        
    }
    public static void sumInt(byte a,int b){
        System.out.println("a + b " + " = " + (a + b)); 
    }
    public static void sumInt(short a,int b){
        System.out.println("a + b " + " = " + (a + b)); 
    }
    public static void sumInt(int a,int b){
        System.out.println("a + b " + " = " + (a + b)); 
    }
    public static void sumInt(long a,long b){
        System.out.println("a + b " + " = " + (a + b)); 
    }
    public static void sumInt(float a,float b){
        System.out.println("a + b " + " = " + (a + b)); 
    }
    public static void sumInt(double a,double b){
        System.out.println("a + b " + " = " + (a + b)); 
    }
    public static void sumInt(char a,char b){
        System.out.println("a + b " + " = " + (a + b)); 
    }
    public static void sumInt(boolean a,Boolean b){
        //System.out.print(a,b); 
    }
    
}