/**
 * @author: LiZhiHao
 * @Date: 2022-04-04 22:01:02
 * @LastEditTime: 2022-04-04 22:34:07
 */
package pers.luochen.constructortest;

public class Test0102 {
    public static void main(String [] args){
        /**
         * 
         * 输出9*9表
         *  
         * 
         * 1*1     
         * 1*2  2*2  
         * 1*3  2*3  3*2    4*2
         * 1*4  2*4  3*3    4*3
         * 1*5  2*5  3*4    4*4
         * 1*6  2*6  3*5    4*5
         * 1*7  2*7  3*6    4*6
         * 1*8  2*8  3*7    4*7
         * 1*9  2*9  3*8    4*8
         *           3*9    4*9
         */
        for(int i = 1; i <= 9; i++){
            for(int j =1; j <= i;j++){
                System.out.print(j+"x"+i+"="+i*j+"\t");
                //System.out.print(j+"×"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
