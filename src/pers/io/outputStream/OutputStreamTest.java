package pers.io.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/07/15:56
 */
public class OutputStreamTest {
    /*
        文件写入信息
     */
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;

        try {
//            如果是这种方式的话,文件不存在会先创建文件,文件存在会先清空文件在写入,这种方式慎用.
//            我们要以追加的形式写入.
//            fileOutputStream = new FileOutputStream("爱死了");

//            这个文件是有数据的,但是使用了这种方法就把源文件的数据清空了,再去写入了指定的数据.
//            fileOutputStream = new FileOutputStream("src/pers/io/outputStream/Hello");

//            如果append - 如果为 true，则将字节写入文件末尾处，而不是写入文件开始处
            fileOutputStream = new FileOutputStream("src/pers/io/outputStream/Hello", true);
//            开始写文件
            byte[] bytes = {97, 98, 99, 100};
            String s = "爱意随风起，风止意难平，与其追风去，不如等风";
            byte[] bytes1 = s.getBytes();

            fileOutputStream.write(bytes);
            fileOutputStream.write(bytes, 0, 2);

            fileOutputStream.write(bytes1);
//            文件写入一定要刷新
            fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
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
