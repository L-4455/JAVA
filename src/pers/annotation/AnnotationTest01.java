package pers.annotation;

/**
 * @Author LiZiHao
 * @Date 2022/07/19/22:39
 */
public class AnnotationTest01 {
    public static void main(String[] args) {
        m1();
    }

    @MyAnnotation
    public static void m1() {
        @MyAnnotation
        int i = 100;

        for (int j = 0; j < i; j++) {
            System.out.println("j = " + j);
        }
    }
}
