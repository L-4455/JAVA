package pers.reflection.reflect;

/**
 * @Author LiZiHao
 * @Date 2022/07/16/20:04
 */
public class ReflectionTest02 {
    /*
        使用反射机制实例化对象
     */
    public static void main(String[] args) {
        /*
            这种方式更加灵活
            User user = new User;
            这样把代码写死了.
         */
//        获取class字节码
        Class c = null;
        try {
            c = Class.forName("pers.reflection.bean.User");


//            实例化异常,User方法提供了有参数构造,无参数不在默认提供.这里只调用了无参数构造方法.
//            Object o = c.newInstance();
            Object o = c.newInstance();
            System.out.println(o);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
