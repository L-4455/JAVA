package pers.object.hashcode;

/**
 * @Author LiZiHao
 * @Date 2022/5/15/22:20
 */
public class HashCode {
    /*
        hashCode是object提供的一个方法,源码:
        public native int hashCode();
        该方法底层是C++;
        hashCode是将一个java对象的内存地址使用哈希算法转成一个哈希值返回给调用者.
        hashCode返回的一个int类型的数据
     */
    public static void main(String[] args) {
        Test test = new Test();
//        int retValue = test.hashCode();
        System.out.println(test.hashCode());

        Monkey monkey = new Monkey();
        System.out.println(monkey.hashCode());
    }
}

class Test {
}

class Monkey {

}
