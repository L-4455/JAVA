/**
 * @author: LiZhiHao
 * @Date: 2022-04-06 00:09:31
 * @LastEditTime: 2022-04-06 21:17:22
 */
package pers.luochen.iftest;
/**
 * @author LiZhiHao
 * @date 2022/2/23 17:15
 */
public class IfTest01 {

    public static void main(String[] args) {
        int number0 = 0 , number90 = 90, number80 = 80,number70 = 70, number60 = 60,number100 = 100;
        double score = 111;
        if (score > number0 && score < number100) {
            if (score >= number90) {
                System.out.println("A");
            } else if (score >= number80) {
                System.out.println("B");
            } else if (score >= number70) {
                System.out.println("C");
            } else if (score >= number60) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        } else {
            System.out.println("成绩范围不正确.");
        }
    }
}
