package pers.luochen.supertest;

/**
 * @Author LiZiHao
 * @Date 2022/04/19/23:16
 */
public class SuperTest02 {
    public static void main(String[] args) {
        /*
            分析一下程序的执行结果
            1
            3
            6
            5
            4
         */
        new C();

    }
}

class A {
    public A() {
        System.out.println("1");
    }
}

class B extends A {
    public B() {
        System.out.println("2");
    }

    public B(String name) {
        //这里是有super()的,即使不写.
        super();
        System.out.println("3");
    }

}

class C extends B {
    public C() {
        this("hangman");
        System.out.println("4");
    }

    public C(String name) {
        this("lisi", 10);
        System.out.println("5");
    }

    public C(String name, int age) {
        super("wang");
        System.out.println("6");
    }
}
