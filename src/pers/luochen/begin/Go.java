package pers.luochen.begin;
/* public class pers.luochen.begin.Go {
 public static void main(String[] args) {
    System.out.println("\"HelloWord\"");
     System.out.println("\u4e2d");
     char x = '\u0000';
             System.out.println(x);
     long Q = 100L;
     int q = (int)Q;
             System.out.println(q);
     char X = (char)q;
             System.out.println(X);
     byte w = 50;
     char S = 10;
     long L = 200;
     System.out.println(S);
     long E = 2147483648L;
     int  O = (int)E;

         int w = 10/3;
                 System.out.println(w);
         boolean AccountPassword;
     if (false | true) AccountPassword = true;
     else AccountPassword = false;
     if(AccountPassword){
                 System.out.println("傻逼，终于进来了？");
         }else{
                 System.out.println("还没进来，看来是真傻逼！");

         }
         int  q = 100;
         System.out.println(++q);//101
         System.out.println(--q);//100
         System.out.println(--q);//99
         System.out.println(--q);//98
         System.out.println(--q);//97
         System.out.println(--q);//96
         int x = 10;
         System.out.println(--x);//9
         System.out.println(--x);//8
         System.out.println(--x);//7
         System.out.println(--x);//6
         System.out.println(--x);//5


     int a =10;
     int b =12;
          System.out.println(a>b);
          System.out.println(a<b);
          System.out.println(a>=b);
          System.out.println(a<=b);
          System.out.println(a==b);
          System.out.println(a!=b);


          System.out.println(5 > 3 & 5 >2);
          System.out.println(5 > 3 | 5 >6);
          System.out.println(5 > 3 ^ 5 >7);
          System.out.println(5 > 3 ^ 5 >2);
          System.out.println(5 > 3 & 5 >2);
          System.out.println(!true);


       int a = 10;
       int b = 12;
       System.out.println(a < b | ++a < b);
       System.out.println(a);
       //System.out.println(a > b && ++a > b);
       //System.out.println(a);


     System.out.println("我是你爸爸");
     System.out.println("HelloWord");
     System.out.println("Hello  Word");
     int w = 100;
     int q = 200;
         System.out.println(w + "+" + q + "=" + (w + q));
         w = 200;
         q = 300;
         System.out.println(w + "+" + q + "=" + (w + q));
     String name = "lizihao";
         System.out.println("登录成功，欢迎"+name+"回家");
             name = "我曹 人才啊";
         System.out.println("登录成功，欢迎"+name+"回家");


     boolean w = false;

         String q = w ? "nande":"nvde";
             System.out.println(q);
             w = true;
             q = w ?"nande":"nvde";
             System.out.println(q);


     double score = 100;
     double li = score = 100 ;
     if (li >= 90) {
         System.out.println("pers.luochen.A.A");
     }else if(li >= 80){
         System.out.println("B");
     }else if(li >= 70){
         System.out.println("C");
     }else if(li >= 60){
         System.out.println("D");
     }else{
         System.out.println("E");
     }


     int w = 12;
     if(w >= 15){
         System.out.println("你个个傻逼");
     }else{
         System.out.println("我叫大聪明");
     }
     if(w <= 10){
         System.out.println("卧槽");
     }else{
         int a = 15;
         int b = 20;
         System.out.println(a + "+" + b + "=" + (a + b));
             a = -1;
             b = 21;
     if( a > 0 ){
         System.out.println("噼噼啪啪");
     }else if (a < 0){
         System.out.println("三生三世十里桃花");
     }if( b > 20){
         System.out.println("吾问无为谓");
     }else{
             System.out.println("惺惺相惜");
         }
     }


             System.out.print("请输入您的年龄：");
     java.util.Scanner s = new java.util.Scanner(System.in);
         int userInputInformation = s.nextInt();
             System.out.println("您的年龄：" + userInputInformation);
         int Age = userInputInformation;
         String age = "你现在的年龄阶段为：老年";
     if(Age >= 150 || Age <= 0){
         age = "对不起，您输入的年龄有误";
     }else if(Age <= 5){
         age = "你现在的年龄阶段为：幼儿";
     }else if(Age <= 10){
         age = "你现在的年龄阶段为：少儿";
     }else if(Age <= 18){
         age = "你现在的年龄阶段为：青少年";
     }else if(Age <= 35){
         age = "你现在的年龄阶段为：青年";
     }else if(Age <= 55){
         age = "你现在的年龄阶段为：中年";
     }
         System.out.println(age);


     System.out.print("输入你的成绩：");
     java.util.Scanner s = new java.util.Scanner(System.in);
     int score = s.nextInt();
     if (score <= 0 || score > 100) {
         System.out.println("对不起，你输得成绩有误");
     }
     if (score == 100) {
         System.out.println("恭喜你获得一辆BMN");
     } else if (score > 80) {
         System.out.println("恭喜你获得一台K40");
     } else if (score >= 60) {
         System.out.println("恭喜你获得一台小米6");
     } else {
         System.out.println("暴打一顿吧！");
     }


     System.out.println("说明1:1表示下雨，2表示晴天");
     System.out.println("说明2:1表示男，2表示女");
     System.out.println("说明3:温度请直接输入");
     java.util.Scanner s =new java.util.Scanner(System.in);
     System.out.print("请输入天气状况：");
     int tianqi =s.nextInt();
     if(tianqi == 1){
         System.out.println("下雨");
     }else if(tianqi == 2){
         System.out.println("晴天");
     }else {
         System.out.println("傻逼，你输入的天气状况有误(看说明)");
     }
     System.out.print("请输入你的性别");
     int xingbie =s.nextInt();
     if(xingbie ==1){
         System.out.println("男");
         if(tianqi == 1)
             System.out.println("你需要带一把黑伞");
     }else if(xingbie == 2){
         System.out.println("女");
         if(tianqi == 1)
             System.out.println("你需要带一把粉伞");
     }else{
         System.out.println("傻逼，你输入的性别有误(看说明)");
     }
     if(tianqi == 2){
         System.out.print("请输入温度：");
         int wendu = s.nextInt();
         if(wendu >=30){
             if(xingbie ==1){
                 System.out.println("你需要带墨镜");
             }else if(xingbie == 2){
                 System.out.println("你需要擦防晒霜");
             }
         }
     }
     int w = 12;
     if (w != 12) {
         System.out.println("傻逼");
     } else{
         System.out.println("sb");
     }
     int w = 11;
         switch(w){
             case 1: case 2: case 3: case 12:
                 System.out.println("sb");
     }
 }
}


public class pers.luochen.begin.Go{
 public static void main(String[] args){
 System.out.print("请输入您的成绩:");
     java.util.Scanner s = new  java.util.Scanner(System.in);
 int score =s.nextInt();
     if(score < 0 || score > 100){
     System.out.println("您输入的成绩有误");
     } else{
         switch(score){
             case 100 :
             case 90:
                 System.out.println("pers.luochen.A.A");
                 break;
             case 89:
             case 70:
                 System.out.println("B");
                 break;
             case 60:
                 System.out.println("C");
                 break;
             default:
                 System.out.println("D");
         }
     }
 }
}

从键盘输入一个月份，打印该月份所属的季节
3,4,5为春季 6,7,8为夏季
9,10,11为秋季 12,1,2为冬季
用switch-case完成需求
public class pers.luochen.begin.Go{
 public static void main(String[]args){
 System.out.print("请输入当前月份：");
 java.util.Scanner s= new java.util.Scanner(System.in);
 int month = s.nextInt();
 if(month < 0 || month>12){
     System.out.println("你输入的月份有误");
 }else{
     switch(month){
         case 5:
         case 4:
         case 3:
             System.out.println("当前为春季");
             break;
         case 8:
         case 7:
         case 6:
             System.out.println("当前为夏季");
             break;
         case 11:
         case 10:
         case 9:
             System.out.println("当前为秋季");
             break;
         default:
             System.out.println("当前为冬季");

     }
     }
 }
}


public class pers.luochen.begin.Go{
 public static void main(String[]args) {
     java.util.Scanner s = new java.util.Scanner(System.in);
     System.out.print("请输入第一个数据：");
     int shuzi = s.nextInt();
     System.out.print("请输入运算符：");
     String fuhao = s.next();
     System.out.print("请输入第二个数据：");
     int suzi = s.nextInt();
     int calculationResults = 0;
     switch(fuhao){
         case"+":
             calculationResults = shuzi + suzi;
         break;
         case"-":
             calculationResults = shuzi - suzi;
         break;
         case"*":
             calculationResults = shuzi * suzi;
         break;
         case"/":
             calculationResults = shuzi / suzi;
         break;
         case"%":
             calculationResults = shuzi % suzi;

     }
     System.out.println(shuzi + fuhao + suzi + "=" +  calculationResults);
 }
}


public class pers.luochen.begin.Go{
 public static void main(String[]arga){
     System.out.println("欢迎使用本程序！");
     java.util.Scanner s = new java.util.Scanner(System.in);
     System.out.print("请输入你的成绩：");
     double score = s.nextInt();
     if(score < 0 || score>100){
         System.out.println("你输得成绩有误");
     }else{
     switch((int)score/10) {
         case 9:
             System.out.println("pers.luochen.A.A");
             break;
         case 8:
             System.out.println("B");
             break;
         case 7:
             System.out.println("C");
             break;
         case 6:
             System.out.println("D");
             break;
         default:
             System.out.println("E");
     }
     }
 }
}

public class pers.luochen.begin.Go{
 public static void main(String [] args){
     for(int w = 1;w <100; w+= 2){
         System.out.println(w);
     } System.out.println("---------------------------------------");
     for(int i = 1; i<=100;i++){
         if(i % 2 != 0){
             System.out.println(i);
         }
     }
 }
}

public class pers.luochen.begin.Go{
 public static void main(String [] args){
     int sum = 0;
     for(int w = 1; w <= 100;w++){
         if(w % 2 != 0){
             sum += w;
         }
     }
     System.out.println(sum);
 }
}

输入1-100的质素
质素：能够被1或本身整除

public class pers.luochen.begin.Go{
    public static void main(String [] args){
        int a = 0;
        for( int w = 2 ; w <= 100;w++){    //2 3 4 5 6 7 8 9
            boolean oo =true;
            for(int q = 2;q < w;q++){   2  3
                if(w % q ==0){ //
                    oo = false;
                    break;
                }
            }
            if(oo){
                System.out.print(w + " ");
                a++;
                if(a  == 8){
                    System.out.println("");
                    a = 0;
                }
            }
        }
    }
}

 /*
public class pers.luochen.begin.Go{
    public static void main(String [] args){
        System.out.print("请输入商品价格:");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int w = s.nextInt();
        //int price = 0;
        if(w > 1000){
            System.out.println("八折");
        }else if(w > 500){
            System.out.println("九折");
        }else if(w < 500){
            System.out.println("无优惠");
        }

    }
}


public class pers.luochen.begin.Go{
    public static void main(String [] args){
        //java.util.Scanner s = new java.util.Scanner(System.in);
        //System.out.print("请输入数据：");
        int q = 0;
        int w = 0;
        System.out.println(q + "+" + w + "=" + (q+w));

    }
}


public class pers.luochen.begin.Go{
    public static void main(String [] args){
        sum(100,300);
        //pers.luochen.begin.Go.sum(230,298);
        //pers.luochen.begin.Go.sum(3123,13213);
        B.Woow();
    }
    public static void sum(int a,int b){
        System.out.println(a + "+" + b + "=" + (a + b));
    }
}


public class pers.luochen.begin.Go {
    public static void main(String[] args) {
        System.out.println(m(10,20));
}
    public static int m(int a , int b) {
        System.out.println(a+b);
        return 0 ;
    }
}


public class pers.luochen.begin.Go {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入数据:");
        int a,b;
        size( a = s.nextInt(), b = s.nextInt());
    }
    public static void size(int a, int b) {
        if (a < b) {
            System.out.println(a + "<" + b);
        }if(a > b){
            System.out.println(a + ">" + b);
        }else if(a == b){
            System.out.println(a + "=" + b);
        }
    }
}


public class pers.luochen.begin.Go{
    public static void main(String [] args){
        int i = 10;
        wocao(i);
        System.out.println("main-->" + i);
    }
    public static void wocao(int i){
        i++;
        System.out.println("wocao-->" + i);

    }
}

 */
