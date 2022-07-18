package pers.reflection.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/16:48
 */
public class ReflectionTest14 {
    /*
        通过反射机制调用构造方法实例化对象
     */
    public static void main(String[] args) {
        try {
            Class VipClass = Class.forName("pers.reflection.bean.Vip");

//          通过无参数构造方法实例化对象
            Object instance = VipClass.newInstance();
            System.out.println(instance);

//          通过有参数构造方法实例化对象
            Constructor constructor = VipClass.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
            Object obj = constructor.newInstance(101, "lisi", "郑州", true);
            System.out.println(obj);

            Constructor con = VipClass.getDeclaredConstructor(int.class, String.class, boolean.class);
            Object newObj = con.newInstance(201, "wang", false);
            System.out.println(newObj);


        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
