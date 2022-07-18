package pers.reflection.reflect;

import java.lang.reflect.Field;
import java.util.ResourceBundle;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/9:46
 */
public class ReflectionTest08 {
    /*
        让ReflectionTest07的代码更加灵活
     */
    public static void main(String[] args) {
//        读取属性配置文件,使用资源绑定器.
        ResourceBundle resourceBundle = ResourceBundle.getBundle("pers/reflection/reflect/StudentInfo");
        String value = resourceBundle.getString("ClassName");
        String noValue = resourceBundle.getString("NoAttributes");
        String nameValue = resourceBundle.getString("NameAttributes");
        System.out.println(value);

        try {
//          获取class文件
            Class studentClass = Class.forName(value);
//            实例化对象
            Object obj = studentClass.newInstance();
//            通过配置文件访问属性
            Field noField = studentClass.getDeclaredField(noValue);
//            No是受保护的
            noField.setAccessible(true);
//            修改 No 的值
            noField.set(obj, 1011);
//            访问 No 的值
            System.out.println(noField.get(obj));

//            访问name属性
            Field nameField = studentClass.getDeclaredField(nameValue);
//            name是私有的,需要打破
            nameField.setAccessible(true);
//            修改 name 值
            nameField.set(obj, "woCao");
//            访问 name 值
            System.out.println(nameField.get(obj));

//            System.out.println(studentClass.getSimpleName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
