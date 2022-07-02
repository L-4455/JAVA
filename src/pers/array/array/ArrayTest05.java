package pers.array.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/18/22:18
 */
public class ArrayTest05 {
    /*
        main方法中的String[] args参数
        main方法是JVM负责调用的,所以JVM会传递一个数组进来.但是这个数组的长度是0.
        数组长度是0,并不代表数组不存在.而是数组中没有元素,数组对象还是存在的.args不是null

        我们可以在程序运行前给JVM传递数组参数,则JVM会自动分离组合这数组参数.并传递给String[]

        所以可以得出结论:String[] args是可以提供用户输入的参数.也就是说在程序运行前用户可以输入某些数据.
     */
    public static void main(String[] args) {
//        输出结果:0
        System.out.println(args.length);
//        传递参数后输入结果:3
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
