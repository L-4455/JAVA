package pers.luochen.iftest;
/**
 * @author LiZhiHao
 * @date 2022/2/23 17:15
 */
public class IfTest01 {

    public static void main(String[] args) {
        double score = 111;
        if (score > 0 && score < 100) {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        } else {
            System.out.println("成绩范围不正确.");
        }
    }
}
