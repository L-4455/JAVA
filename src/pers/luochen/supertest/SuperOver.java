package pers.luochen.supertest;

/**
 * @Author LiZiHao
 * @Date 2022/04/20/21:15
 */
public class SuperOver {
    /**
     * super总结:
     * super 能出现在实例方法和构造方法中;
     * super 的语法是:super.和super();
     * super 不能出现在静态方法中;
     * super 只能在构造方法中的第一句;
     * super 关键字大部分情况下是可以省略的;
     * super.在什么情况下是不不能省略呢?
     * <p>
     * 在父类和子类中同有一个属性/方法,想要通过子类访问父类时,super.不能省略.
     * <p>
     * super.属性名             [访问父类属性]
     * super.方法名(实际参数);   [访问父类方法]
     * super(实际参数)          [调用父类方法]
     * super()只能出现在构造方法的第一行,目的是通过当前构造方法调用父类中的构造方法,目的是:创建子类对象时,先初始化父类属性特征.
     */
    public static void main(String[] args) {

    }
}
