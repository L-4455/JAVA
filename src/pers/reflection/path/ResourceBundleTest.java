package pers.reflection.path;

import java.util.ResourceBundle;

/**
 * @Author LiZiHao
 * @Date 2022/07/17/10:06
 */
public class ResourceBundleTest {
    /*
        资源绑定器
        这种方式更加方便获取属性配置文件的数据
        只能绑定以properties为后缀的文件
        且在填写文件路径时,文件后缀要删除
        前提是该属性配置文件必须在类根路径下
        总结:这种方式更加便捷,灵活,前提是属性配置文件中必须在src类路径下.
     */
    public static void main(String[] args) {

//        这种方式更加方便,不需要使用IO和Properties.
        ResourceBundle resourceBundle = ResourceBundle.getBundle("pers/reflection/Userinfo");

//        通过key获取value
        String ClassName = resourceBundle.getString("ClassName");
        System.out.println(ClassName);

        if (ClassName.equals("敢获取你爹?")) {
            System.out.println("老子就获取!!!");
        }

    }
}
