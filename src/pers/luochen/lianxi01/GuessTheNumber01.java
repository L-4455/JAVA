package pers.luochen.lianxi01;

/**
 * @Author LiZiHao
 * @Date 2022/04/20/21:54
 */
public class GuessTheNumber01 {
    /*
            猜数字游戏,这里的数字先由用户自定义.不使用随机数.
     */
    public static void main(String[] args) {
        A a = new A(88);
        B b = new B(a);
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            while (true) {
                System.out.print("请输入一个数字:");
                int number = scanner.nextInt();
                b.cai(number);
            }
        }
    }
}

class A {
    private int i;

    public A() {

    }

    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class B {
    private A a;

    public B() {

    }

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void cai(int num) {
        //实际数字
        int hashish = a.getI();
        if (num == hashish) {
            System.out.println("猜对了");
            System.exit(0);
        } else if (num < hashish) {
            System.out.println("猜小了");
        } else if (num > hashish) {
            System.out.println("猜大了");
        }
    }
}

