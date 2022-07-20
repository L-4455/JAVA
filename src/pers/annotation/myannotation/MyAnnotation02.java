package pers.annotation.myannotation;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/9:48
 */
public @interface MyAnnotation02 {
    //    这个表示为该注解的属性.看着像是方法,实则不是方法.是一种属性.
    String name();

    String city();

    int age() default 20;
}
