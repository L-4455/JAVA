package pers.io.dateIO;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/14:45
 */
public class DataOutputStreamTest {
    /*
        数据专属流,这个流写入文本的数据不是普通文本,使用记事本打不开.
     */
    public static void main(String[] args) {
        DataOutputStream dataOutputStream = null;

        try {
//            数据专属写入流,不但能写入数据,还能写入数据的类型.
            dataOutputStream = new DataOutputStream(new FileOutputStream("src/pers/io/dateIO/Temp"));
            byte b = 100;
            short s = 100;
            int i = 300;
            long l = 400L;
            float f = 30.0F;
            double d = 3.14;
            boolean sex = true;
            char c = 'a';
            dataOutputStream.writeByte(b);
            ;
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(l);
            dataOutputStream.writeFloat(f);
            dataOutputStream.writeDouble(d);
            dataOutputStream.writeBoolean(sex);
            dataOutputStream.writeChar(c);
//            刷新输出流
            dataOutputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
