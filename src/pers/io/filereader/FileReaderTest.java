package pers.io.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/9:33
 */
public class FileReaderTest {
    /*
        按照字符来读取文件
        字符只能读取普通文本文件.
     */
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
//            创建字符输入流
            fileReader = new FileReader("src/pers/io/filereader/Monkey");
//            开始读
            char[] chars = new char[4];

            /*int read = fileReader.read(chars);
            System.out.println(read);*/

            boolean flag = fileReader.ready();
            System.out.println("该流状态:" + flag);

            int temp = 0;
            while ((temp = fileReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, temp));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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
