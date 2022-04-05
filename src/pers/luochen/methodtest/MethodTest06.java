package pers.luochen.methodtest;

/**
 * @author LiZhiHao
 * @date 2022/2/28 16:16
 */
public class MethodTest06 {
    public static void main(String[] args) {
        /*
         * 在返回值类型为空时写return;语句。
         * 如果执行到了return;语句那么 这个方法就会终止运行直接结束。
         * */
        m();
        /*
         *运行结果：
         *   1
         *   2
         *   3
         *   4
         *  看出 Hello World并没有执行,这就说明了执行到return;语句时 整个方法都结束了。下面的语句代码就不会在执行了。
         * 但是换成了break;时 Hello World就会执行，这就是说明了 break;结束的是for方法，而return;结束的是整个方法。
         * 可见return;级别比break;高。
         * */

    }

    public static void m() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                return;
                //break;
            }
            System.out.println(i);
        }
        System.out.println("Hello World");
    }
}
