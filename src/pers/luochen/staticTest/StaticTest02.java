/**
 * @author: LiZhiHao
 * @Date: 2022-04-05 23:28:43
 * @LastEditTime: 2022-04-05 23:31:46
 */
package pers.luochen.statictest;

public class StaticTest02 {
    static {
        System.out.println("开始1");
    }

    static {
        System.out.println("开始2");
    }

    static {
        System.out.println("开始3");
    }

    public static void main(String[] args) {
        /*
          static代码块
           语法:
                   static{
                       java代码;
                   }
          静态代码块执行在主方法前,也就是说在类加载的时候静态代码块已经开始执行了.
         */
        System.out.println("类加载");
    }
}
