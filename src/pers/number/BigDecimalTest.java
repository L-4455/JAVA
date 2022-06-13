package pers.number;

import java.math.BigDecimal;

/**
 * @Author LiZiHao
 * @Date 2022/6/13/15:52
 */
public class BigDecimalTest {
    /*
        BigDecimal高精度数据,比double还要精.
        BigDecimal不是基本数据类型,而是引用数据类型
     */
    public static void main(String[] args) {
//        这里的一百不是普通的100而是精度超高的100
        BigDecimal a = new BigDecimal(100);
//        200也不是普通的,是精度极高的
        BigDecimal b = new BigDecimal(200);

        System.out.println(a);
        System.out.println(b);

//        怎么让a+b? +号是基本数据类型的运算符,不适用于引用.
//        System.out.println(a + b);
//        两个BigDecimal相加:add,返回BigDecimal
        BigDecimal retValue = a.add(b);
        System.out.println(retValue);
        System.out.println(a + "+" + b + "=" + a.add(b));
//         两个BigDecimal相减:subtract,返回BigDecimal
        BigDecimal subtract = a.subtract(b);
        System.out.println(a + "-" + b + "=" + subtract);

//        两个BigDecimal相除:divide,返回BigDecimal
        BigDecimal sb = a.divide(b);
        System.out.println(a + "/" + b + "=" + sb);

//        两个BigDecimal相乘:multiply,返回BigDecimal
        BigDecimal multiply = a.multiply(b);
        System.out.println(a + "*" + b + "=" + multiply);


//      比较两个BigDecimal两个对象的大小,输出结果为最大值.
//       返回此 BigDecimal 和 val 的最大值
        System.out.println(a.max(b));

//       返回此 BigDecimal 和 val 的最小值
        System.out.println(a.min(b));

//      判断两个BigDecimal对象是否相等.
        System.out.println(a.equals(b));

//        返回此 BigDecimal 的精度
        int x = a.precision();
        System.out.println(x);


//       将此 BigDecimal 与指定的 BigDecimal 比较。
//       当此 BigDecimal 在数字上小于、等于或大于 val 时，返回 -1、0 或 1。
        int i = a.compareTo(b);
        System.out.println(i);

//       返回此 BigDecimal 的哈希码。
        int i1 = a.hashCode();
        System.out.println(i1);

    }
}
