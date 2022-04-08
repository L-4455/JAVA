/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-08 19:17:54
 */
package pers.luochen.user;


import pers.luochen.a.*;

public class UserTest {
    public static void main(String[] args) {
        User w = new User();
        w.name = "李漫漫";
        w.sex = false;
        w.number = 1000;
        w.sex = true;
        
        w.addr = new Address();
        w.addr.city = "漯河";
        w.addr.address = "召陵区";
        w.addr.zipCode = 46000;
        Au.q(w.name);
        Au.q(w.number);
        Au.q(w.sex);
        Au.q(w.addr.address);
        Au.q(w.addr.city);
        Au.q(w.addr.zipCode);
        
        User user = new User();
        user.setAge(-111);
        System.out.println(w.getAge());

        UserTest.doSome();
    }
   
    public static void doSome(){
        System.out.println("我是你爹");
    }
}

