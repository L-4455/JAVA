package pers.stringbuffer;

/**
 * @Author LiZiHao
 * @Date 2022/6/9/15:27
 */
public class StringBufferTest {
    /*
        在字符串拼接时,常常使用"+",这样做的话会浪费方法区中的字符串常量池空间.
        导致程序执行效率低.
        所以JAVA提供了StringBuffer类来帮助我们连接字符串.

        StringBuffer默认创建的字符串缓冲区对象的容量是16,我们可以在创建对象时候调用构造方法初始化默认容量
        以此来减少在开发中对数组扩容的次数.提高程序的执行效率.
     */
    public static void main(String[] args) {
        /*
        以下代码就造成了字符串常量池的空间浪费
        String s = "";
        for (int i = 0; i < 100 ; i++) {
            s += i;
            System.out.println(s);
        }

         */
//        字符串缓冲区对象默认值为16
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(520);
        stringBuffer.append(true);
        stringBuffer.append(100);
        stringBuffer.append(false);
        stringBuffer.append(2);
        stringBuffer.append(33);

        System.out.println(stringBuffer);

//        使默认值为100
        StringBuffer sb = new StringBuffer(100);
        sb.append(200);
        sb.append("煞笔");
        sb.append(100);
        sb.append(true);
        sb.append(false);

        System.out.println(sb);
    }
}
