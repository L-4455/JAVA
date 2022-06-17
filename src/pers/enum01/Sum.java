package pers.enum01;

/*
    枚举类型
    枚举在程序编译后也会生成class文件.
    枚举属于引用数据类型,枚举中的数据是常量
 */
enum retValue {
    STRING, FALL;
}

/**
 * @Author LiZiHao
 * @Date 2022/6/16/23:39
 */
public class Sum {
    public static void main(String[] args) {

        retValue sum = sum(10, 0);
        System.out.println(sum == retValue.STRING ? "计算成功" : "计算失败");


    }
    /*
    /**
     * 程序设计,计算成功返回0,计算失败返回-1;
     * @param a 被除数
     * @param b 除数
     * @return 0表示计算成功,-1表示计算失败.
     */
    /*
   该方法设计不够完美
    public static int sum(int a ,int b){
//        返回值类型设计的不完美,对于只有两种结果的方法,建议使用boolean类型.
        try{
            int c = a / b;
            return 0;
        }catch(Exception e){
            return -1;
        }
    }
    */

    /**
     * 计算两个数的商,计算成功返回true计算失败返回false
     *
     * @param a 被除数
     * @param b 除数
     * @return true表示计算成功, false表示计算失败.
     */
    /*
        当程序只有两种返回结果时使用boolean更合适,但是当结果多了是用什么合适呢?
        java中使用了枚举数据类型.
        枚举适用于结果可以一枚一枚列举出来的程序

     */
    /*
    使用枚举类型
    public static boolean sum(int a , int b ){
        try{
            int c = a / b;
            return true;
        }catch(Exception e){
            return false;
        }
    }*/
//     当时用枚举时,方法的返回值就不是boolean类型了,而是枚举类型

    /**
     * 计算两个数的商
     *
     * @param a int类型数字
     * @param b int类型数字
     * @return retValue.STRING表示计算成功, retValue.FALL表示计算失败.
     */
    public static retValue sum(int a, int b) {
        try {
            int c = a / b;
            return retValue.STRING;
        } catch (Exception e) {
            return retValue.FALL;
        }
    }
}
