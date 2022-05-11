package pers.object.tostring;

/**
 * @Author LiZiHao
 * @Date 2022/5/9/23:19
 */
public class ToString {
    public static void main(String[] args) {
        /*
         * toString的使用
         * toString是JAVA提供的一个方法,源代码:
         *   public String toString() {
         *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *   }
         * toString方法是object中的方法,是JAVA提供的.这个方法默认返回的是:当前类名@十六进制文本.
         * 官方文档英文翻译:
         * 返回对象的字符串表示形式。 通常，toString 方法返回一个“以文本方式表示”该对象的字符串。 结果应该是一个简洁但信息丰富的表示，易于人们阅读。 建议所有子类重写此方法。
         * Object 类的 toString 方法返回一个字符串，该字符串由对象作为其实例的类的名称、at 符号字符“@”和对象哈希码的无符号十六进制表示形式组成。 换句话说，此方法返回一个等于以下值的字符串：
         *    getClass().getName() + '@' + Integer.toHexString(hashCode())
         *
         * 回报：
         * 对象的字符串表示形式。
         * 但是默认的toString方法一般不能满足业务的需求,一般子类都要重写toString方法.返回结果应该是:简洁的,易阅读的
         *
         * */
        Test01 test01 = new Test01();
        //重写toString方法之前的返回结果:
//        pers.object.tostring.Test01@6a5fc7f7
//        System.out.println(test01.toString());
        //重写toString方法后的结果
        test01.setName("张国柱");
        System.out.println(test01.toString());
    }
}
