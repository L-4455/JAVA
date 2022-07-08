package pers.io.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/07/15:30
 */
public class FIleInputStreamTest05 {
    /*
        FileInputStream除了read还有两个常用的方法
        int available() 返回剩余的字节数量.
        long skip(long n)  跳过几个字节开始读.
     */
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("src/pers/io/Temp");
            int available = fileInputStream.available();
            System.out.println("总字节数量:" + available);

//            int read = fileInputStream.read();
//            System.out.println(read)
            int count = fileInputStream.available();
//            文件中本原有6个字节,读取一个还剩5个.
            System.out.println("还剩几个没读:" + count); // 5

//            这个方法还有另一种作用:byte数组的长度不用写死.但是一般大文件不会这样用,因为byte数组不能太大.
//            byte[] bytes = new byte[fileInputStream.available()];
//            int readCount = fileInputStream.read(bytes);
//            System.out.println(new String(bytes));

//            skip()方法,跳过几个字节开始读
            long skip = fileInputStream.skip(3);
            System.out.println("跳过" + skip + "个字节");
            int reader = fileInputStream.read();
//            abcDef 跳过abc开始读:def
            System.out.println(reader);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
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
