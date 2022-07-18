package pers.reflection.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * @Author LiZiHao
 * @Date 2022/07/16/20:14
 */
public class ReflectionTest03 {
    /*
        验证反射机制实例化对象的灵活性

        1.这个反射机制实例化对象灵活在只需要修改属性配置文件,不需要修改代码
            这就符合了OCP原则(开闭原则:对扩展开发,对修改关闭);
     */
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
//            创建IO流读取属性配置文件
            fileReader = new FileReader("src/pers/reflection/Userinfo.properties");
//            创建Map集合
            Properties properties = new Properties();
//            把属性配置文件中的数据读取到集合中
            properties.load(fileReader);

//            通过key获取value
            String ClassName = properties.getProperty("ClassName");
//            System.out.println(ClassName);

//            获取Class文件
            Class c = Class.forName(ClassName);

//            c.newInstance(); 相当于new 类名;
            Object o = c.newInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String Time = simpleDateFormat.format(o);
            System.out.println(Time);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
