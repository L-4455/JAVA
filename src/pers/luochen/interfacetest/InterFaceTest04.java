package pers.luochen.interfacetest;

/**
 * @Author LiZiHao
 * @Date 2022/04/27/21:09
 */
public class InterFaceTest04 {
    /*
    *   extends和implements同时使用要怎么写?
    *   extends和implements同用时,extends写在前面.
    * */
    public static void main(String []args){
//        多态
        Fly fly = new Cat();
        fly.fly();
//        多态
        Fly fly1= new Monkey();

        fly1.fly();
    }
}
class Animal{

}

//一个会飞的接口
interface Fly{
    void fly();
}
class Cat extends Animal implements Fly{
    public void fly(){
        System.out.println("我是一只会飞的猫!");
    }
}

class Bird extends Animal{

}
class Monkey extends Animal implements Fly{
    public void fly(){
        System.out.println("看!!猴子在飞");
    }
}