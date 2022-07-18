package pers.reflection.path;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author LiZiHao
 * @Date 2022/07/17/9:55
 */
public class IoProperties {
    /*
        对属性配置文件的路径进行修改
        通过这种方式获取属性配置文件中的数据更加通用.
     */
    public static void main(String[] args) {
//        FileReader reader = null;
        InputStream reader = null;
        try {
//            这里的路径采用绝对路径,且使用线程方法获取
            /*但是还有更方便的
            String path = Thread.currentThread().getContextClassLoader().getResource("pers/reflection/Userinfo.properties").getPath();
            reader = new FileReader(path);
            */


//            以流的形式直接返回
            reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("pers/reflection/Userinfo.properties");


            Properties proPerties = new Properties();
            proPerties.load(reader);
            String ClassName = proPerties.getProperty("ClassName");
            System.out.println(ClassName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
