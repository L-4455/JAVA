/**
 * @author: LiZhiHao
 * @Date: 2022-02-26 20:04:37
 * @LastEditTime: 2022-04-06 18:22:19
 */
package pers.luochen.continuetest;

/**
 * @author LiZhiHao
 * @date 2022/2/26 20:04
 */
public class ContinueTest01 {
    public static void main(String [] args){
        /*
        *
        * continue在java中意思为 继续/下一个
        * break;为跳出循环
        * continue为终止本循环，继续执行下一个循环。也就是说终止本循环，直接执行更新表达式，再去执行布尔表达式判断是true或false。
        * */
        int number =1 ,number1 =10;
        for(int i = number;i <= number1;i++){
            if(i == 5){
                //跳出5的循环，继续执行下一个循环，即直接去执行更新表达式i++;
                continue;
            }
            System.out.println("i----->" + i);
        }
    }
}
