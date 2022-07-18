package pers.reflection.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/16:25
 */
public class ReflectionTest13 {
    /*
         使用constructor反编译构造方法
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Class VipClass = Class.forName("java.util.Date");
            stringBuilder.append(Modifier.toString(VipClass.getModifiers())).append(" class ").append(VipClass.getSimpleName()).append("{\n");
            Constructor[] constructors = VipClass.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                stringBuilder.append("\t");
                stringBuilder.append(Modifier.toString(constructor.getModifiers()));
                stringBuilder.append(" ");
                stringBuilder.append(VipClass.getSimpleName());
                stringBuilder.append("(");
                Class[] parameterTypes = constructor.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    stringBuilder.append(parameterType.getSimpleName());
                    stringBuilder.append(",");
                }
                if (parameterTypes.length > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);

                }
                stringBuilder.append(")");
                stringBuilder.append("{\n");
                stringBuilder.append("\t");
                stringBuilder.append("}\n");
            }
            stringBuilder.append("}");
            System.out.println(stringBuilder);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
