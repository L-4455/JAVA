package pers.reflection.reflect;

/**
 * @Author LiZiHao
 * @Date 2022/07/17/9:19
 */
public class ReflectionTest04 {
    /*
        Class.forName();的作用

        可以让一个类的静态代码块单独执行
     */
    public static void main(String[] args) {
        try {
            Class.forName("pers.reflection.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


