package pers.reflection.path;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Author LiZiHao
 * @Date 2022/07/17/9:21
 */
public class AboutPath {
    /*
        关于文件的绝对路径问题
        Thread.currentThread().getContextClassLoader().getResource("文件的路径,以src开始").getPath();
        这个方法可以获取文件的绝对路径,比较通用.即使代码移植了也可以获取到.但前提是文件必须在src根路径下.

     */
    public static void main(String[] args) {
        try {
//            这种方式只适用于IDEA下,因为IDEA默认路径是project根下.不太灵活,可移植性差
            FileReader fileReader = new FileReader("src/pers/reflection/Userinfo.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        通用的代码,获取文件的绝对路径.前提是该文件在类根路径下.src下的路径就是根路径,以src开始.

        /*
            Thread.currentThread() 当前线程对象
            getContextClassLoader() 当前线程对象的方法
            getResource 当前类加载器中的方法
         */
        String path = Thread.currentThread().getContextClassLoader().getResource("pers/reflection/Userinfo.properties").getPath();
        System.out.println(path);
    }
}
