package pers.io.BufferedStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/10:31
 */
public class BufferedReaderTest01 {
    /*
        带有缓冲区的字节输入流,意思是不需要创建byte或者char数组,这个流自带.
        传递进BufferedReader的流叫做:字节流
        BufferedReader叫做包装流/处理流
        关闭流的时候只需要关闭包装流.
     */
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        FileReader fileReader;

        try {
            fileReader = new FileReader("Copy2.java");
//        这个构造方法传的是一个Read类型的.
            bufferedReader = new BufferedReader(fileReader);
//            可以调用BufferedReader中的readLine方法一次读取一行字符.
            /*使用循环
            String string = bufferedReader.readLine();
            System.out.println(string);

            string = bufferedReader.readLine();
            System.out.println(string);

            string = bufferedReader.readLine();
            System.out.println(string);*/

            String s;
            while ((s = bufferedReader.readLine()) != null) {
//                readLine不会读取换行符,需要手动换行.
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
