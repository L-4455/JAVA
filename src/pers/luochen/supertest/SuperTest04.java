package pers.luochen.supertest;

/**
 * @Author LiZiHao
 * @Date 2022/04/20/17:49
 */
public class SuperTest04 {
    /*
        super内存图分析.
     */
    public static void main(String[] args) {
        Vip1 Vip1 = new Vip1("张三");
        Vip1.doSopping();
    }
}

class Customer1 {
    String name;

    public Customer1() {

    }

    public Customer1(String name) {
        this.name = name;
    }

}

class Vip1 extends Customer1 {
    public Vip1() {

    }

    public Vip1(String name) {
        this.name = name;
    }

    public void doSopping() {
        /*
                张三在购物
                张三在购物
                张三在购物
         */
        System.out.println(this.name + "在购物");
        System.out.println(super.name + "在购物");
        System.out.println(name + "在购物");
    }
}
