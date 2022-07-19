package pers.reflection.reflect;

/**
 * @Author LiZiHao
 * @Date 2022/07/19/15:12
 */
public class ReflectionTest15 {
    /*
        通过反射机制获取class文件的父类和实现的接口
     */
    public static void main(String[] args) {
        try {
            Class<?> stringClass = Class.forName("java.lang.String");
//            获取父类
            Class<?> superClass = stringClass.getSuperclass();
//            获取父类的类名
            System.out.println(superClass.getName());

//            获取实现的接口,接口可以实现多个,所以返回值是一个数组
            Class<?>[] interfaceClass = stringClass.getInterfaces();
//            遍历数组,取出接口的类名
            for (Class<?> interfaces : interfaceClass) {
                System.out.println(interfaces.getName());
//                简短类名
//                System.out.println(interfaces.getSimpleName());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

