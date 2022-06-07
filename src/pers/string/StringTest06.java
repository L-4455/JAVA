package pers.string;

/**
 * @Author LiZiHao
 * @Date 2022/6/7/16:20
 */
public class StringTest06 {
    /*
        String中常用的方法
     */
    public static void main(String[] args){
//        1.charAt(int index)
//        返回char指定索引处的值
//        这里的1就是下标
        System.out.println("我爱你".charAt(1));
        System.out.println("我是你爹".charAt(3));

//        2.compareTo(String anotherString)
//        按字典顺序比较两个字符串。
//        -1。小于0,表示这两个字符串中前小后大
        System.out.println("abcd".compareTo("abce"));
//         1。大于0,表示这两个字符串中前大后小
        System.out.println("bac".compareTo("abc"));
//        0。等于0,表示这两个字符串相等
        System.out.println("abc".compareTo("abc"));

//        3.contains(CharSequence s)
//         当且仅当此字符串包含指定的char值序列时才返回true。
        System.out.println("JAVA就是厉害.java".contains("java"));
        System.out.println("JAVA就是厉害.java".contains("C"));

//        4.endsWith(String suffix)
//          测试此字符串是否以指定的后缀结尾
        System.out.println("6666.txt".endsWith("t"));//true
        System.out.println("werljgjdjfgfjadf".endsWith("f"));//true
        System.out.println("jgljajdflpwrasfe".endsWith("w"));//false

//        5.equals(Object anObject)
//          将此字符串与指定对象进行比较
        System.out.println("abc".equals("abc"));//true
        System.out.println("xyz".equals("abc"));//false

//        6.indexOf(String str)
//          返回指定子字符串第一次出现的字符串内的索引
        System.out.println("oraclec++javapythonjsc#cphpjava".indexOf("java"));

//        7.isEmpty()
//          返回true如果，且仅当 length()为 0
            String s1 = "";
            String s2 = "1";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

//        8.getBytes()
//          使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中
        byte[] bytes = "asdfab".getBytes();
        for (int i = 0; i < bytes.length ; i++) {
            System.out.println(bytes[i]);
        }

//        9.equalsIgnoreCase(String anotherString)
//          将此 String与其他 String比较，忽略大小写
        System.out.println("ABc".equalsIgnoreCase("abc"));
        System.out.println("ABc".equals("abc"));

//        10.length()
//        返回字符串长度
        /*
            注意:这里的length不是数组的长度,而是字符串的长度.
            判断数组长度使用.length; 判断字符串长度使用.length();
            数组长度是属性,字符串长度是方法.这两个是不一样的
         */
        System.out.println("abcd".length());

//        11.lastIndexOf(int ch)
//          返回指定字符的最后一次出现的字符串中的索引
        System.out.println("dfsjldfsjfjljsdfjjavaasdflsdfjava".lastIndexOf("java"));
        System.out.println("oraclec++c/pythonjava".lastIndexOf("python"));

//        12.replace(char oldChar, char newChar)
//        oldChar == target
//        newChar == replacement
//        替换字符串中的某个元素.oldChar被替换的元素,newChar新元素
        System.out.println("我爱你啊".replace("啊", "草"));
        System.out.println("2004-11-05".replace("-", "/"));

//        13.split(String regex)
//        以某个字符对字符串进行拆分
        String[] array = "2004-11-05".split("-");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        String[] arr = "aghgweohhqw".split("w");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

//        14.startsWith(String prefix)
//          测试此字符串是否以指定的前缀开头。
        System.out.println("asljfwejr".startsWith("s"));
        System.out.println("asljfwejr".startsWith("a"));
    }
}
