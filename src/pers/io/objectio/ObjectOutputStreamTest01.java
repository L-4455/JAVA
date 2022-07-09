package pers.io.objectio;

import pers.io.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/20:34
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        Student student = new Student(100, "lisi");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Students"));
            oos.writeObject(student);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
