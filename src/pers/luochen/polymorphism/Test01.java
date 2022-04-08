/**
 * @author: LiZhiHao
 * @Date: 2022-04-08 20:05:26
 * @LastEditTime: 2022-04-08 22:21:11
 */
package pers.luochen.polymorphism;

public class Test01 {

    public static void main(String[] args) {

        /**
         * 继承中的向下转型(downcating).
         * 1:向下转型最基本的条件是两个类之间有继承关系.
         * 2:什么时候使用强制类型转换?
         * 1:当需要调用子类中特有的方法或属性,需要进行强制类型转换,但强制类型转换存在隐患.
         * 
         * 
         */
        /**
         * 创建Cat对象
         */
        Cat cat = new Cat();
        cat.zhua();
        if(cat instanceof Cat){
            System.out.println("cat引用的对象是Cat");
        }else{
            System.out.println("cat引用的对象不是Cat");
        }

        /**
         * 创建Bird对象
         */
        Bird bird = new Bird();
        bird.fly();
        /**
         * 创建Animal对象
         */
        Animal animal = new Animal();
        animal.move();
        /**
         * 创建Animal对象引用指向Cat类型引用.
         */
        Animal animai2 = new Cat();
        animai2.move();

        /*
         * 调用Cat中特有的方法.
         * 调用失败,在编译阶段编译器只检擦Animal中是否有zhua()方法,如果没有就报错.
         * 此时需要做强制类型转换.把animal2类型强制转换为Cat类型的引用.
         */
        // animal2.zhua();
        /**
         * 强制类型转换,把animal2类型引用转换为Cat类型引用,从而调用Cat中特有的方法.
         */
        Cat cat1 = (Cat) animai2;
        cat1.zhua();

        /**
         * 创建Animal对象引用指向Bird类型对象.
         */
        Animal animal3 = new Bird();
        animal3.move();
        /**
         * 当父类引用指向的是子类类型,子类类型在转换为另一个子类类型.这两个类型没有继承关系,会出现著名的异常:
         * java.lang.ClassCastException / JAVA类强制转换异常.
         * 类型强制转换异常只会在向下转型出现,向上转型一般不会出现.
         * 这里虽然没有出现编译错误,但运行会错误.怎么避免呢?java提供了一个运算符 instanceof.
         *      instanceof语法格式:
         *          (引用 instanceof 数据类型名)
         *      instanceof的数据类型结果是布尔类型true/false
         *              (animal instanceof Animal)
         *          true:表示animal指向的对象是Animal.
         *          fals:表示animal指向的对象不是Animal.
         *
         */
        
        if(animal3 instanceof Cat){
            Cat cat2 = (Cat) animal3; 
            cat2.zhua();

        }else if(animal3 instanceof Bird){
            Bird bird2 =(Bird)animal3;
            bird2.fly();
        }
    }
}
