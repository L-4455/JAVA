package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/16:01
 */
public class IntegerTest05 {
    /*
        Integer常用方法

        注意:NumberFormatException数字格式化异常

     */
    public static void main(String[] args) {
//        1.intValue()
//        以int类型返回Integer类型的值
        Integer i = 100;
        int q = i.intValue();
        System.out.println(q);
//        2.static int parseInt(String s)
//        NumberFormatException异常:数字格式化异常
//        这里的参数不能为中文/英文,因为是Integer类型的包装类
        int x = Integer.parseInt("123");
        System.out.println(x);
//        3.static String toBinaryString(int i)
//          把一个数字转为2进制,以String类型显示结果
        String s1 = Integer.toBinaryString(123);
        String s2 = Integer.toBinaryString(888);
        System.out.println(s1);
        System.out.println(s2);

//        4.static String toHexString(int i)
//          把一个数字转为16进制的形式,以String类型显示结果
        String s3 = Integer.toHexString(123);
        String s4 = Integer.toHexString(90);
        System.out.println(s3);
        System.out.println(s4);

//        5.static String toOctalString(int i)
//          把一个数字转为8进制,以String类型显示结果
        String q1 = Integer.toOctalString(520);
        String q2 = Integer.toOctalString(19);
        System.out.println(q1);
        System.out.println(q2);


    }
}
