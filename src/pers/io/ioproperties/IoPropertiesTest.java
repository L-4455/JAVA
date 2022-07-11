package pers.io.ioproperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author LiZiHao
 * @Date 2022/07/10/12:00
 */
public class IoPropertiesTest {
    /*
        获取到userinfo中的数据放到Map集合中

        新的设计理念:
        1.对于需要频繁修改的数据信息,一般不写在java源程序里,而是写到一个文件中
          通过java程序来获取这个文件中的信息,即使文件中的信息修改了,java程序也不需要修改代码
          类似于以上机制的文件被称为:
          "属性配置文件",存放格式一般为:
            key=value
            key=value
          属性配置文件通常以.properties结尾.
          properties类也是专门存放这种文件中的数据的.
        2.java规范中要求额:属性配置文件一般是.properties结尾,但不是必须的.
        3.如果属性配置文件中的key重复了会发生value覆盖.
     */
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/pers/io/ioproperties/userinfo.properties");

//            创建集合对象
            Properties properties = new Properties();
//            使用集合的load方法把FileReader读取到的数据流到集合中.
            properties.load(fileReader);

//            此时集合中有数据了,userinfo是以key和value的形式存放数据的,可以通过key来获取value
//            即使文件中value修改了,也可以在不修改代码的情况下获取到.
            String username = properties.getProperty("username");
            System.out.println(username);

            String password = properties.getProperty("password");
            System.out.println(password);

            Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
            for (Map.Entry<Object, Object> entry : entrySet) {
                System.out.println(entry);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
