/**
 * @author: LiZhiHao
 * @Date: 2022-04-06 22:16:54
 * @LastEditTime: 2022-04-06 23:13:06
 */
package pers.luochen.overridetest;

public class OverRide {
    /**
     * 方法重载
     * 在同一个类中有相似的功能代码,这时可以方法名相同,参数列表不同.
     * 参数列表中:顺序,数量,类型不同算不同.
     * 方法返回值类型,修饰符可以不同.
     *      方法覆盖
     * 方法覆盖 override/overwride
     * 什么时候使用方法覆盖?方法覆盖要满足什么条件?
     * 1:当父类的业务代码不在满足于当前子类的业务需求时,我们有必要对子类的方法进行重写.重写时的方法要和父类一致,方法体可以不同.
     * 2:子类的方法修饰符,返回值类型,方法名,形参列表必须和父类相同.修饰符等级不能比父类低,只能更高.抛出异常不能更少只能更多
     * 
     * 总结:当父类的方法业务不再满足于子类的业务需求,所以我们需要对父类的方法重写,重写之后的子类方法就默认调用覆盖后的方法。
     *      也就是说:父类方法不满足子类,子类需要覆盖父类的方法,覆盖后就不再调用父类的方法.
     */
    public static void main(String[] args){

        Animal animal = new Animal();
        animal.move();


        /**
         * 让Cat走猫步
         */
        Cat cat = new Cat();
        cat.move();

        /**
         * 让Monkey走猴步
         */
        Monkey monkey = new Monkey();
        monkey.move();
    }
}
