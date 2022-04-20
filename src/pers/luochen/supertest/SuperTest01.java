package pers.luochen.supertest;

/**
 * @Author LiZiHao
 * @Date 2022/04/15/13:35
 */
public class SuperTest01 {
    /**
     * super是一个关键字与 this对比:
     * this 能出现在实例方法和构造方法中;
     * this 的语法是:this.和this();
     * this 不能出现在静态方法中;
     * this 只能在构造方法中的第一句;
     * this 关键字大部分情况下是可以省略的;
     * 只有在区分局部变量和成员变量之实例变量时使用.如:
     * public Test(String name){
     * this.name = name;
     * }
     * this()之能出现在构造方法的第一行,目的是通过当前构造方法调用本类对象中的其他构造方法
     * 目的是:代码复用.
     * super 能出现在实例方法和构造方法中;
     * super 的语法是:super.和super();
     * super 不能出现在静态方法中;
     * super 只能在构造方法中的第一句;
     * super 关键字大部分情况下是可以省略的;
     * super在什么情况下是不不能省略呢? --------
     * super()只能出现在构造方法的第一行,目的是通过当前构造方法调用父类中的构造方法,目的是:代码复用.
     * <p>
     * 重要结论:
     * 在构造方法中既没有this()又没有super()时,会默认有一个super();来使用.
     * super()默认调用的是父类中的无参数构造方法,即使super()不写也是存在的,除非写了this();
     */
    public static void main(String[] args) {
        /*
            输入结果:A的无参数构造方法
                    B的无参数构造方法
             为什么是先执行的父类中的无参数构造方法呢?
             我们在创建B类对象时如没有传递参数则默认调用无参数构造方法.而在构造方法中的第一行会有super();语句.
             super();语句默认调用父类中的无参数构造方法.所以是A类中的无参数构造方法最先执行.
         */

        new B();

    }
}

class A1 {
    /*
        java: 无法将类 pers.luochen.supertest.A中的构造器 A应用到给定类型;
                需要: java.lang.String
                找到: 没有参数
                原因: 实际参数列表和形式参数列表长度不同
         为什么会报错呢?
         在构造方法中,如果我们有了有参数构造方法,那么java不再给我们提供无参数构造方法,需要手动写出来.
         也就是说在一个类中如果没有任何构造方法那么会默认有一个无参数构造方法,只是没显示出来.

         所以说:在自定义类中,我们一定要手动写无参数构造方法,这样可以避免子类创建失败.
         当然我们也可以使用super(实参);来调用父类中的有参数构造方法来避免没有无参数构造方法而调用失败.
         但还是建议手动写无参数构造方法,因为super(实参);并不是主要在这里使用的.
     */

    public A1() {
        System.out.println("A的无参数构造方法");
    }

    public A1(String name) {
        System.out.println("A类的有参数构造方法(String)");

    }
}

class B1 extends A1 {
    public B1() {
        //这里是有super();的,即使不写也是默认有的.
        super("lisi");
        System.out.println("B的无参数构造方法");
    }
}
