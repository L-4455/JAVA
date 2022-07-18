package pers.reflection.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author LiZiHao
 * @Date 2022/07/17/16:28
 */
public class ReflectionTest06 {
    /*
         通过反射机制,反编译class文件中的Field
     */
    public static void main(String[] args) {
        Class studentClass = null;
        try {
            studentClass = Class.forName("java.lang.Thread");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        创建字符串拼接对象
        StringBuilder stringBuilder = new StringBuilder();
//        拼接字符串
        stringBuilder.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + " {\n");

//        获取所有属性
        Field[] fields = studentClass.getDeclaredFields();

        for (Field field : fields) {
            stringBuilder.append("\t");
            stringBuilder.append(Modifier.toString(field.getModifiers()));
            stringBuilder.append(" ");
            stringBuilder.append(field.getType().getSimpleName());
            stringBuilder.append(" ");
            stringBuilder.append(field.getName());
            stringBuilder.append(";\n");

        }

        stringBuilder.append("}");
        System.out.println(stringBuilder);
    }
}
