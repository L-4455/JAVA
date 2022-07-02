package pers.array.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/22/22:44
 */
public class ArrayTest08 {
    /*
        数组怎么扩容?
        在java中数组长度一旦确定就不可改变,那么当数组中的保存元素的长度大于数组所定的长度,怎么办?怎么扩容?
        在java中数组扩容:
            新建一个数组,确定新数组的长度合适.把要扩容的数组拷贝到新数组中.
        结论: 数组拷贝效率低,因为需要一个一个的元素去拷贝进去,当源元素多的话,拷贝的时间就长.所以在开发中,尽可能的预计数组的长度.
              预计要尽可能的准确,即使拷贝了,也要减少拷贝的次数.
        JAVA中system类中提供了arraycopy方法,用来拷贝数组.
        public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
        在这个方法中需要传递5个参数,分别是:
                                    拷贝源,拷贝起始位置,拷贝目标,拷贝目标位置,拷贝长度.

        拷贝的元素可以是引用,但拷贝进去的是对象的内存地址.不会是java对象.拷贝不会再次创建对象.
     */
    public static void main(String[] args) {
        int[] number = {123, 34, 512, 456, 112};
        int[] num = new int[10];
//        拷贝源number,从第0个下标开始拷贝,拷贝位置num,从第0个下标开始拷贝,拷贝长度是number的长度
        System.arraycopy(number, 0, num, 0, number.length);
//        遍历num中的元素,前几个个元素都是从其他地方拷贝进来的.具体是几个元素要看源目标的长度.
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("======================");
//        拷贝引用数据类型
        String[] name = {"lisi", "hangman", "LiZiHao", "hh", "qaq", "query", "beware", "array"};
        String[] username = new String[20];
        System.out.println("name数组的长度:" + name.length + " \n元素有:");
        System.arraycopy(name, 0, username, 0, name.length);
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("拷贝到num中,拷贝长度为:" + name.length);
        for (int i = 0; i < username.length; i++) {
            System.out.println("拷贝第" + i + "个" + username[i]);
        }
        System.out.println("====================");
        Object[] object = {"13", "234", "2334", "324"};
        Object[] objects = new Object[10];
        System.arraycopy(object, 0, objects, 0, object.length);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }


    }
}
