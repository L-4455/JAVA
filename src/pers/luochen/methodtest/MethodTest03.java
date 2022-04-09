/**
 * @author: LiZhiHao
 * @Date: 2022-02-28 15:29:22
 * @LastEditTime: 2022-04-09 23:12:49
 */
package pers.luochen.methodtest;

/**
 * @author: LiZhiHao
 * @Date: 2022-02-28 15:29:22
 * @LastEditTime: 2022-04-08 19:16:43
 */
public class MethodTest03 {
    public static void main(String[] args) {
        /*
         *
         * 在带有static的方法的调用：类名.方法名();
         * 但是在某一情况下类名.是可以省略的。以下为案例：
         * 那么在那些情况下可以省略？那些情况下不能省略？
         *
         * 不建议在一个java源文件中写两个class类。这里只是为了演示方便。
         * */

        //完整调用方法代码
        MethodTest03.doSome();
        //省略调用方法的代码
        doSome();
        /*
         * 没有类名时，会在本类中去寻找doSome方法。
         *
         * */

        //调用aSome方法
        //完整的调用方法
        MethodTest03.doSome();
        //省略的调用方法
        //编译报错：找不到符号
        //aSome();
        /*
         * 由此可以看出在调用者调用方法时，如果调用者和被调用者在同一个类体中，可以省略类名点的形式去调用方法。前提是方法是带有static的
         * 如果不在同一个类体中就无法省略类名点的形式去调用。必须使用类名.方法名;的形式调用
         *
         * */
        weather();


    }

    public static void doSome() {
        System.out.println("Hello World");
    }

    public static void weather() {
        System.out.println("Hi,China");
        //编译错误，在本类中找不到aSome方法。需要使用类名的形式调用
        Ah.aSome();
        //这个不会报错，因为在本类中也存在aSome方法。如果想要调用A类中的aSome的方法就需要加上类名
        //这个方法会从本类中去寻找aSome方法。
        aSome();
    }

    public static void aSome() {
        System.out.println("hello china");
    }
}

class Ah {
    public static void main(String[] args) {

    }

    public static void aSome() {
        System.out.println("Hello China");
    }
}
