package pers.annotation.annotationtest;

import pers.annotation.myannotation.MyAnnotation03;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/9:55
 */
public class AnnotationTest04 {
    public static void main(String[] args) {

    }

    /* 可以看到,如果属性只是一个value的话,可省略value不写,直接写值.
    @MyAnnotation03("hh")
     public static void doSome() {

     }*/
//    如果是多个属性呢
//    如果是多个属性的话,则必须要写value,不可省略.
    @MyAnnotation03(value = "hhh", name = "lisi")
    public static void doSome() {

    }
}
