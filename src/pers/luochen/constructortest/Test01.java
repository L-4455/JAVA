package pers.luochen.constructortest;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-03 16:02:58
 * @LastEditTime: 2022-04-06 18:20:03
 */
public class Test01 {
    public static void main(String[] args) {
        /*
         * 参数的传递
         */
        //创建user对象,并调用构造函数.
        User user = new User(20);
        //调用带有static的add方法,使用<类名.方法名>或者<方法名>的形式调用.调用方法时传递参数,传递的是user中保存的内存地址,这个内存地址指向了堆内存中的一个对象.
        add(user);
        System.out.println("main--->" + user.age);

    }

    /**
     * 创建带有static的add对象,并接受参数传递.
     */
    public static void add(User user) {
        //当执行到这里时,user已经接受到了传递过来的参数,只不过这个传递的参数是一个内存地址,这个内存地址指向了堆内存中的某一个对象.
        //我们有了对象的内存地址就可以对对象中的实例变量进行操作.
        user.age++;
        System.out.println("add--->" + user.age);

    }

}
