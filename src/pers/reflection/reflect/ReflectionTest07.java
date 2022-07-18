package pers.reflection.reflect;

import pers.reflection.bean.Student;

import java.lang.reflect.Field;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/9:23
 */
public class ReflectionTest07 {
    /**
     * 通过反射机制访问属性
     * 使用反射机制虽然代码量多了,但是程序灵活了,不在局限于一种对象,而是可以通过属性配置文件配置.
     * 代码更灵活;
     */
    public static void main(String[] args) {
//        正常访问属性
        Student student = new Student();

//        访问属性三要数:student对象,name属性,hangman值.
        student.name = "hangman";
        System.out.println(student.name);

//        通过反射机制访问属性
        Class studentClass = null;
        try {

//        获取class文件
            studentClass = Class.forName("pers.reflection.bean.Student");

//         使用反射实例化对象,通过无参数构造方法
//         obj就代表了student对象
            Object obj = studentClass.newInstance();

//            获取指定的Field属性
            Field nameField = studentClass.getDeclaredField("name");
//            通过Field访问name属性
//            三要素:obj对象,name属性,"lisi"值.
            nameField.set(obj, "lisi");

//            获取属性的值
//            二要素:obj对象,name属性.
            System.out.println(nameField.get(obj));

//            获取指定的Field属性,该属性是受保护的.
            Field sexField = studentClass.getDeclaredField("sex");

//            因为sex是受保护的,所以我们要打破封装/打破保护.
            sexField.setAccessible(true);

//            三要素:obj对象,sex,false值.
            sexField.set(obj, false);
//            获取属性

            System.out.println(sexField.get(obj));

//            获取指定的Field属性,该属性是私有的.
            Field noField = studentClass.getDeclaredField("no");

//            打破封装
            noField.setAccessible(true);

//            访问属性
            noField.set(obj, 1011);
//            获取属性
            System.out.println(noField.get(obj));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
