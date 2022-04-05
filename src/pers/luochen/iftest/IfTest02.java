package pers.luochen.iftest;

/**
 * @author LiZhiHao
 * @date 2022/2/24 14:25
 */
public class IfTest02 {
    public static void main(String[] args) {
        try (//创建键盘扫描器
        java.util.Scanner w = new java.util.Scanner(System.in)) {
            //接受用户输入
            System.out.print("请输入年龄:");
            int age = w.nextInt();

            String xenix = "你生命周期处于老年阶段";

            if (age < 0 || age > 150) {
                xenix = "您输入的年龄不合法，年龄范围在[0-150]之间";
            } else if (age <= 5) {
                xenix = "你生命周期处于幼儿阶段";
            } else if (age <= 10) {
                xenix = "你生命周期处于少儿阶段";
            } else if (age <= 18) {
                xenix = "你生命周期处于少年阶段";
            } else if (age <= 35) {
                xenix = "你生命周期处于青少年阶段";
            } else if (age <= 55) {
                xenix = "你生命周期处于中年阶段";
            }
            System.out.println(xenix);
        }

    }
}
