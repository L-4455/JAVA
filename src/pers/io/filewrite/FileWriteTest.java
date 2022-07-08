package pers.io.filewrite;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/9:47
 */
public class FileWriteTest {
    /*
        以字符的形式写入文件,只能写入普通文件.

     */
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
//            创建输出流对象
            fileWriter = new FileWriter("src/pers/io/filewrite/Temp", true);
            char[] chars = {'我', '是', '你', '爹'};
            fileWriter.write(chars);

            fileWriter.write(97);


//            可以直接写入字符串
            fileWriter.write("我是你爷爷");
            fileWriter.write("\n");
//            写入字符串一部分
            fileWriter.write("我是你爷爷", 3, 2);
//            刷新输出流
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
        }

    }
}
