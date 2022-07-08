package pers.io.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/07/15:09
 */
public class FIleInputStreamTest04 {
    /*
        最终版本
     */
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/pers/io/Temp");
            inputStream = new FileInputStream("src/pers/io/Hello");
            byte[] bytes = new byte[2];

            /*不够完美
            while(true){
                int readCount = inputStream.read(bytes);
                if (readCount == -1) {
                    break;
                }
                // abcdef
                System.out.print(new String(bytes, 0, readCount));
            }*/

            int readCount = 0;
            while ((readCount = inputStream.read(bytes)) != -1) {
//                abcdef
                System.out.print(new String(bytes, 0, readCount));
            }
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
//                    throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }
        }
    }
}
