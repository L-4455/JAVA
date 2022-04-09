package pers.luochen.codegym;

/**
 * @author: LiZhiHao
 * @Date: 2021-08-08 23:15:20
 * @LastEditTime: 2022-04-06 21:03:58
 */
public class CodeGymTest {
    public static void main(String[] args) {

        int i = 7;
        System.out.println(i);
    }
}
//      Scanner s = new Scanner(System.in);
//        int hour1 = s.nextInt();
//        int minute1 = s.nextInt();
//        int hour2 = s.nextInt();
//        int minute2 = s.nextInt();
//
//        int t1 = hour1 * 60 + minute1;
//        int t2 = hour2 * 60 + minute2;
//
//        int t = Math.abs(t2 - t1);
//
//        System.out.println("时间差是" + t/60 +"小时" + t%60 + "分");
//
//
//    }
//}
        /*System.out.println("输入-1结束输入");
        Scanner s = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while (true) {
            int a = s.nextInt();

            if (a == -1) {
                System.out.println(sum / count);
                return;
            }
            count++;
            sum =sum + a;
        }
    }
}*/
        /*Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a > b && a < c) {
            System.out.print(String.valueOf(a));
        }else if(a < b && a > c){
            System.out.println(a);
        } else if(c > a && c < b){
            System.out.println(c);
        }else if(c > b && c < a){
            System.out.println(c);
        } else if(b > c && b < a){
            System.out.println(b);
        }else if(b >a && b < c){
            System.out.print(String.valueOf(b));
        }if (a == b && b == c) {
            System.out.println(b);
        }else if(a == b){
            System.out.println(b);
        }else if(b == c){
            System.out.print(String.valueOf(c));
        }else if(a == c){
            System.out.println(a);
        }
    }
}*/
        /*int q = 100;
        for(int i = 1;i <= q;i++){
            System.out.println("我永远不会为了一点微薄的薪水而工作。阿米戈");
        }
    }


}
   /* String maim;
        public boolean equals(CodeGymTest codeGymTest){
            return this.maim == codeGymTest.maim;
        }

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(12312));

        CodeGymTest codeGymTest = new CodeGymTest();
        codeGymTest.maim = "1234";

        CodeGymTest codeGymTest1 = new CodeGymTest();
        codeGymTest1.maim = "1234";

        System.out.println(codeGymTest.equals(codeGymTest1));
        System.out.println("----------------------------------------------");

        System.out.println("Hello Word");
        System.out.println("愿你：只争朝夕，不负韶华。");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int q = 2;
        if (i % q == 0 && i > 0) {
            System.out.println("正偶数");
        } else if(i % q == 0 && i < 0){
            System.out.println("负偶数");
        }
        if(i % q != 0 && i > 0){
            System.out.println("正奇数");
        }else if(i % q != 0){
            System.out.println("负奇数");
        }
        else if(i == 0){
            System.out.println("以上都不符合.");
        }
    }

    String mood;
}*/
