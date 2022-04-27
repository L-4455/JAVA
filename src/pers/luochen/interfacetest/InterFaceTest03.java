package pers.luochen.interfacetest;

/**
 * @Author LiZiHao
 * @Date 2022/04/27/20:47
 */
public class InterFaceTest03 {
    /*
    *   思考:一个非抽象类是否可以实现多个接口.
    *   1:可以,非抽象类可以实现多个接口,同时也要实现接口中的方法.
    * */
    public static void main(String []args){
//        夫类型引用指向子类型对象
        X x = new E();
        x.jump();
        /*找不到符号
        符号:   方法 jump1()
        位置: 类型为X的接口
        在X中找不到jump1方法.这是编译期的报错
        x.jump1();*/
//        使用强制类型转换
        /*
        * 思考:为什么X和Y之间没有继承关系也能强制类型转换?
        * 1:这是Java设计的问题,虽然这样编译期间没有报错,但在运行时有可能会报错
        * 这里为什么没有报错;个人猜测应该是因为E实现了XYZ,导致他们三个之间有了一点点的关系吧.
        * */
        Y y= (Y)x;
        y.jump1();
        System.out.println("-----------------------------");

        K k = new M();
        k.fly();
        /*
           报错信息:ClassCastException
            J j = (J)k;
            K和J之间没有关系,不能强转.
            向下转型时,建议使用instanceof运算符
        */
        if(k instanceof J){
            J j = (J)k;
            System.out.println("k指向的是J");
        }
    }
}
interface J{

}
interface K{
    void fly();
}
class M implements K{
    public void fly(){
        System.out.println("我在飞翔");
    }
}

interface X{
    void jump();
}
interface Y{
    void jump1();
}
interface Z{
}
class E implements X,Y,Z{
    public void jump(){
        System.out.println("我在跳");
    }
    public void jump1(){
        System.out.println("我在跳高");
    }
}
