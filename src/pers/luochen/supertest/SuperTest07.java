package pers.luochen.supertest;


/**
 * @Author LiZiHao
 * @Date 2022/04/20/21:00
 */
public class SuperTest07 {


    public static void main(String[] args) {
        /*
                super.在什么情况下不可以省略

                super.永远不可以省略
         */
        SuperTest07 superTest07 = new SuperTest07();
        superTest07.doSome();

    }

    public void doSome() {
        String name;

        System.out.println(this);
        //java: 需要'.' super后需要跟.
        //System.out.println(super);
        System.out.println(super.hashCode());

        /*
                我们知道 this是一个引用,保存对象地址.指向一个对象
                在22行代码中super不可以直接执行,这也就是说明了:
                super不是一个引用,不保存任何对象地址,不指向任何对象.
         */
        new Monkey();
        new Monkey("LiSiw");
        Monkey monkey = new Monkey();
        monkey.setName("wang");
    }
}

class Animal1 {
    String name;

    public Animal1() {
    }

    public Animal1(String name) {
        this.name = name;
    }

    public void doSome(String name) {
        System.out.println(name);
    }

}

class Monkey extends Animal1 {
    String name;

    public Monkey() {
        super.doSome("wang");
    }

    public Monkey(String name) {
        super("lisi");
        super.name = name;
        super.doSome("wang");
        System.out.println(super.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
