package pers.luochen.supertest;

/**
 * @Author LiZiHao
 * @Date 2022/04/20/18:08
 */
public class SuperTest05 {
    /*
        super内存图分析.
        思考:什么情况下super.不可以省略.

        也就是说从一下代码可以看出:
        this在什么情况下不能省略?
            public void setSuperTest05(String name){
                this.name = name;
            }
        this在区分局部变量和成员变量之实例变量时不能省略.


        super在什么情况下不能省略?

        在父类型中和子类型中有同名的属性时,想要在子类中访问父类中的那个同名属性时.super不能省略
        也就是说:父中有,子中也有.那么在子中想要访问父中的,super就不能省略.


        public
     */
    public static void main(String[] args) {
        Vip vip = new Vip("张三");
        vip.doSopping();
    }
}

class Customer {
    String name;

    public Customer() {

    }

    public Customer(String name) {
        this.name = name;
    }

}

class Vip extends Customer {
    String name;

    public Vip() {

    }

    public Vip(String name) {

        super.name = name;
    }

    public void doSopping() {
        /*
                张三在购物
                张三在购物
                张三在购物
          ------------------
                null在购物
                张三在购物
                null在购物
         */
        //当构造方法执行结束后如果没有给类中的属性赋值,系统则赋默认值.
        //this.name表示调用当前对象中的name属性
        System.out.println(this.name + "在购物");

        //super.name表示调用父类中的name属性
        System.out.println(super.name + "在购物");

        //在没有加this.情况下,系统默认提供this.name
        System.out.println(name + "在购物");
    }
}

