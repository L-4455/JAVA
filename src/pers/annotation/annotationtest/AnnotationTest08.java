package pers.annotation.annotationtest;

import pers.annotation.myannotation.MyAnnotation06;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/10:57
 */
public class AnnotationTest08 {
    //    通过反射机制反射注解,并获取到属性的值
    public static void main(String[] args) throws Exception {
        Class<?> myClass = Class.forName("pers.annotation.annotationtest.AnnotationTest07");
        System.out.println(myClass.isAnnotationPresent(MyAnnotation06.class));
        if (myClass.isAnnotationPresent(MyAnnotation06.class)) {
            MyAnnotation06 myAnnotation06 = myClass.getAnnotation(MyAnnotation06.class);
//            如果有多个地方使用了该注解,那么取值则取第一次使用该注解的赋值.
            System.out.println(myAnnotation06.value());
            System.out.println(myAnnotation06.age());
        }
    }
}
