package pers.io.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/07/10:53
 */
public class FileInputStreamTest02 {
    /*
        对FileInputStreamTest01进行改进,循环读取数据;
     */
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\IdeaProjects\\JAVA\\src\\pers\\io\\Temp");
//          读取数据,使用循环.
            while (true) {
                int reader = fileInputStream.read();
                if (reader == -1) {
                    break;
                }
                System.out.println(reader);
            }
//            改进while循环
            int reader = 0;
//            先读取数据在赋值给reader,在判断reader是否==-1,如果不等于就输出,如果等于就结束循环.
//            long begin = System.currentTimeMillis();

            while ((reader = fileInputStream.read()) != -1) {
                System.out.println(reader);
            }
            /*对于计算机来说这个时间可以忽略不计,但是内存和硬盘的交互太频繁.需要改进
            long end  = System.currentTimeMillis();
            System.out.println("耗时:"+ (end - begin)+ "ms");*/

        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            关闭输入流
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
//                    throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }
        }
    }
}
