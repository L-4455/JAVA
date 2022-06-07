package pers.string;

/**
 * @Author LiZiHao
 * @Date 2022/6/7/10:02
 */
public class StringTest01 {
    /*
        String存储原理
        1:String不是基本数据类型,是引用数据类型,所以String类型不会直接存储值,而是存储字符串对象的内存地址.
        2:在JAVA中凡是被双引号括起来的就是字符串,例如:"abc" "xyz" "qwe",这是三个字符串对象.
        3:JAVA中字符串一旦创建则不可改变,也就是说"abc"不可变,直至出生到死亡.不可变为"abcd".
        4:所有字符串都保存在方法区的字符串常量池当中,因为字符串使用太频繁.
        5:当需要创建新的字符串对象时,JVM会先从字符串常量池中找,如果没有就新建,如果有就直接拿过来用.
     */
    public static void main(java.lang.String[] args) {
        /*
            s1 s2 s3中保存着的不是"abc" "abcxy" "xy"
            而是这些字符串对象的内存地址
         */

//        这是三个字符串对象.
        String s1 = "abc";
        String s2 = "abc" + "xy";

        String s3 = new String("xy");
    }
}
