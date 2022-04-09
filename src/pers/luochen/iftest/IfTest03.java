package pers.luochen.iftest;

import pers.luochen.printf.Au;

import java.util.Objects;

/**
 * @author: LiZhiHao
 * @Date: 2022-02-24 14:48:27
 * @LastEditTime: 2022-03-29 20:23:13
 */
public class IfTest03 {
    public static void main(String[] args) {
        try (//创建键盘扫描仪，等待键盘输入数据。
             java.util.Scanner w = new java.util.Scanner(System.in)) {
            //向控制台打印输出--请输入天气状况：
            System.out.print("请输入天气状况：");
            //创建String类型的变量取名为weather，赋值为w的输入数据。也就是说把w的输入数据赋值给了变量weather。 
            // w 只是一个标识符，可以按照标识符规则随意命名。
            String weather = w.next();
            if (!Objects.equals(weather, "下雨") && !Objects.equals(weather, "晴天")) {
                System.out.println("天气输出错误");
            } else {
                try (//创建键盘扫描仪，等待键盘输入数据。
                     java.util.Scanner q = new java.util.Scanner(System.in)) {
                    //向控制台打印输出--请输入性别
                    System.out.print("请输入性别：");
                    //创建String类型的变量取名为sex，赋值为q的输入数据。也就是说把q输入的数据赋值给了变量sex。
                    //q 只是一个标识符，可以按照标识符规则随意命名。
                    String sex = q.next();


                    // 条件判断语句if..else和if..else if
                    // 语法：
                    /**
                     * if(布尔表达式){
                     *      Java语句;
                     * }else if(布尔表达式){
                     *      Java语句;
                     * }else{
                     *      Java语句;
                     * }
                     *
                     */
                    //Objects.equals为Java工具类中的 "字符串"比较功能，就是为了比较两个"字符串"中的值是否一致。
                    //程序开始：用户输入当前天气：如果为"下雨",当用户输入完回车后,此时"下雨"这个值已经保存到了变量w中，w中的值再赋值给变量weather.
                    //开始判断 sex的值，用户输入再次输入数据，此时输入的时来判断性别，输入为 "男" 或则是"女"时，此时已经保存到了变量q中，q中的值在赋值给sex.
                    //判断：当weather中的值为"下雨"时，执行 46行到52行中的代码。
                    if (Objects.equals(weather, "下雨")) {
                        //当程序执行到这里时，说明weather中的值为"下雨".再次判断 sex 中的值是否为"男"，
                        if (Objects.equals(sex, "男")) {
                            //sex的值如果为"男"则执行 第 50 行代码，也就输出"你要带一把大黑伞"
                            Au.q("你要带一把大黑伞");
                            // 如果为 女
                        } else if (Objects.equals(sex, "女")) {
                            //sex的值如果为"女"则执行 第 54 行代码，也就输出"你要带一把小花伞"
                            Au.q("你要带一把小花伞");
                        } else {
                            //如果sex中的值既不是女也不是男 ，则执行第57行代码。
                            Au.q("你输错了性别吧？");
                        }
                        //如果输入的天气为 晴天 则执行这一段代码.
                    } else if (Objects.equals(weather, "晴天")) {
                        try (//因为温度需要输出数据，所以在此创建键盘扫描仪，等待用户输入。
                             java.util.Scanner b = new java.util.Scanner(System.in)) {
                            System.out.print("请输入天气温度：");
                            //把输入的值保存到变量temperature中.
                            double temperature = b.nextDouble();
                            //判断:temperature的值是否大于30
                            if (temperature >= 30) {
                                //判断sex的值，如果为男
                                if (Objects.equals(sex, "男")) {
                                    //则执行第71行代码
                                    Au.q("你要带墨镜");
                                } else if (Objects.equals(sex, "女")) {
                                    //如果为女 这执行第74行代码
                                    Au.q("你要搽防晒霜");
                                } else {
                                    //如果既不是男又不是女，则执行第77行代码.
                                    Au.q("你还是人么？");
                                }
                            } else if (temperature < 30) {
                                if (Objects.equals(sex, "男")) {
                                    Au.q("你要穿短袖");
                                } else if (Objects.equals(sex, "女")) {
                                    Au.q("你要穿黑丝");
                                } else {
                                    Au.q("你还是人么？");
                                }
                            }
                            //如果天气输入的既不是晴天也不是下雨，这执行第82行代码
                        }
                    }
                }
            }
        }
    }
}
