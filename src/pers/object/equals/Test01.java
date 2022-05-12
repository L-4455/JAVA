package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/21:34
 */
public class Test01 {
    /**
     * String类重写了toString和equals方法
     */
    public static void main(String[] args) {
        String a = "lisi";
        String b = "lisi";
//        引用数据类型作比较
        System.out.println(a == b);//true
//        引用数据类型作比较
        String x = new String("lisi");
        String y = new String("lisi");
        System.out.println(x == y);//false
        /*
         * 这是为什么?
         * 第一条输出语句应该是:false;
         * 第二条输出语句应该是:true;
         * 为什么输出结果和我们预期的不一样?
         * 我们知道 == 比较的是数据保存的值,而当我们使用new来创建对象时,变量保存了该对象的内存地址而不是一个具体的值
         * 所以:引用数据类型不能用 == 来判断.基本数据类型可以使用 == 来判断.
         * 再看String源码中,JAVA在设计时就已经在String类中重写了equals和toString方法.
         * 所以在做字符串比较时一般使用equals来判断
         */
        System.out.println(x.equals(y));//true

        /*
              String类重写toString方法
         */
        String string = new String("张三");
        System.out.println(string.toString());//张三
//        在没有重写toString方法之前输出结果应该是java.lang.String@十六进制文本,但是String方法重写了toString方法.

    }
}

