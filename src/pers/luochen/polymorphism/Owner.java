/**
 * @author: LiZhiHao
 * @Date: 2022-04-08 22:23:08
 * @LastEditTime: 2022-04-08 23:03:32
 */
package pers.luochen.polymorphism;

public class Owner {
    /**
     * 主人类
     * 主人喂养宠物-
     * 
     * 不在以具体的宠物为对象,而是一个整体的宠物.
     * 即使主人再养了很多宠物这些宠物都会吃,面对pet去吧
     */
    /*
    public void feed(Dog dog){
        System.out.println("狗吃屎");
    }
    public void feed(Monkey monkey){
        System.out.println("猴子吃屎");

    }
    public void feed(She she){
        System.out.println("蛇吞象");

    }
    */

    public void feed(Pet pet){
        pet.eat();

    }
}
