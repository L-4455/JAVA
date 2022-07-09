package pers.io.dateIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/14:43
 */
public class DataInputStreamTest {
    /*
        数据专属流
        DataOutputStream写入的文件只能用DataInputStream来读,而且要按照写入顺序来读.
     */
    public static void main(String[] args) {
        DataInputStream dataInputStream = null;

        try {
//            创建数据文件输出流
            dataInputStream = new DataInputStream(new FileInputStream("src/pers/io/dateIO/Temp"));
            byte b = dataInputStream.readByte();
            short s = dataInputStream.readShort();
            int i = dataInputStream.readInt();
            long l = dataInputStream.readLong();
            float f = dataInputStream.readFloat();
            double d = dataInputStream.readDouble();
            boolean sex = dataInputStream.readBoolean();
            char c = dataInputStream.readChar();

            System.out.println(b + 100);
            System.out.println(s + 100);
            System.out.println(i + 100);
            System.out.println(l + 100);
            System.out.println(f + 100);
            System.out.println(d + 100);
            System.out.println(sex);
            System.out.println(c + 'b');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
