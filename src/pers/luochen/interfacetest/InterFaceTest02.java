package pers.luochen.interfacetest;

/**
 * @Author LiZiHao
 * @Date 2022/04/27/15:49
 */
public class InterFaceTest02 {
    /*
        类实现接口
        1:当类实现接口时,要实现接口中的所有抽象方法.不然会报错
        2:实现可以看作为:继承.
     */
    public static void main(String [] args){
        //多态
        MyMath animal = new Sum();
        animal.sum(20,10);
    }
}
interface MyMath{
    int sum(int a,int b);

}
class Sum implements MyMath{
//  未实现抽象类中的方法时:  Cat不是抽象的, 并且未覆盖Animal中的抽象方法move()
    public int sum(int a, int b){
        System.out.println(a + b);
        return 0;
    }
}

