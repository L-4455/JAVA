package pers.reflection.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/15:29
 */
public class ReflectionTest12 {
    /*
        ReflectionTest11使用属性配置文件.
     */
    public static void main(String[] args) {
//        resource binder
        ResourceBundle resourceBundle = ResourceBundle.getBundle("pers/reflection/Userinfo");

        /*可以不用的代码
        String ClassNameValue = resourceBundle.getString("ClassName");
        String MethodNameValue = resourceBundle.getString("MethodName");
        String MethodArguments01 = resourceBundle.getString("MethodArguments01");
        String MethodArguments02 = resourceBundle.getString("MethodArguments02");*/

//        System.out.println(ClassNameValue);

        try {
//          Obtain class document
            Class userServiceClass = Class.forName(resourceBundle.getString("ClassName"));

//          instantiated object
            Object obj = userServiceClass.newInstance();

//          Obtain specify method
            Method declaredMethod = userServiceClass.getDeclaredMethod(resourceBundle.getString("MethodName"), String.class, String.class);

//          transfer method
            Object retValue = declaredMethod.invoke(obj, resourceBundle.getString("MethodArguments01"), resourceBundle.getString("MethodArguments02"));
            if (retValue != null) {
                System.out.println(retValue);
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
