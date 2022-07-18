package pers.reflection.reflect;

import pers.reflection.bean.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/14:57
 */
public class ReflectionTest11 {
    /*
        通过反射机制调用类的方法
        Method
     */
    public static void main(String[] args) {
//        不适用反射机制调用方法
        UserService userService = new UserService();
        /*
            调用方法三要素:
            要素1.userService对象
            要素2.login方法
            要素3."admin", "213"值
            要素4.返回值
         */
        String resul = userService.login("admin", "213");
        System.out.println(resul);

        try {
//          获取Class文件
            Class userServiceClass = Class.forName("pers.reflection.bean.UserService");
//            通过反射机制创建对象
            Object obj = userServiceClass.newInstance();
//            获取指定的method方法
            Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
//            通过反射机制调用方法
            /*
             * 三要素:
             * 要素1.obj对象
             * 要素2.loginMethod方法
             * 要素3."admin", "213" 值
             * 要素4.返回值
             * */
            Object retValue = loginMethod.invoke(obj, "admin", "2123");
            System.out.println(retValue);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }
}

