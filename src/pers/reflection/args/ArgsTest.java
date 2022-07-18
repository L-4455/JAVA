package pers.reflection.args;

import java.util.Arrays;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/10:52
 */
public class ArgsTest {
    /*
     * 可变长度参数
     * 语法:
     * int... (一定是3个点)
     * 参数数量为0-N个.
     * 可变长度参数可以看作为一个数组
     */
    public static void main(String[] args) {
//        可以为0个
        m1();
//        可以为3个
        m1(10, 20, 30);

//        可以为n个
        m1(8989, 2312, 12312, 3, 123, 1, 23, 1231, 23, 12, 3, 12);

//
        m2("av", "ab", "ac");

        m4(2, "ab", "ac", "ad");
    }

    public static void m1(int... args) {
        for (int arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println(Arrays.toString(args));
    }

    public static void m2(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    //    可变长度参数只能有一个,且在参数列表最后一位.
//    public static void m3(int... args1, String...args2){}
    public static void m4(int a, String... args) {
        System.out.println(a);
        for (String arg : args) {
            System.out.println(arg);
        }

    }
}
