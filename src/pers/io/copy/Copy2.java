package pers.io.copy;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/9:58
 */
public class Copy2 {
    /*
        FileWriter/FileReader的联合使用,普通文本文件的复制.
     */
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("src/pers/io/copy/Copy2.java");
            fileWriter = new FileWriter("Copy2.java");
//            开始一边读一边写
            char[] chars = new char[1024 * 512]; // 1MB
            int temp = 0;
            while ((temp = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, temp);
            }
//            刷新文件
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
