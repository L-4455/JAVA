
package pers.luochen.thistest;
/**
 * @author: LiZhiHao
 * @Date: 2022-04-04 22:38:45
 * @LastEditTime: 2022-04-04 23:46:10
 */

public class Customer {
    /**
     *客户类
     */
    /**
     * 1.this是一个关键字,翻译为:这个
     * 2.this是一个引用,是一个变量,this指向本身,指向自己.
     * 3.this在大多数是可以省略不写的.
     * 4.this在带有static的方法中是不能使用的.
     * 5.在带有static的方法中,不能“直接”调用对象中的实例变量和实例方法,需要先创建对象.
     */
    String name;
    
    //不带static的方法
    public void doSome(){
        //省略写法
        //System.out.println(name);
        //完整写法
        System.out.println(this.name);
    }
    //带有static的方法
    public static void doOther(){
        //编译错误,无法在带有static中直接调用对象中的实例变量
        //System.out.println(name);
        //编译错误,在带有static中无法使用this.
        //System.out.println(this.name);

        //要想访问对象中的name变量,需要先创建对象.
        Customer customer = new Customer();
        System.out.println(customer.name = "wangbadan");
    }
    /**
     * 1.带有static的方法为静态方法,静态方法中不能使用this关键字,静态方法不需要对象的参与.static的方法调用使用 类名.
     * 2.不带有static的方法为实例方法,实例方法的调用需要对对象的参与 所以要用 引用. 的形式调用.
     * 3.不带有static的变量为实例变量,实例变量的调用需要对象的参与,所以要用 引用.的形式调用,
     */
    
    //无参数构造方法
    public Customer(){

    }
}
