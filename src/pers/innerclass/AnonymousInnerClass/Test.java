package pers.innerclass.AnonymousInnerClass;

import pers.innerclass.AnonymousInnerClass.Mysum;

/**
 * @Author LiZiHao
 * @Date 2022/5/15/22:38
 */
public class Test {
    /*
        匿名类在开发中使用的不多,但我们要回,能看懂.
     */
    public static void main(String[] args) {
        Mysum mysum = new Mysum();
//        pers.innerclass.Compute是抽象的; 无法实例化
//        mysum.mysum(new Compute(),200,300);

//        mysum.mysum(new ComputeImp(),200,300);

//        使用匿名内部类
        mysum.mysum(new Compute() {
            public int sum(int x, int y) {
                return x + y;
            }
        }, 23232, 300);
        {

        }
    }
}
