/**
 * @author: LiZhiHao
 * @Date: 2022-04-05 22:19:53
 * @LastEditTime: 2022-04-05 22:59:35
 */
package pers.luochen.statictest;

public class Chinese {
    /**
     * 学生类
     */
    int idCar;
    String name;
    static String country = "中国";
    
    /**
     * 无参数构造方法
     */
    public Chinese(){

    }
    /**
     * 有参数构造方法
     */
    public Chinese(int idCar,String name){
        this.idCar = idCar;
        this.name = name;

    }
    public void doSome(){
        System.out.println("你的学号: " + this.idCar);
        System.out.println("你的姓名: " + this.name);
        System.out.println("你的国籍: " + Chinese.country);
    }
}
