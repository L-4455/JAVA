package pers.reflection.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author LiZiHao
 * @Date 2022/07/17/15:47
 */
public class ReflectionTest05 {
    /*
        Field的使用
        Field是类中的属性/成员
     */
    public static void main(String[] args) {
//        获取class文件
        try {
            Class studentClass = Class.forName("pers.reflection.bean.Student");

//            studentClass的getName可以获取完整的类名
            String className = studentClass.getName();
            System.out.println("完整类名:" + className);

//            获取简短类名
            String CName = studentClass.getSimpleName();
            System.out.println("简短类名:" + CName);


//            获取类中的public修饰的Field
            Field[] fields = studentClass.getFields();
//            只有1个
            System.out.println(fields.length);
            Field fs = fields[0];
//            获取到这个属性名为:name
            System.out.println(fs.getName());

//            获取类中的所有Field
            Field[] fields1 = studentClass.getDeclaredFields();
//            有4个
            System.out.println(fields1.length);
            System.out.println("\n");
            for (Field field : fields1) {
//               获取所有属性的名字
                String fieldName = field.getName();
                System.out.println(fieldName);

//                获取所有属性的类型
                Class TypeClass = field.getType();
                String name = TypeClass.getName();
                System.out.println("完整的属性类型名:" + name);

                String simpleName = TypeClass.getSimpleName();
                System.out.println("简短的属性类型名:" + simpleName);

//                获取属性的修饰符,返回值是int类型.这表示int类型这个数字代表了这个类型.
//                可以通过方法把这个数字转换为String类型的.
                int classModifiers = field.getModifiers();
                System.out.println("属性的修饰符数字代表:" + classModifiers);

//                把int类型的转换为String类型的.
                String modifierName = Modifier.toString(classModifiers);
                System.out.println("属性修饰符:" + modifierName);
                System.out.println("\n");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
