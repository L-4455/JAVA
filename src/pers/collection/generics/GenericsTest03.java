package pers.collection.generics;

/**
 * @Author LiZiHao
 * @Date 2022/7/2/0002/11:04
 */
public class GenericsTest03<E> {
    public static void main(String[] args) {
//        指定泛型数据类型:String
//        当创建对象时使用泛型指定了数据类型,那么doSome方法的形参列表就是(String o)
//        E 这个标识符根据泛型制定的类型变化
        GenericsTest03<String> g = new GenericsTest03<>();
        g.doSome("we");
//        类型不匹配
//        g.doSome(23);

        GenericsTest03<Integer> gc = new GenericsTest03<>();
//        此时doSome传递的参数又可以是Integer类型的
        gc.doSome(100);
//        类型不匹配
//        gc.doSome("wqe");

//        不使用泛型
        GenericsTest03 gw = new GenericsTest03();
//        调用doSome方法时,形参数据类型就是Object类型的
        gw.doSome("sdf");
        gw.doSome(213);

        W<String> w = new W<>();
        w.print("我是你爹");
        W<Integer> a = new W<>();
        a.print(123);


    }

    /*
        自定义泛型
        在类名后加 <标识符>
        在使用了泛型机制,如果有些方法的形参列表的数据类型不确定就可以使用泛型
        让编写者自己确定数据类型.
        方法的数据类型根据编写者使用泛型指定的数据类型,如果没有指定就默认使用Object类型的.
     */
    public void doSome(E o) {
        System.out.println(o);
    }
}

class W<E> {
    public void print(E o) {
        System.out.println(o);
    }
}
