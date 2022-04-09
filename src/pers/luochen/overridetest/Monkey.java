/**
 * @author: LiZhiHao
 * @Date: 2022-04-06 22:59:40
 * @LastEditTime: 2022-04-06 23:10:44
 */
package pers.luochen.overridetest;


public class Monkey extends Animal {
    /**
     * 根据业务需求,此时父类中的方法已经不能满足业务,所以需要进行方法的覆盖。
     */
    @Override
    public void move() {
        System.out.println("猴子在走猴步");
    }    
}
