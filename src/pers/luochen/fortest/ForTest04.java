package pers.luochen.fortest;

/**
 * @author LiZhiHao
 * @date 2022/2/26 14:36
 */
public class ForTest04 {
    public static void main(String[] args) {
        /*
         *
         * 使用for循环输出1-100的所有素数
         * 素数：只能被1和自身整除，不能被其他数整除的数叫做素数或质素。
         *
         * */

        for (int num = 2; num <= 100; num++) {
            boolean judge = true;
            for (int num1 = 2; num1 < num; num1++) {
                if (num % num1 == 0) {
                    judge = false;
                    break;
                }
            }
            if (judge) {
                System.out.println(num);
            }
        }
        System.out.println("--------------------------------------------");

        int row = 0;
        for (int num = 2; num <= 10000; num++) {
            //想要输出1-?的素数，只需要改一下num的值即可。比如说：10000
            //遍历2到100
            boolean judge = true;
            for (int num1 = 2; num1 < num; num1++) {
                //使nim1永远小于num
                if (num % num1 == 0) {
                    /*遍历num对num1取余数，因为num1<num，所以num对num1取余数时只会取到num-1时候
                    也就是说对num1的取余数不会超过num的值，使程序效率高
                    比如7：
                        7 % 2 != 0
                        7 % 3 != 0
                        7 % 4 != 0
                        7 % 5 != 0
                        7 % 6 != 0,
                        不会执行到7 % 7取余数，因为num1 < num
                        只要在num的范围之内取余数都不等于0那么这个数就是素数。
                        不用再去对大于num的数取余数。
                    */
                    judge = false;
                    break;
                }
            }
            if (judge) {
                System.out.print(num + " ");
                row++;
                //当输出一个数字的时候后，就证明这个数是素数了，所以直接让row加一。
                if (row == 8) {
                    //直到row等于8时，才会执行下一个语句，就是换行。也就是说当一行为八个数字时，就换一行输出。
                    System.out.println("");
                    row = 0;
                }
            }
        }
    }
}