/*
需求：定义一个方法，
    当A等于10时
    方法返回:卧槽
    当A等于20时
    方法返回:我草
/*

public class pers.luochen.begin.Go{
    public static void main(String [] args){
        //java.util.Scanner s = new java.util.Scanner(System.in);
        //System.out.print("请输入数据：");
        //int n = s.nextInt();
     pers.luochen.A.A.Q(dog("卧槽","我草"));
    }
    public static String dog(String a,String b) {
        String n = "10";
        if (n == "2323") {
            return a;
        }else{
            return b;
        }
    }
}
 /*
public class pers.luochen.begin.Go{
    public static void main(String [] args){
        pers.luochen.A.A.Q("Hello World!");
        pers.luochen.A.A.Q(10101010);
        pers.luochen.A.A.Q(1*2);
        pers.luochen.A.A.Q(8989-22);
    }
}

public class pers.luochen.begin.Go{
    public static void main(String [] args){

        pers.luochen.A.A.Q("main开始");
        dosome();
        pers.luochen.A.A.Q("main结束");
    }
    public static void dosome(){
        pers.luochen.A.A.Q("dosome开始");
        dosome();
        pers.luochen.A.A.Q("dosome结束");
    }
}

 */

/*
计算 1~N的和

public class pers.luochen.begin.Go{
    public static void main(String [] args){
        int N = 4; //定义变量N，赋值为4
        int sum = 0; //定义变量 sum 赋值为0
        for(int q = 1 ; q <= N; q++){ //循环：定义变量q 赋值为 1  q<=N (1<=4) q自加1  q：1 2 3 4
            sum += +q; //求和 sum = sum + q  (0 + 1 + 2 + 3 + 4)
        }
        pers.luochen.A.A.Q("sum--->" + sum);
    }
}


public class pers.luochen.begin.Go{
    public static void main(String [] args){
        java.util.Scanner s =new java.util.Scanner(System.in);
        System.out.print("请输入成绩：");
        int n = s.nextInt();
        if(n >= 90){
            pers.luochen.A.A.Q("优");
        }else if (n >= 80){
            pers.luochen.A.A.Q("良");
        }else if(n >= 70){
            pers.luochen.A.A.Q("中");
        }else if(n >= 60){
            pers.luochen.A.A.Q("及格");
        }else{
            pers.luochen.A.A.Q("不及格");
        }
    }
}


public class pers.luochen.begin.Go {
    public static void main(String[] args) {
        int n = 222;//定义变量 n 赋值为22
        int result = sum(n);//定义变量 result 赋值为 sum方法
            pers.luochen.A.A.Q(result);//输出结果 ：i累加
    }
    public static int sum(int n) { // sum 方法
        int result = 0; //定义变量 result 赋值为 0
        for (int i = 1; i <= n; i++) {  //for 循环 定义变量 i 赋值为1  i <= n (1 <= n) i累加 1累加
            result += i; // i结果
        }
        return result; //返回 result的值
    }
}

 */


