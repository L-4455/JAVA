package pers.luochen.switchtest;

/**
 * @author: LiZhiHao
 * @Date: 2022-02-24 19:10:29
 * @LastEditTime: 2022-03-29 20:24:42
 */
public class SwitchTest02 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("请输入第一个数:");
            int number1 = scanner.nextInt();

            System.out.print("请输入运算符:");
            String operator = scanner.next();

            System.out.print("请输入第二个数:");
            int number2 = scanner.nextInt();

            int str = 0;
            switch (operator) {
                case "+":
                    str = number1 + number2;
                    break;
                case "-":
                    str = number1 - number2;
                    break;
                case "*":
                    str = number1 * number2;
                    break;
                case "/":
                    str = number1 / number2;
                    break;
                case "%":
                    str = number1 % number2;
                    break;
                default:
            }
            System.out.println(number1 + operator + number2 + " = " + str);
        }
    }
}
