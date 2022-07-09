package pers.io.BufferedReader;

import java.io.*;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/10:55
 */
public class BufferedReaderTest02 {
    /*
        转换流的使用
     */
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;

//        把字节型fileInputStream转为字节型.
        try {
            /*
            代码合并
            fileInputStream  = new FileInputStream("Copy2.java");
//            fileInputStream是字节流,inputStreamReader是包装流
            inputStreamReader = new InputStreamReader(fileInputStream);
//        这个构造方法只能传递Read类型的,字符型的,如果是字节型的需要转换.
//            inputStreamReader是字节流,bufferedReader是包装流
            bufferedReader = new BufferedReader(inputStreamReader)
            */
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("Copy2.java")));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
