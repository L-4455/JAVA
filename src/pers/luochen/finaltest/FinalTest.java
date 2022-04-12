package pers.luochen.finaltest;


/**
 * @author LiZhiHao
 * @date 2022/4/11/0011 21:35
 */
public class FinalTest {



    /**
     *  final int number;
     *  编译错误,final修饰的成员变量之实例变量必须手动赋值,不能使用系统默认值.
     *  因为final修饰后的变量就无法二次赋值.
     */

    /**
     * 第一种方式
     * final int numebr = 10;
     */


    /**
     * 第二种方式
     * 这其实是一种方式,因为在本质上这两个赋值的过程都是在构造方法执行时赋值的.
     *
     * final int number;
     *
     * //无参数构造方法
     * public FinalTest(){
     * this.number = 10;
     * }
     */

    /**
     * 第三种方式
     * <p>
     * final int number;
     * //有参数构造方法
     * public FinalTest(int number){
     * this.number = number;
     * }
     */
    public static void main(String[] args) {

        /*
         * final意为:最终的,不可变的.
         * final修饰的变量无法继承.
         * final修饰的方法无法覆盖.
         * final修饰后的变量无法二次赋值.
         * final修饰后的成员变量之实例变量必须手动赋值,不能使用系统默认值.
         * final修饰的引用指向了某一个对象后不能再去只想其他对象.也就是说这个被引用指向对象无法被垃圾回收器回收.
         * 但是final修饰的引用可以修改被引用指向的某一个对象的内部属性的内存.
         *  final修饰的实例变量一般和static联用,这个叫:常量.常量就是不可变的量.
         */

        //FinalTest finalTest = new FinalTest(23);
        //System.out.println(finalTest.number);

        final Monkey monkey = new Monkey(213);
        System.out.println(monkey.number);
        //可以再次赋值.
        monkey.number = 10;
        System.out.println(monkey.number);
        /*
         *  monkey = new Monkey();
         *  编译错误,final修饰过的引用指向了某一个对象,那么他就不能再去指向另一个对象.也就是说这个被引用指向对象无法被垃圾回收器回收.
         */
        System.out.println("LITCHI的国籍是" + Chinese.GUO_JI);
        System.out.println("圆周率:" + Chinese.PI);
        
        for(int i = 1; i <= 9999999; i++){
            System.out.println(i);
        }
    }
}

























