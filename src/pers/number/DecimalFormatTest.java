package pers.number;

import java.text.DecimalFormat;

/**
 * @Author LiZiHao
 * @Date 2022/6/13/15:30
 */
public class DecimalFormatTest {
    /*
        数字格式化
        对一组数字进行规定的格式来格式化
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####,####");
        /*
            数字格式化基本符号:#,.0
                #表示任意数字
                ,千分位
                .小数位
                0不够补零

                .讲究四舍五入
        * */
        String s2 = df.format(20041105);
        System.out.println(s2);


        DecimalFormat df1 = new DecimalFormat("#,###.00");
        String s1 = df1.format(1314.2);
        System.out.println(s1);

        DecimalFormat df3 = new DecimalFormat("####.###");
        String s3 = df3.format(1314.5200666);
        //1314.52元数据1314.5200666
        System.out.println(s3);


    }
}
