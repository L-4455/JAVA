package pers.array;

import java.util.Arrays;

/**
 * @Author LiZiHao
 * @Date 2022/5/16/23:00
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        double[] a = new double[100];
        //        取/取动态的一维数组
        System.out.println("该数组的长度:" + a.length);
        System.out.println("该数组第一个元素: " + a[0]);
        System.out.println("该数组最后一个元素:" + a[a.length - 1]);
//        存
        a[0] = 11.3;
        a[a.length - 1] = 111.333;
        System.out.println("该数组第一个元素:" + a[0]);
        System.out.println("该数组最后一个元素:" + a[a.length - 1]);
        System.out.println("-----------------------------");
//        一维数组遍历
        int[] b = {123, 34, 45, 345, 34523, 4123, 46, 7};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);//i是下标,从0到5
        }
        System.out.println("===========================");
        for (int i = b.length - 1; i >= 0; i--) {
//            倒叙输出数组内容,从最后一位开始.所以需要取到最后一位元素上的数据.
            System.out.println(b[i]);
        }

        System.out.println("===================================");
//        引用数据类型
        String[] x = {"lll", "when", "sdf"};
//        静态遍历
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("---------------------------");
        String[] z = new String[3];
//        动态遍历
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
//        赋值
        System.out.println("==============================");
        z[0] = "爱你到永远";
        z[z.length - 1] = "爱是永恒的";
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }

        System.out.println("---------------------------");
        Object[] objects = new Object[3];
        objects[0] = "222";
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        System.out.println("---------------------------");
        Object o = new Object();
        Object w = new Object();
        Object m = new Object();
        Object[] objects1 = {o, w, m};
        for (int i = 0; i < objects1.length; i++) {
            System.out.println("第" + i + "个下标上的元素" + objects1[i].toString());
        }
    }
}
