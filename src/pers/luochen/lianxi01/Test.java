/**
 * @author: LiZiHao
 * @Date: 2022-04-13 14:35:56
 * @LastEditTime: 2022-04-13 14:59:09
 */
package pers.luochen.lianxi01;

public class Test {
    public static void main(String[] args) {
        int retValue = 0;
        for (int num = 2; num <= 100; num++) {
            boolean wode = true;
            for (int number = 2; number < num; number++) {
                if (num % number == 0) {
                    wode = false;
                    retValue += num;
                    break;
                }
            }
            if(wode){
                System.out.println(num);
            }
        }
        System.out.println(retValue);
    }
}