/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-06 17:58:34
 */
package pers.luochen.parameter;

public class Test {
    public static void main(String[] args) {
        User u = new User(20);
        add(u);
        System.out.println("main--->" + u.i);
    }
    public static void add(User u){
      u.i++;
      System.out.println("add---->" + u.i);
    }
}
class User{
    int i;
    public User(int age) {
        i = age;
    }
}
