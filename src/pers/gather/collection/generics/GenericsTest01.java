package pers.gather.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/7/2/0002/10:16
 */
public class GenericsTest01 {
    /*
        泛型机制
        在不使用泛型机制下,分析程序的缺点
        1、泛型是在JDK5之后推出的新特性。
        2、泛型的优点:
                指定了集合中存储数据的类型,使集合中的数据类型统一。
        3、泛型的缺点:
                集合存储数据类型单一，缺少了多样性。
        4、泛型使用方法,在支持泛型机制的集合后加  <数据类型> 。

        5、如果泛型指定的数据类型有子类,那么想要调用子类的特有方法还是需要向下转型的。
        6、泛型只能写引用数据类型,不能写基本数据类型
     */
    public static void main(String[] args) {

/*          不适用泛型机制程序的缺点:需要大量的转型
//        创建集合对象
        List list = new ArrayList();
//        创建Cat对象
        Cat cat  = new Cat();
//        创建Monkey对象
        Monkey monkey = new Monkey();
//        添加元素
        list.add(cat);
        list.add(monkey);

//        获取迭代器对象
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
//            调用Animal中的方法
            if(obj instanceof Animal){
//                向下转型
                Animal animal = (Animal)obj;
                animal.move();
            }
//            调用子类cat特有的方法
            if(obj instanceof Cat){
//                向下转型
                Cat cat1 = (Cat)obj;
                cat1.CatMouse();
            }
//            调用Monkey特有的方法
            if(obj instanceof Monkey){
//                向下转型
                Monkey monkey1 = (Monkey)obj;
                monkey1.monkeyFly();
            }
        }*/
//        创建集合对象
        List<Animal> list = new ArrayList<Animal>();
//        创建Cat对象
        Cat cat = new Cat();
//        创建Monkey对象
        Monkey monkey = new Monkey();
//        添加元素
        list.add(cat);
        list.add(monkey);

        Iterator<Animal> it = list.iterator();
        while (it.hasNext()) {
            Animal animal = it.next();
            animal.move();
        }
    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal {
    public void CatMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Monkey extends Animal {
    public void monkeyFly() {
        System.out.println("猴子在飞");
    }
}

