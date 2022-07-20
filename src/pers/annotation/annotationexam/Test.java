package pers.annotation.annotationexam;

import java.lang.reflect.Field;

/**
 * @Author LiZiHao
 * @Date 2022/07/20/11:28
 */
public class Test {
    /*
         注解在开发中有什么用?
         需求:
         给一个@id注解,只能出现在类上,如果一个类使用了该注解
         那么这个类中必须有一个int类型的id,否则发生异常.
     */
    public static void main(String[] args) throws Exception {
        Class<?> userClass = Class.forName("pers.annotation.annotationexam.User");
//        如果这个个类被Id注解修饰了
        if (userClass.isAnnotationPresent(Id.class)) {
//            判断该类中是否有int类型的id属性
            boolean isOk = false;
            Field[] fields = userClass.getDeclaredFields();
            for (Field field : fields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    isOk = true;
                    break;
                }
            }
            if (!isOk) {
                throw new NoHasIdException("被Id注解修饰的类必须要有int类型的id属性");
            }
        }
    }
}
