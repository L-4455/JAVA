/**
 * @author: LiZhiHao
 * @Date: 2022-04-08 22:26:15
 * @LastEditTime: 2022-04-08 23:04:58
 */
package pers.luochen.polymorphism;

public class Test03 {
    public static void main(String[] args) {
        /**
         * 创建主人对象
         */
        Owner owner = new Owner();
        /**
         * 一下代码的耦合度低,如果主人每天喂养的宠物都不一样,一天一个样,则主人类和测试类都需要添加大量的代码
         * 所以我们对于主人,不让主人在面向具体的宠物,而是面向一个类一个模板:"宠物"模板,这个模板代表了所有的宠物品种.
         * 我们只需要让主人面向宠物模板就行,添加一个宠物,只需要在测试类创建该宠物的对象即可调用.
         * 在java中我们要时刻有着:面向对象编程,抽象类.不要面向具体编程.
         * 也就是说如果代码需求有变,我们要以最少的修改代码量来高效的完成新的需求,这就是软件的扩展力.
         */
        // Pet pet = new Pet();
        // Dog dog = new Dog();
        // Monkey monkey = new Monkey();
        // She she = new She();
        // owner.feed(dog);
        // owner.feed(Monkey);
        // owner.feed(she);
        owner.feed(new Dog());
        owner.feed(new Monkey());
        owner.feed(new Snake());
        owner.feed(new Fish());
    }
}
