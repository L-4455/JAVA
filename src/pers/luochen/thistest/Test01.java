package pers.luochen.thistest;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-05 20:53:47
 * @LastEditTime: 2022-04-05 23:09:17
 */
public class Test01 {
    /**
     * 不带static变量
     */
    int i = 10;

    /**
     * 带static方法
     */
    public static void method1() {
        //调用doSome方法
        doSome();
        Test01.doSome();

        //调用doOther方法
        Test01 test01 = new Test01();
        test01.doOther();

        //访问i
        System.out.println(test01.i);
    }

    public static void main(String[] args) {
        //调用method1方法
        Test01.method1();
        method1();

        //调用method2方法
        Test01 test01 = new Test01();
        test01.method2();
    }

    /**
     * 带有static方法
     */
    public static void doSome() {
        System.out.println("do Some!");
    }

    /**
     * 不带static方法
     */
    public void method2() {
        //访问doSome方法
        Test01.doSome();
        doSome();

        //访问doOther方法
        Test01 test01 = new Test01();
        this.doOther();
        test01.doOther();
        doOther();


        //访问i
        System.out.println(test01.i);

    }

    /**
     * 不带static方法
     */
    public void doOther() {
        System.out.println("do Other!");

    }
}

