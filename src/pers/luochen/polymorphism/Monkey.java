/**
 * @author: LiZhiHao
 * @Date: 2022-04-08 22:34:16
 * @LastEditTime: 2022-04-08 23:02:47
 */
package pers.luochen.polymorphism;

public class Monkey extends Pet{
    
    @Override
    public void eat() {
        System.out.println("猴翻天");
    }
}
