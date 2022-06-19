package pers.lianxi;

/**
 * @Author LiZiHao
 * @Date 2022/6/19/14:10
 */
public class StringTest {
    public static void main(String[] args) {
//          1.charAr方法.
        String s1 = new String("我是你的");
        char charAt = s1.charAt(3);
        System.out.println(charAt);
        System.out.println("我爱你".charAt(1));

//            2.compareTo方法
//        按照字典顺序比较两个字符串的大小,
//        如果参数字符串等于此字符串，则返回值 0;
//        如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值;
//        如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值.
        System.out.println("abc".compareTo("bac"));//-1
        System.out.println("bcd".compareTo("abc"));// 1
        System.out.println("abc".compareTo("abc"));// 0

//        3.concat(String str),将指定字符串连接到此字符串的结尾.
        System.out.println("我是你爹".concat("6666"));

//        4.contains(CharSequence s)
//        判断参数字符串是否包含在原字符串中.
        System.out.println("厉害啊煞笔".contains("厉害"));

//        5.endsWith(String suffix)
//        测试此字符串是否以指定的后缀结束
        System.out.println("你在看什么.java".endsWith("b"));

//        6.equals(Object anObject),将此字符串与指定的对象比较,String重写了equals.
        String s2 = new String("666");
        System.out.println("666".equals(s2));
        System.out.println("222".equals(s2));

//        7.equalsIgnoreCase(String anotherString),
//        将此 String 与另一个 String 比较，不考虑大小写.
        System.out.println("abc".equalsIgnoreCase("ABC"));
        System.out.println("===================");

//        8.getBytes()
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
//        9.hashCode(),返回此字符串的哈希码.
        System.out.println("abc".hashCode());

//        10.indexOf(int ch),返回指定字符在此字符串中第一次出现处的索引,如果未出现该字符，则返回 -1.
        System.out.println("abc".indexOf("a"));
        System.out.println("xyz".indexOf("y"));

//        11.indexOf(int ch, int fromIndex)
//          返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。

        System.out.println("我是你爸爸".indexOf("爸", 2));

//        12.indexOf(String str)
//          返回指定子字符串在此字符串中第一次出现处的索引,如果它不作为一个子字符串出现，则返回 -1.
        System.out.println("javaYYDSC++666".indexOf("b"));//-1
        System.out.println("javaYYDS+++^^^".indexOf("^"));//11

//        13.isEmpty(),当且仅当 length() 为 0 时返回 true,
        String ss1 = "";
        System.out.println(ss1.isEmpty());//true
        String ss2 = "aa";
        System.out.println(ss2.isEmpty());//false

//        14.lastIndexOf(int ch)
//          返回指定字符在此字符串中最后一次出现处的索引
        System.out.println("abccccccc".lastIndexOf("c"));

//        15.length()
//          返回此字符串的长度
        /*
            这里是返回字符串的长度,这个length是方法不是属性
            数组的length是数组的属性不是方法.
            length()和length不一样的.
         */
        System.out.println("xyz".length());

//        16.split(String regex)
//        字符串数组,根据给定正则表达式的匹配拆分此字符串
        String[] ss3 = "2022-11-05".split("-");
        for (String s : ss3) {
            System.out.println(s);
        }

//        17.startsWith()
//        测试此字符串是否以指定的前缀开始
        System.out.println("abc".startsWith("b"));//false
        System.out.println("abc".startsWith("a"));//true

//        18.substring(int beginIndex)
//        返回一个新的字符串，它是此字符串的一个子字符串
        String sss = "abc";
        String substring = sss.substring(2);
        System.out.println(substring);
    }
}
