/**
 * @author: LiZhiHao
 * @Date: 2022-04-05 22:17:16
 * @LastEditTime: 2022-04-05 23:40:44
 */
package pers.luochen.statictest;

public class StaticTest01 {
    /**
     * 什么是static?
     * 1.static是一个关键字,翻译为:静态的或静态上下文.
     * 2.static修饰过的变量为静态变量,静态变量是在类加载的时候初始化,保存到方法去内存当中.
     * 3.static修饰过的方法为静态变量,静态方法是在类加载的时候初始化,保存到方法去内存当中.
     * 4.带有static的方法不能直接访问实例方法或实例变量,需要先创建对象.
     * 5.带有static的方法可以使用引用.的形式调用,但是不推荐这样会混淆程序员的判断.
     * 6.static在类加载的时候执行,而且只执行一次,这个时候被称为:类加载时机.
     * 7.有的时候需要在类加载时执行一些代码,比如:初始化连接池.
     * 什么时候使用static?怎么使用?
     * 1.在一个对象中,如果对象中的实例变量为在创建对象时是共有的,而且这个实例变量的值不会因为对象的改变而改变,那么这个时候就可以把这实例变量修饰为静态变量.
     * 2.要在修饰的变量或方法前加static关键字即可.
     */
    public static void main(String[] args) {
        /*
          创建Chinese对象
         */
        Chinese chinese1 = new Chinese(10, "lisi");
        chinese1.doSome();
        /*
          创建Chinese对象
         */
        Chinese chinese2 = new Chinese(20, "zhangsan");
        chinese2.doSome();

        /*
          以上代码看出,"中国"也就是country,再重复调用.每一个对象中都保存了这个值.
          在java中如果每一个对象都保存了一个属性,而且属性的值是一样的,那么这就可以使用static来修饰这个属性.
         */

        // 创建Chinese对象
        Chinese chinese3 = new Chinese(200, "limanman");
        chinese3.doSome();

    }
}
