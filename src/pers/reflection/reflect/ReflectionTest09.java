package pers.reflection.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/10:49
 */
public class ReflectionTest09 {
    /*
        反射机制method
     */
    public static void main(String[] args) {
        try {
//          获取class文件
            Class userServiceClass = Class.forName("pers.reflection.bean.UserService");
//            获取class文件中的方法
            Method[] methods = userServiceClass.getDeclaredMethods();
//            System.out.println(methods.length);
            for (Method method : methods) {
//                获取方法修饰符列表
                System.out.println(Modifier.toString(method.getModifiers()));
//                获取方法类型
                System.out.println(method.getReturnType().getSimpleName());
//                System.out.println(method.getReturnType() + "---");
//                获取方法名
                System.out.println(method.getName());
//                获取参数列表
                Class[] parameterTypes = method.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    System.out.println(parameterType.getSimpleName() + "---");
                }
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}