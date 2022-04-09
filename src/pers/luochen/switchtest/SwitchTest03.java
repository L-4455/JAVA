package pers.luochen.switchtest;

/**
 * @author: LiZhiHao
 * @Date: 2022-02-24 19:48:50
 * @LastEditTime: 2022-04-09 23:38:04
 */

public class SwitchTest03 {
    public static void main(String[] args) {
        double score = 89;
        int grade = (int) score / 10;
        String e = "A";
        switch (grade) {
            case 9:
            case 10:
                break;
            case 8:
                e = "B";
                break;
            case 7:
                e = "C";
                break;
            case 6:
                e = "D";
                break;
            default:
                e = "E";
        }
        System.out.println(e);

    }
}
