package pers.luochen.polymorphism;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-07 22:19:56
 * @LastEditTime: 2022-04-07 22:45:09
 */
public class Cat extends Animal {

    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }

    public void zhua() {
        System.out.println("猫在抓老鼠");
    }
}
