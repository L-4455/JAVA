package pers.io.objectio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author LiZiHao
 * @Date 2022/07/09/20:52
 */
public class ObjectInputStreamTest01 {
    /*
    反序列化
    源代码进行了修改,此时在反序列化就会发生异常
    pers.io.bean.Student; local class incompatible:
    stream classdesc serialVersionUID = 8230376889015097429(修改后),
    local class serialVersionUID = 521503404027886807(修改前)
    修改前的序列化版本号与修改后的不一样,所以JAVA会认为这是两个不同的类,修改后的反序列化并没有
    执行序列化,所以会发生异常.
     */
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
