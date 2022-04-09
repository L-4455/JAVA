package pers.luochen.polymorphism;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-07 22:20:21
 * @LastEditTime: 2022-04-08 20:51:30
 */

public class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
    public void fly(){
            System.out.println("人人都会打飞机");

    }
}
