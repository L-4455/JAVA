package pers.luochen.methodtest;

/**
 * @author LiZhiHao
 * @date 2022/2/28 13:49
 */
public class MethodTest01 {
    public static void main(String [] args){
        /*
        *
        * 方法的语法结构：
        *  [修饰符列表] 返回值类型 方法名(形式参数列表,形式参数列表){
        *   方法体;
        * }
        * 方法定义在类体之内，主方法体之外。一个方法体中只能定义一个方法。
        * 在带有static的方法时，调用方法时这样调佣的：类名.方法名(形式参数列表,形式参数列表);，翻译过来就是　类名的方法(实参);
        * 在一个类中可以定义多个方法，但每个方法是独立的代码片段，只有调用的时候才会执行。
        * 方法是为了完成某个特定的功能而定义的。
        * 方法必须带有返回值类型，即使方法体不需要返回值，那么返回值类型就写为 void(空)
        * 当方法有返回值时，返回值的类型和定义方法返回值类型保持一致。返回值就是一个具体的数据。
        * 当调用方法时，传递的实参数据类型也要和形参数据类型保持一致，数量也要保持一致。
        * 当方法有返回值类型时，需要用return 值;来进行方法返回值。即使方法没有返回值类型也可以写return;但是不可以带有值。
        *
        *
        * */
        MethodTest01.sumInt(20,10);
    }
    public static void sumInt(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
