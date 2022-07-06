package pers.gather.collection.set;

import java.util.TreeSet;

/**
 * @Author LiZiHao
 * @Date 2022/7/4/0004/16:24
 */
public class TreeSetTest03 {
    /*
        自定义类型会自动排序吗?
            会,但需要实现Comparable实现compareTo方法.
     */
    public static void main(String[] args) {
        TreeSet<User> te = new TreeSet<>();

        User u1 = new User(333);
        User u2 = new User(323);
        User u3 = new User(100);
        te.add(u1);
        te.add(u2);
        te.add(u3);
        /*
        不实现Comparable接口
        User无法转换为Comparable
        pers.gather.collection.set.User cannot be cast to java.lang.Comparable
        User类没有实现Comparable接口
         */
        for (User ak : te) {
//            会调用User的toString方法
            System.out.println(ak);

        }
    }
}

class User implements Comparable<User> {
    private int age;

    public User(int age) {
        this.age = age;
    }

    //    实现接口的同时要重写接口中的方法
//    这个就是比较规则,程序是按什么升序或者降序,是程序员自己定的,或者是业务需求.
//    10 - 9 = 1 > 0 左大右小
//    10 - 20 = -10 < 0 左小右大
//    10 - 10 = 0 = 0 左右相等
//    规则:按照年龄升序排列
    @Override
    public int compareTo(User o) {
//        在做比较的时候底层调用了compareTo方法
//        比如:u1.compareTo(u2),此时,o就是u2,this就是u1.
        /*升级
        if(this.age - o.age > 0){
            return 1;
        }else if(this.age - o.age < 0){
            return -1;
        }else {
            return 0;
        }*/
//        升序
//        return this.age - o.age;
//        降序
        return o.age - this.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
