package pers.io.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/07/10:41
 */
public class FileInputStreamTest01 {
    /*
        1.FileInputStream文件输入流
        从硬盘到内存的过程为输入
        2.
     */
    public static void main(String[] args) {
//        通过构造方法传递一个文件的绝对路径,这个方法会抛出异常,需要处理,一般main中使用try处理异常
        FileInputStream fileInputStream = null;
        try {
//            IDEA工具会自动为路径添加双反斜杠,因为为一个反单斜杠为:转义.两个反斜杠为普通反斜杠.
//            fileInputStream = new FileInputStream("D:\\IdeaProjects\\JAVA\\src\\pers\\io\\Temp");
//            这种斜杠也可以
            fileInputStream = new FileInputStream("D:/IdeaProjects/JAVA/src/pers/io/Temp");

//            读取文件中的数据,返回值是int类型,因为读取的是字节.read也会抛出异常,需要处理.一般try中的异常采用细致处理.
//            a字符对应的字节是 97
            int reader = fileInputStream.read();
            System.out.println(reader);

            reader = fileInputStream.read();
            System.out.println(reader);

            reader = fileInputStream.read();
            System.out.println(reader);

            reader = fileInputStream.read();
            System.out.println(reader);

            reader = fileInputStream.read();
            System.out.println(reader);

            reader = fileInputStream.read();
            System.out.println(reader);

//            只要数据读取完毕,后面的在读取都是-1
//            读取第7次,文件中的数据只有6个,所以第7个数据是空,read方法返回-1;
            reader = fileInputStream.read();
            System.out.println(reader);

//            读取第8次,文件中的数据只有6个,所以第8个数据是空,read方法返回-1;
            reader = fileInputStream.read();
            System.out.println(reader);


//            IO流一定要关闭,在finally中关闭IO流
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            close也会抛出异常,需要处理
            try {
                if (fileInputStream != null) {
//                    fileInputStream不等于空的话就关闭,等于空的话就没必要关闭.
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
