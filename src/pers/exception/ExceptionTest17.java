package pers.exception;

/*
哇
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
*/

/**
 * @Author LiZiHao
 * @Date 2022/6/25/16:34
 */
public class ExceptionTest17 {
    /*
        关于方法覆盖的异常问题
        子类覆盖父类的方法,只能比父类抛出异常更少,不能更多.

        也就是说,父类方法不抛出异常,子类只能抛出运行时异常,不能抛出编译时异常.
        父类方法抛出异常,子类重写后能抛出与父类一样的异常,也能抛出比父类异常更小的异常,也能不抛出异常.
     */
    public static void main(String[] args) {

    }
}

class Animal {
    public void doSome() {

    }


}

class Monkey extends Animal {

    /*
    不行,父类中的方法没有抛出异常,子类重写后也不能抛出.
    public void doSome() throws FileNotFoundException {

    }*/
    /*
    可以,父类中的方法没有抛出异常,子类重写后可以抛出运行时异常,不能抛出编译时异常.
    public void doSome() throws NullPointerException{

    }*/

    /*
    可以,父类中的方法抛出异常,子类重写后也可以抛出
    public void doSome() throws IOException{

    }*/

    /*
    可以,父类中的方法抛出异常,子类重写后也可不抛出
    public void doSome(){

    }
    */

    /*
    可以,父类中的方法抛出的异常,子类可以抛出比这个异常小的异常,不能比这个异常大.
    public void doSome() throws FileNotFoundException {

    }*/

    /*
        异常关键字总结:
            异常捕捉:
            try...catch...finally

            异常抛出:
            throws 在放方法明位置上使用,表示将异常抛给上一级.
            throw 手动抛出异常
     */

}
