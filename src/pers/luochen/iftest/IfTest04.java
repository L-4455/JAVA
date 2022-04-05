/**
 * @author: LiZhiHao
 * @Date: 2022-02-24 15:49:51
 * @LastEditTime: 2022-03-27 22:49:11
 */
package pers.luochen.iftest;

/**
 * @author LiZhiHao
 * @date 2022/2/24 15:49
 */
public class IfTest04 {
    public static void main(String [] args){
        boolean sex = true;
        if(sex){}
            System.out.println("男的");
            System.out.println("哈哈哈");
            //正确写法：
        System.out.println("哈哈哈");
        //else
        System.out.println("卧槽");
        /*
        *
        * 以上编译错误，错误出现在第13行。13行以上没有问题
        * 错误提示为 else没有if。
        * 当if分支语句有两条时且没有大括号时默认把第一条作为分支语句，第二条为普通语句。
        * */
    }
}
