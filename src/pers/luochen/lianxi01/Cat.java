/**
 * @author: LiZiHao
 * @Date: 2022-04-13 15:07:27
 * @LastEditTime: 2022-04-13 15:10:42
 */
package pers.luochen.lianxi01;

public class Cat extends Animal{

    @Override
    public void doSome() {
        System.out.println("我是你爷");
    }
    public void doOther(){
        System.out.println("你在看啥呢!");
    }
}
