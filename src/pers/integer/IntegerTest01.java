package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/9:25
 */
public class IntegerTest01 {
    /*
        八种基本类型对应的包装类
        在需要对一个方方法参数是引用数据类型的传递一个基本数据类型需要进行包装
        在jdk1.5之前没有自动装箱,jdk1.5之后有了.
     */
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(200);
        doSome(myInteger);
    }

    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}

