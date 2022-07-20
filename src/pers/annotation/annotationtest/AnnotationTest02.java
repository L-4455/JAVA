package pers.annotation.annotationtest;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/9:37
 */

@Deprecated
public class AnnotationTest02 {
    /*
        @Deprecated注解的使用
        被该注解修饰的元素表示为该元素已过时,有更好的处理方案.
     */
    @Deprecated
    String name;

    @Deprecated
    public static void doSome() {

    }

    @Deprecated
    public void doOther() {

    }
}

class Test {
    public static void main(String[] args) {
//        该类已过时,不推荐使用.
        AnnotationTest02 annotationTest02 = new AnnotationTest02();
//        该属性已过时,不推荐使用
        annotationTest02.name = "lisi";

//        该方法已过时,不推荐使用
        annotationTest02.doOther();

//        该方法已过时,不推荐使用
        annotationTest02.doOther();
    }
}