package pers.io.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/07/16:45
 */
public class Copy1 {
    /*
        文件的拷贝
        从这个位置拷贝到那个位置
        FileInputStream和FileOutputStream的联合使用
        一边读一边写
     */
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

//        先读取数据
        try {
//            创建输入流对象
            fileInputStream = new FileInputStream("D:\\我的账户.txt");
            byte[] bytes = new byte[1024 * 1024]; // 一次读3MB
//            创建输出流对象
            fileOutputStream = new FileOutputStream("D:\\Videos\\我的账户.txt", true);

            long begin = System.currentTimeMillis();

            int temp;
            while ((temp = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, temp);
            }

            long end = System.currentTimeMillis();
            System.out.println("耗时:" + (end - begin) + "/MS");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            两个close单独try,如果其中一个发生了异常,那么另一个close关闭不了.
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