/*
使用递归 计算1~4的和


public class pers.luochen.begin.Go{
    public static void main(String [] args ){
        int n = 4;
        int result = sum(n);
        pers.luochen.A.A.Q(result);
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return  n + sum(n-1);
    }
}

 */

/*
5的阶乘 5*4*3*2*1
 */
/*
public class pers.luochen.begin.Go{
    public static void main(String [] args){
        int w = 5; //定义变量w赋值为5
        int result = method(w); // w赋值传给 method方法
            pers.luochen.A.A.Q(result);//接受 method的返回值
    }
    public static int method(int w){ // q赋值为5
        int outcome = 1;//定义变量outcome 赋值为1；
        for(int q = w; q>0 ; q--){ //循环 ：定义变量q q赋值为w赋值 q大于0 q累减
            outcome *= q;//结果 为 outcome * q  1 * 5 * 4 *3 *2 * 1
        }
        return outcome;//返回outcome值给method
    }
}

 */
/*
使用递归计算5的阶乘
5*4*3*2*1
5*(w-1)
5*4*(w-1)
5*4*3*(w-1)
5*4*3*2*(w-1)
5*4*3*2*1

public class pers.luochen.begin.Go{
    public static void main(String [] args){
        int w = 5; //定义变量w赋值为5
        int result = method(w); // w赋值传给 method方法
        pers.luochen.A.A.Q(result);//接受 method的返回值
    }
    public static int method(int w) { // q赋值为5
        if (w == 1){
            return 1;
        }
        return w * method(w-1);
    }
}

 */
/*
闰年判定方法：能被4整除且不能被100整除的为闰年，否则为平年
 */
/*
public class pers.luochen.begin.Go{
    public static void main(String [] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入年份：");
        int nian = s.nextInt();
        int result = year(nian);

    }
    public static int year(int nian){
         String Return = "" ;
        if(nian/4==0 && nian/100 != 0){
            pers.luochen.A.A.Q("闰年");
        }else{
            pers.luochen.A.A.Q("平年");
        }
        return 1 ;
    }
}

 */















