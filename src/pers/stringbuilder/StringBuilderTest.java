package pers.stringbuilder;

/**
 * @Author LiZiHao
 * @Date 2022/6/9/15:42
 */
public class StringBuilderTest {
    /*
        StringBuilder和StringBuffer的作用一样都是字符串拼接
        不同的是
        StringBuilder没有线程安全
        StringBuffer有线程安全
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100);
        stringBuilder.append(true);
        stringBuilder.append(false);
        stringBuilder.append(20);
        stringBuilder.append(30);
        stringBuilder.append("hello");
        stringBuilder.append("Word");

        System.out.println(stringBuilder);
    }
}
