package pers.luochen.lianxi01;

/**
 * @Author LiZiHao
 * @Date 2022/04/21/17:03
 */
public class Calculator {
    public static void main(String[] args) {
        /*通过无参数构造方法创建对象并初始化对象属性*/
        Number number = new Number(10, 30);
        /*调用Number"加减乘除"方法*/
        number.addition();
        number.subtraction();
        number.multiplication();
        number.division();

    }
}

class Number {
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void addition() {
        System.out.println(this.getN1() + "+" + this.getN2() + "=" + (this.getN1() + this.getN2()));
    }

    public void subtraction() {

        System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
    }

    public void multiplication() {

        System.out.println(this.getN1() + "*" + this.getN2() + "=" + (this.getN1() * this.getN2()));
    }

    public void division() {
        if (n2 == 0) {
            System.out.println("除数不能为零");
            return;
        }
        System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
    }
}
