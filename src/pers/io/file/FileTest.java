package pers.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/21:01
 */
public class FileTest {
    /*
        1.FileTest类不是IO流和IO流四大家族没关系,不能输出输入文件,
     */
    public static void main(String[] args) {
//        创建file对象
        File file = new File("src/pers/io/file/Temp");

//        常用方法

//        判断文件是否存在,true表示存在,false表示不存在.
        boolean sex = file.exists();
        System.out.println(sex);

//        获取文件名
        String s = file.getName();
        System.out.println(s);

//        获取文件绝对路径
        String path = file.getAbsolutePath();
        System.out.println(path);

//        获取文件相对路径的父路径
        String parent = file.getParent();
        System.out.println(parent);

//        测试此抽象路径名表示的文件是否是一个目录
        boolean is = file.isDirectory();
        System.out.println(is);

//        测试此抽象路径名表示的文件是否是一个标准文件
        boolean file1 = file.isFile();
        System.out.println(file1);

//        返回此抽象路径名表示的文件最后一次被修改的时间
        long l = file.lastModified(); // 返回的是1970年到目前时间的总毫秒数
//        把毫秒数转为指定日期格式的时间
        Date date = new Date(l);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/d HH:mm:ss:SS");
        String format = simpleDateFormat.format(date);
        System.out.println("文件最后修改时间:" + format);


//        返回文件的字节大小
        long length = file.length();
        System.out.println(length);

//        创建此抽象路径名指定的目录。
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

//        创建此抽象路径名指定的目录，包括所有必需但不存在的父目录.创建多重目录.
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);

//        获取当前目录下所有子目录
        File file2 = new File("D:\\Videos");
        File[] files2 = file2.listFiles();
        for (File file3 : files2) {
            System.out.println(file3.getAbsolutePath());
        }
    }
}
