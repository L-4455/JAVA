/**
 * @author: LiZhiHao
 * @Date: 2022-02-24 18:39:46
 * @LastEditTime: 2022-04-06 17:50:03
 */
package pers.luochen.switchtest;

/**
 * @author LiZhiHao
 * @date 2022/2/24 18:39
 */
public class SwitchTest01 {
    public static void main(String[] args) {
        /*
         * switch语法：
         *       switch(int或String类型变量){
         *               case :"匹配值"
         *                   java语句;
         *                   break;
         *               case :"匹配值"
         *                   java语句;
         *                   break;
         *              case :"匹配值"
         *                   java语句;
         *                   break;
         *              case :"匹配值"
         *                   java语句;
         *                   break;
         *              case :"匹配值"
         *                   java语句;
         *                   break;
         *                 default :
         *                      java语句;
         *           }
         *   当switch括号后的表达式为int类型或String类型时会去
         *   匹配case的匹配值当case后的值与括号后表达式相同时
         *   会执行csae下的java语句。
         *   括号里的类型可以是 byte shot char 因为会自动转换为int类型的值。
         *   case后的语句需要break;结尾，否则会照成case穿透，就是说不在匹配下一个case的值，而会直接执行下一个case的java语句。
         *   如果所有case都不匹配则会执行default下的java语句。
         *
         *   在一个switch块内，每个case要么通过break/return等来终止，要么注释说明程序将继续执行到哪一个case为止；
         *   在一个switch块内，都必须包含一个default语句并且放在最后，即使它什么代码也没有。
         *
         * */
        int i = 5;
        switch (i) {
            case 5:
                System.out.println("operator");
                break;
            case 8:
                System.out.println("name");
                break;
            default:
                System.out.println("account");
        }
        char t = 'A';
        switch(t){
            //char类型或自动转换为int类型,shot,byte类型也是。
            case 'A' :
                System.out.println("userName");
                break;
            case 'B':
                System.out.println("userAccount");
                break;
            default:
                System.out.println("userPassword");
        }

        //case穿透
        int week = 2;
        switch(week){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("你输入的有误");
        }
        //case合并
        /*
        * 当case合并时，只要有一个值可以与表达式的值匹配成功就可以执行下面的java语句。
        * */
        int w = 6;

        switch(w){
            case 5: case 6: case 7:
                System.out.println("今天是黑色星期五");
                return;
                default;
        }
        
        
    }
}
