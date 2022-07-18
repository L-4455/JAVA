package pers.reflection.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/11:20
 */
public class ReflectionTest10 {
    /*
         反编译method
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("pers/reflection/Userinfo");
        String ClassNameValue = resourceBundle.getString("ClassName");
        try {
            Class userServiceClass = Class.forName(ClassNameValue);
            stringBuilder.append(Modifier.toString(userServiceClass.getModifiers())).append(" class ").append(userServiceClass.getSimpleName()).append("{\n");

            Method[] methods = userServiceClass.getDeclaredMethods();
            for (Method method : methods) {
                stringBuilder.append("\t");
                stringBuilder.append(Modifier.toString(method.getModifiers()));
                stringBuilder.append(" ");
                stringBuilder.append(method.getReturnType().getSimpleName());
                stringBuilder.append(" ");
                stringBuilder.append(method.getName());
                stringBuilder.append("(");

                Class[] parameterTypes = method.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    stringBuilder.append(parameterType.getSimpleName());
                    stringBuilder.append(",");
//                    System.out.println(parameterType.getSimpleName());

                }
                if (stringBuilder.toString().endsWith(",")) {
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
