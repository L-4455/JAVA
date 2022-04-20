package pers.luochen.supertest;

import com.sun.security.jgss.GSSUtil;

/**
 * @Author LiZiHao
 * @Date 2022/04/20/18:26
 */
public class SuperTest06 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        //cat.move();
        cat.yiDong();
    }
}

class Animal {
    public void move() {
        System.out.println("Animal move");
    }
}

class Cat extends Animal {
/*
    @Override
    public void move() {
        //super.move();
        System.out.println("Cat move");
    }*/

    public void yiDong() {
        //调用当前对象的move方法
        this.move();
        //调用父类中的move方法
        super.move();
        //调用当前对象的move方法
        move();
    }
}
