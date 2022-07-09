package pers.io.BufferedWriter;

import java.io.*;


/**
 * @Author LiZiHao
 * @Date 2022/07/08/11:09
 */
public class BufferedWriterTest01 {
    /*
        缓冲区字符输出流
     */
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
//            创建缓冲区字符输出流
//            FileOutStream是字节流,OutputStreamWriter是包装流,OutputStreamWriter是字节流,bufferedWriter是包装流
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/pers/io/BufferedWriter/Temp", true)));
            bufferedWriter.write("舔狗反击日记 3月17日 晴\n" +
                    "\n" +
                    "今天我对她说：我想问一下，爱奇艺会员，你有吗？\n" +
                    "\n" +
                    "她没发现是“我爱你”的藏头诗，还骂我穷鬼，让我滚。滚就滚，我看不了青春有你，我的青春也没有你。");

            bufferedWriter.write("我爱你");
            bufferedWriter.write("\n");
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
