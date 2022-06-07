package pers.string;

/**
 * @Author LiZiHao
 * @Date 2022/6/7/15:28
 */
public class StringTest05 {
    public static void main(String[] args){
//        这是最常见的创建String对象方法
        String s2 = "李四";
        System.out.println(s2);
//        97->a 98->b 99->c
        byte[] bytes = {97,98,99};
        String s1 = new String(bytes);
        /*
            输出结果为abc,但是s1是引用,这里应该调用toString方法返回一个内存地址
            但是并没有,所以可以得出结论:String类重写了toString方法/
         */
        System.out.println(s1);

        String s3 = new String(bytes,1,2);
//        输出结果bc,offset表示起始下标,length表示长度.
//        也就是说这个方法可以把数组中的一部分转为字符串
        System.out.println(s3);
        String s4 = new String(bytes,2,1);
        System.out.println(s4);

//        类似的还有char
        char[] chars = {'a','b','c','d'};
        String s5 = new String(chars);
        System.out.println(s5);

        String s6 = new String(chars,1,3);
        System.out.println(s6);

        String s7 = new String(chars,2,2);
        System.out.println(s7);


    }
}
