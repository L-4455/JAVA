package pers.string;

/**
 * @Author LiZiHao
 * @Date 2022/6/7/10:55
 */
public class StringTest04 {
    /*
        分析以下程序创建了几个对象
     */
    public static void main(String[] args) {
        /*
            在JVM中创建了三个对象
            方法区中字符串常量池中的"李四"
            堆内存中的s1和s2
         */
        String s1 = new String("李四");
        String s2 = new String("李四");
    }
}
