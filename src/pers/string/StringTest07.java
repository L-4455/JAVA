package pers.string;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/16:23
 */
public class StringTest07 {
    /*
        问:为什么String保存的字符串不可变,StringBuffer和StringBuilder可变?
        答:在源代码中,String类中有一个char[]数组,这个数组是用final修饰的
            我们都知道数组一旦创建则长度不可变,而一个被final修饰的引用一旦指向某个对象
            那么就不能在指向其他对象.所以String所保存的字符串不可变.
           而StringBuffer和StringBuilder不同,
           在源代码中StringBuffer和StringBuilder的抽象类AbstractStringBuilder中的char数组是没有被final修饰的
           而他俩在创建对象时创建了一个字符串缓存区,这个默认大小应该是16,当满了之后会自动进行字符串扩容,底层调用了数组的方法
           Arrays.arraycopy();数组拷贝,因为char数组没有被final修饰所以数组的大小可变,也就是说字符串内容是可变的.
     */
    public static void main(String[] args) {

    }
}
