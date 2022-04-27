package pers.luochen.abstract_test;

/**
 * @Date: 2022-04-25 21:42:29
 * @Author: LiZiHao
 */
public class AbstractTest02 {
    /**
     * 重要结论:
     * 当非抽象类继承抽象类时,抽象类中有抽象方法,那么子类必须实现抽象方法,否则会报错.
     * 这是java语言规定的,不这样做会报错,编译过不去.
     */

    public static void main(String[] args) {
//        多态(父类性引用指向子类型对象)
        Animal animal = new Cat();
        animal.move();
//        多态
        Animal animal1 = new Monkey();
        animal1.move();

        Animal animal2 = new Bird();
        animal2.move();


    }
}

// 抽象类
abstract class Animal {
    public abstract void move();
}


/**
 * 编辑报错:Cat 类型必须实现继承的抽象方法 Animal.doSome()
 * 因为Cat继承了Animal,而Animal是抽象类中间有抽象方法,子类Cat把父类中的抽象方法继承了过来.
 * 而抽象方法只能写在抽象类中,但是子类又不是抽象类,所以会报错.
 * 修改方法:
 * 1:把子类改为抽象类
 * 2:实现抽象类中的抽象方法
 * 这里的"实现"既是:覆盖/重写
 */
// 非抽象类继承抽象类
class Cat extends Animal {

    // public void doSome();

    // 实现抽象类中的抽象方法
    @Override
    public void move() {
        System.out.println("猫在跳舞");
    }
}

class Monkey extends Animal {
    @Override
//    实现抽象类中的抽象方法
    public void move() {
        System.out.println("猴子在笑");
    }
}

class Bird extends Animal{
	public void move(){
        System.out.println("鸟儿在吃食物");
		System.out.println("鸟儿在飞翔");
	}
}