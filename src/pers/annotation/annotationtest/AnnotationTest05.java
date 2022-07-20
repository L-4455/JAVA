package pers.annotation.annotationtest;

import pers.annotation.myannotation.MyAnnotation05;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/10:42
 */
public class AnnotationTest05 {
    public static void main(String[] args) {

    }

    //    注解的属性是一个数组时,要把属性值使用大括号括起来
    @MyAnnotation05(email = {"1234@123.com", "456456@qq.com"}, age = {23, 123, 234, 123})
    public static void doSome() {

    }

    //    数组中只有一个数据,可以省略大括号.
    @MyAnnotation05(email = "1234@123.com", age = 213)
    public static void doOther() {

    }
}
