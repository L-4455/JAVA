package pers.annotation.annotationtest;

import pers.annotation.myannotation.MyAnnotation06;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/10:54
 */
@MyAnnotation06(value = "hhhh", age = 1000)
public class AnnotationTest07 {
    @MyAnnotation06(value = "zhangasn", age = 1000)
    int no;

    /* 不能出现在方法上.
    @MyAnnotation06
    public void doSome(){

    }*/
}
