package pers.io.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LiZiHao
 * @Date 2022/07/07/14:24
 */
public class FIleInputStreamTest03 {
    /*
        以字节方式读取数据,这样内存与硬盘的交互太频繁.
        read方法可已传递一个byte数组,该数组的长度就是read一次读取的长度,
        读取完之后放到数组内
        比如:byte[] bytes = new byte[4];
        就表示read一次读取4个数据并存放到byte数组中
        如果一个文件的数据不够被4整除,那么最后读取的几个数据会放到byte数组下标0开始的位置
        也就是把最初的数据覆盖了.
     */
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
//            IDEA中的相对路径
//            相对路径是从默认路径开始寻找目标文件,直到找到.如果不存在就会发生异常.
//            IDEA的默认相对路径是从工程文件src瞎开始寻找....
            fileInputStream = new FileInputStream("src/pers/io/Temp");

//            读取文件,一次读取一个字节太少,使用byte数组让read一次读取多个字节;
            byte[] bytes = new byte[4];
//            byte[] bytes = new byte[2];
//            这个方法的返回值是一次读取字节的数量,而不是字节本身.
            int readCount = fileInputStream.read(bytes);
            System.out.println(readCount); // 4

           /*
            这种方式是把整个byte数组转为了字符串,对于第一次读取的数组还好说,可是对于第二次读取的数据就麻烦了,
            也把之前读取过得数据转为了字符串,这样不行.
            应该是读取几个字节就转几个字节.应该使用另一个构造方法.
            String(byte[] bytes, int offset, int length)
//            使用String的构造方法把一个byte数组转为一个字符串
//            System.out.println(new String(bytes)); // abcd
            */
            System.out.println(new String(bytes, 0, readCount));

//            第一次读取完,读了4个字节.第二次读取,文件中只剩两个数据了,所以读取了2个字节,在往后面读取就是-1了.
//            第一次读取完:byte数组中的内容是:abcd
//            第二次读取完:byte数组中的内容就是:efcd.并不会扩容数组,而是覆盖掉前面的数据.
            readCount = fileInputStream.read(bytes);
            System.out.println(readCount); // 2
//            使用String的构造方法把一个byte数组转为一个字符串
//            System.out.println(new String(bytes)); // efcd

//            应该是读取几个字节就转几个字节.应该使用另一个构造方法.
//            String(byte[] bytes, int offset, int length)
            System.out.println(new String(bytes, 0, readCount)); // ef

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
