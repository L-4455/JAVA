
package pers.luochen.polymorphism;

/**
 * 多态,java面向对象的三大特征:封装,继承,多态.
 * 
 * 1:多态(Polymorphism),意为:多种状态,在java中有了多态,让java分了编译阶段绑定和运行阶段绑定.
 * 2:多态的两种状态:
 *      向上转型(upcasting):
 *          子类转为父类:自动转换.
 *      向下转型(downcasting):
 *          父类转为子类:强制转换.
 * 3:满足多态的基本条件是两个类有继承关系,这是前提,如果没有继承关系就没有多态的事.
 * 4:语法格式:
 *      父类类名 引用名 = new 子类类名();
 * 5:java允许这种语法,父类型引用指向子类型对象.这样可以使用引用名调用子类型的方法.在静态绑定阶段时编译器会检擦语法,不会开辟空间.
 * 所以当引用的方法在父类中找不到时,即使子类型有这个方法,编译也不会通过.只有在运行阶段/动态绑定阶段才可以.但编译阶段不过,就无法运行.
 * 如果子类型重写了父类中的方法,那么在使用父类引用时会优先调用重写后的方法.
 */
/**
 * @author: LiZhiHao
 * @Date: 2022-04-07 22:27:48
 * @LastEditTime: 2022-04-07 22:34:34
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 创建Animal对象
         */
        Animal animal = new Animal();
        animal.move();

        /**
         * 创建Cat对象
         */
        Cat cat = new Cat();
        cat.move();
        /**
         * 创建Animal类型对象指向Cat对象
         */
        Animal animal2 = new Cat();
        /**
         * 虽然这里的引用是Animal但在运行阶段还是会去调用Cat中的方法.
         * 也就是说new的是谁,最后调用的就是谁的方法.但前提是这个方法在父类中也要存在.
         */
        animal2.move();
        /**
         * The method zhua() is undefined for the type Animal
         * 对于Animal类型中 zhua()是没有定义的,即使Cat类中有这个方法.
         */
        //animal2.zhua();

        /**
         * 创建Animal对象指向Bird对象,注释掉Bird中重写后的方法,得到输出结果:动物在移动
         * 这个结果看着是Animal中的move方法,实则不是,因为Bird继承了Animal方法,所以这里调用的其实是Bird中的move方法.
         */
        Animal animal3 = new Bird();
        animal3.move();

    
        


    }
}
