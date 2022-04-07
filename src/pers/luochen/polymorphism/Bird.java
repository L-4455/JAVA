/**
 * @author: LiZhiHao
 * @Date: 2022-04-07 22:20:21
 * @LastEditTime: 2022-04-07 22:53:36
 */
package pers.luochen.polymorphism;


public class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}
