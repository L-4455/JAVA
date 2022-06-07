package pers.string;

/**
 * @Author LiZiHao
 * @Date 2022/6/7/10:38
 */
public class StringTest03 {
    public static void main(String[] args) {
        String s1 = "xy";
        String s2 = "xy";
//        分析结果是:true/false
        System.out.println(s1 == s2);
        /*
            结果为:true
            在画图分析中,可以清楚的看到s1和s2中的"xy"使用的是同一个.
            因为 == 在对java对象做比较时比较的是所保存的对象的内存地址,而不是具体的值.
            s1和s2的内存地址是一样的.
         */
//        分析结果是:true/false
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);
        /*
            结果为:false
            ==比较的是对象的内存地址,而s3和s4都是通过创建对象得来的,
            所以s3和s4所保存的对象的内存地址是不一样的.
         */

        /*
            通过以上代码结论:字符串做比较时不要用==用equals更好一点.
         */


        String k = "monkey";
//        k = null;
//        这是两种写法,更推荐第一种,第二种容易出现空指针异常
        System.out.println("bird".equals(k));
        System.out.println(k.equals("bird"));
    }
}
