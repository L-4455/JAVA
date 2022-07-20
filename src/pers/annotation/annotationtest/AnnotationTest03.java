package pers.annotation.annotationtest;

import pers.annotation.myannotation.MyAnnotation02;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/9:49
 */
public class AnnotationTest03 {
    /*
         注解有属性
     */
    public static void main(String[] args) {

    }

    /*
    当注解中有属性是,必须给属性赋值(除非有默认值)
    @MyAnnotation02()
    public void doSome(){
    }*/

    //    赋值即可使用.如果有多个属性,都需要赋值(除了默认值)
    @MyAnnotation02(name = "lisi", city = "zhengzhou")
    public void doSome() {

    }

    //    如果属性有默认值,可以使用默认值,也可以重新赋值.
    @MyAnnotation02(name = "lisi", city = "zhengzhou", age = 200)
    public void doOther() {

    }
}
