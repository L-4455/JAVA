package pers.io.objectio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/20:52
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Students"));
            Object o = ois.readObject();
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
