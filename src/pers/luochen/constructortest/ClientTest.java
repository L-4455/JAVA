/**
 * @author: LiZhiHao
 * @Date: 2022-04-02 22:03:18
 * @LastEditTime: 2022-04-06 21:01:07
 */
package pers.luochen.constructortest;


public class ClientTest {
    public static void main(String [] args){
        /**
         * 测试类
         */
        //创建对象,并调用构造方法.
        Client client = new Client();

        client.setId(10);
        client.setAge(24);
        client.setAdder("郑州");
        client.setName("zhangsan");
        System.out.println(client.getId());
        System.out.println(client.getAge());
        System.out.println(client.getAdder());
        System.out.println(client.getName());

        /**
         * 当只创建对象调用构造方法时,其实是调用了对象中的无参数构造方法/缺省构造器.
         * 如果没有写明无参数构造列表不会输出任何的东西,但如果写了话就会执行无参数构造列表里的代码.
         */
        
        //调用构造方法
        //new Client();

        //调用有参数构造方法
        new Client(10);


    }
    
}
