package pers.annotation.myannotation;

enum Type {
    SPRING, SUMMER, FALL, WINTER
}

/**
 * @Author LiZiHao
 * @Date 2022/07/20/10:07
 */
public @interface MyAnnotation04 {
    /*
         可以使用:
         byte short int long float double boolean char String Class enum
         以及以上类型的数组.
     */
//    注解中的属性可以使用那些类型?
    String name();

    String[] city();

//   不可以
//    Object obj();

    int age();

//    不可以
//    Integer sex();

    Class Types();

    Type ok();

    Type[] AreYouOK();
}
