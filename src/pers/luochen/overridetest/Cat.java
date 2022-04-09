/**
 * @author: LiZhiHao
 * @Date: 2022-04-06 22:59:27
 * @LastEditTime: 2022-04-06 23:10:37
 */
package pers.luochen.overridetest;

public class Cat extends Animal{
    /**
     * 根据业务需求,此时父类中的方法已经不能满足业务,所以需要进行方法的覆盖。
     */
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
    
}
