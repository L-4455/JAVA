package pers.luochen.polymorphism;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-08 22:25:28
 * @LastEditTime: 2022-04-08 23:03:04
 */
public class Dog extends Pet {

    @Override
    public void eat() {
        System.out.println("你真狗");
    }
}
