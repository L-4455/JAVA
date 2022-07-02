package pers.array.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/22/21:52
 */
public class ArrayTest07 {
    /*
        数组中的元素保存的是引用时该怎么办?
        数组中保存的元素不会是java对象而是java对象的内存地址.
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal[] animals = {animal, animal1};
        for (int i = 0; i < animals.length; i++) {
            /*Animal a = animals[i];
            a.move();*/
//            合并,animals[i]中保存的是数组中的java对象的内存地址.animals[i]不是数组,而是数组中保存的元素
            animals[i].move();
        }
        System.out.println("==================");
        Animal[] animals1 = new Animal[2];
        for (int i = 0; i < animals1.length; i++) {
            animals1[0] = new Bird();
//            不兼容的类型: pers.array.person无法转换为pers.array.Animal
//            Animal类型的数组只能保存Animal类型的.
//            animals1[1] = new person();

//            子类可以保存.一个类的子类可以保存在夫类的数组中
            animals1[1] = new Cat();
            animals1[i].move();
        }
        System.out.println("+++++++++++++++++++++++++++++");

//        创建一维数组存放Cat和Bird.
        Animal[] animal2 = {new Cat(), new Bird()};
        for (int i = 0; i < animal2.length; i++) {
//            不兼容的类型: pers.array.Animal无法转换为pers.array.Cat
//            animal2[0]是Animal类型的数组元素,无法转换为Cat类型的
//            Cat cat = animal2[0];
            Animal animal3 = animal2[i];
//                调用move方法,因为Animal中有move,子类重写了move方法,所以不需要向下转型.
//                animal3.move();

            if (animal2[i] instanceof Cat) {
                Cat cat = (Cat) animal2[i];
                cat.catMouse();
            } else if (animal2[i] instanceof Bird) {
                Bird bird = (Bird) animal2[i];
                bird.birdFlay();
            }
        }
    }
}

class Animal {
    public void move() {
        System.out.println("Animal move");
    }
}

class person {

}

class Cat extends Animal {
    public void move() {
        System.out.println("Cat move");
    }

    //    Cat特有的方法
    public void catMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("Bird move");
    }

    //    Bird特有的方法
    public void birdFlay() {
        System.out.println("Bird flay");
    }
}


