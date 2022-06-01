package pers.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/23/22:19
 */
public class ArrayTest11 {
    /*
        二维数组的遍历
     */
    public static void main(String[] args) {
        String[][] name = {
                {"JAVA", "C#", "C++", "Python", "C", "PHP"},
                {"张三", "李四", "王五", "韩梅梅"},
                {"Jack", "Rose", "lock", "SB"},
        };
        for (int i = 0; i < name.length; i++) {
//            取到name数组中每个元素.name数组中的元素都是一维数组,所以返回值是一维数组.
//            循环第一次 i 为0,所以SB中保存的是name数组中第一个元素,在对第一个元素进行遍历.
            String[] SB = name[i];
            for (int j = 0; j < SB.length; j++) {
                System.out.print(SB[j] + " ");
            }
//            换行符号.输出完第一个元素中的元素就换行,继续输出下一个元素中的元素.
            System.out.println();
        }
        System.out.println();
//        合并
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
//                name[i]是一个整体,表示name数组中的每个元素.[j]是name[i]执行完之后在执行的
//                比如：name[0][1].就表示为：name的第一个元素中的第二个元素.是不过这里的i和j是随着数组长度而变化的,不要写死.
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
        /*
            注意下标是从0开始的,下标不要越界。比如：
            java.lang.ArrayIndexOutOfBoundsException
            name中第三个元素中没有第7个元素,因为第三个元素的长度为：4.
            System.out.println(name[2][6]);
        */
    }
}

