package pers.annotation.myannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/10:50
 */
// 该注解可出现在:类上,属性上.
@Target(value = {ElementType.TYPE, ElementType.FIELD})
// 该注解保存策略为:可以生成class文件.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation06 {
    String value() default "lisi";

    int age();
}
