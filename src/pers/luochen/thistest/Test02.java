/**
 * @author: LiZhiHao
 * @Date: 2022-04-05 23:10:16
 * @LastEditTime: 2022-04-05 23:22:18
 */
package pers.luochen.thistest;

public class Test02 {
    public static void main(String[] args) {
        Test02 test02 = new Test02();
        //可以使用引用的形式调用带有静态方法,但不推荐.
        test02.doOther();
        //test02赋值为 空,执行在执行引用.的形式去调用方法,因该会报错 空指针异常.
        test02 = null;
        //很明显,程序执行到了这里,程序并没有报错,所以说此时的doOther方法肯本没有对象的参与,即使写了引用,java也会把她转换为类名.
        test02.doOther();

        System.out.println("我执行了,没有报错空指针异常");
    }
    public static void doOther(){
        System.out.println("开始");
    }
}
