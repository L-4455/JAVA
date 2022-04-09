/**
 * @author: LiZhiHao
 * @Date: 2022-04-06 22:19:17
 * @LastEditTime: 2022-04-06 23:03:16
 */
package pers.luochen.extendstest;

public class InherTest {
    /**
     * 继承.Java面向对象三大特征:封装,继承,多态.
     * 1:现有封装,再有继承,再有多态.
     * 2:继承是继承什么?继承哪些东西?
     * 3:在JAVA中只支持单继承,不支持多继承.但可以间接继承其他类.
     * 3:继承术语:
     * B类继承A类:
     * A类称为:父类/超类/基类/superclass
     * B类为:子类/次类/派生类/subclass
     * 4:什么可以继承?什么不可以继承?
     * 1:父类的非私有方法.
     * 2:父类的非私有属性.
     * <p>
     * 1:私有属性不能继承.
     * 2:私有方法不能继承.
     * 3:构造方法不能继承.
     * 5:继承的基本意义是为了:代码复用.但最重要的是:有了继承才有多态和覆盖.没有继承就没有多态机制和覆盖机制.
     * 6:当一个类没有明确继承某一个类时,Java默认继承java中lang中Object类,这个为根类。
     */
    public static void main(String[] args) {
        /**
         * 创建Animal对象
         */
        Animal animal = new Animal();
        animal.doSome();

        /**
         * 创建Cat对象
         */
        Cat cat = new Cat();
        cat.doSome();

        /**
         * 创建Monkey对象
         */
        Monkey monkey = new Monkey();
        monkey.doSome();

    }
}
