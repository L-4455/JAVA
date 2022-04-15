/**
 * @author: LiZiHao
 * @Date: 2022-04-13 15:05:20
 * @LastEditTime: 2022-04-13 15:12:16
 */
package pers.luochen.lianxi01;

public class Test01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.doSome();
        cat.doSome();

        Animal animal2 = new Cat();
        animal2.doSome();
        //animal2.doOther();

        /*
         * 强制类型转换,父类转为子类,调用子类特有的方法.
         */
        Cat cat2 = (Cat)animal2;
        cat2.doOther();
    }
    
}
