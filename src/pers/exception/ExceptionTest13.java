package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/10:42
 */
public class ExceptionTest13 {
    /*
        finally语句面试题

        分析一下代码sum的输出结果
        结果:100
        这个程序的结果和ExceptionTest12有点矛盾,这主要归功于JAVA的语法规则.

        java语法规则其一:
            方法体中的代码必须遵循自上而下的顺序执行.
        java语法规则其二:
            return语句一旦执行整个JVM程序结束.

        如果按照ExceptionTest12的执行顺序,那么最终输出结果应该是101.但并不是..
        反编译一下class文件看看编译后的源代码
     */
    public static void main(String[] args) {
        int sum = sum();
        System.out.println(sum);
    }

    public static int sum() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }
}
