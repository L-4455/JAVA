package pers.luochen.supertest;


/**
 * @Author LiZiHao
 * @Date 2022/04/20/18:26
 */
public class SuperTest06 {
    /**
     * 在以下代码中,父类和子类都同有一个方法,子类重写父类方法.
     * 在重写父类型方法后要想在子类中调用父类型中的方法需要使用super.
     * <p>
     * 这个原理和父类和子类中有同一个属性一个道理.
     * 也就是说:super可以访问父类中的属性和方法/私有除外.
     * 这样:super就是在区分父类方法和子类方法时不可以省略.(同名方法/属性)
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        //cat.move();
        cat.yiDong();
    }
}

class Animal {
    public void move() {
        System.out.println("Animal move");
    }
}

class Cat extends Animal {

    @Override
    public void move() {
        //super.move();
        System.out.println("Cat move");
    }

    public void yiDong() {
        //调用当前对象的move方法
        this.move();
        //调用父类中的move方法
        super.move();
        //调用当前对象的move方法
        move();
    }
}
