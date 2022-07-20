package pers.annotation.myannotation;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/10:41
 */
public @interface MyAnnotation05 {
    //    注解的属性是一个数组
    String[] email();

    int[] age();
}
