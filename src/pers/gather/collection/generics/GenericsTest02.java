package pers.gather.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/7/2/0002/10:35
 */
public class GenericsTest02 {
    /*
        泛型的类型自动推断
     */
    public static void main(String[] args) {
//        只要前面指定了泛型的数据类型,后面的泛型<>不需要在写数据类型
//        这是JDK8之后的新特性:类型自动推断/砖石表达式  <> .
        List<Animal> list = new ArrayList<>();

        Cat c = new Cat();
        Monkey monkey = new Monkey();

        list.add(c);
        list.add(monkey);

        Iterator<Animal> it = list.iterator();
        while (it.hasNext()) {
//            使用了泛型,迭代器返回的就是泛型所指定的类型了,不再是Object了
//            使用了泛型可以直接调用Animal的方法了.
            Animal animal = it.next();
            animal.move();

//            注意:要调用子类的特有方法还是要向下转型
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.CatMouse();
            }
            if (animal instanceof Monkey) {
//                向下转型
                Monkey monkey1 = (Monkey) animal;
                monkey1.monkeyFly();
            }
        }
    }
}
