/**
 * @author: LiZhiHao
 * @Date: 2022-02-28 15:47:42
 * @LastEditTime: 2022-04-08 19:16:50
 */
package pers.luochen.methodtest;

/**
 * @author LiZhiHao
 * @date 2022/2/28 15:47
 */
public class MethodTest05 {
    public static void main(String[] args) {
        try (/*
                 * 如果方法的返回值不为空时该怎么
                 * 当方法有返回值类型时，需要用return 值;
                 * 需求：求两个int类型的商，并返回给调用者。
                 *
                 * */
                //boolean result = remove(10,2);
        java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = remove(num1, num2);
            int number = 5;
            if (result > number) {
                System.out.println(result + " 非常Good ");
            } else {
                System.out.println("错了啊");
            }
        }
        //还可以直接这样接受返回值
        System.out.println(remove(10, 22));
        //java: 不兼容的类型: int无法转换为boolean
        //编译报错，可以看出 使用变量的形式来接受返回值的，变量的数据类型也要和返回值的数据类型保持一致。
        /*
         * 可以看出 remove方法执行了。输出了 Hello World语句。
         * 但是我们还没有满足需求，由此可以看出，方法的返回值调用者可以不用接受，不会报错。
         * 但是在一般情况下调用者是要接受返回的数据的，不然就不会去调用这个方法。
         * 我们使用变量的形式来接受返回的值。
         * */

    }

    public static int remove(int num1, int num2) {
        //System.out.println("Hello World");
        //没有写return;时
        //java: 缺少返回语句
        //如果返回值类型不为空时必须要有return;返回语句。
        //java: 缺少返回值
        //return;
        /*
         * 即使写了return;编译器也会报错。因为没有返回的值，
         * 也就是说当返回值类型不为空时，返回语句必须有一个要返回的值。
         * */
        return num1 / num2;
    }
    
}

