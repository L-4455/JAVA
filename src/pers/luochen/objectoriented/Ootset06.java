/**
 * @author: LiZhiHao
 * @Date: 2022-03-27 14:24:31
 * @LastEditTime: 2022-03-27 22:34:13
 */


package pers.luochen.objectoriented;

public class Ootset06 {
    /**
     * 需求：
     * 定义一个计算机类，属性有：
     * 品牌
     * 颜色
     * 型号
     * 定义一个学生类，属性有
     * 学号
     * 姓名
     * 学生有一台笔记本电脑
     * 所有类写到本源码中。
     */

    public static void main(String [] args){
        
        Student01 student = new Student01();
        //Computer computer = new Computer();
        student.a = new Computer();

        student.no = 73;
        student.name = "LiSi";
        //student.a = computer;
        student.a.pinPai = "华硕";
        student.a.yanSe = "蓝色";
        student.a.xingHao = "aXSW-9345U231";
        System.out.println("姓名:" + student.name +"\n学号:" +  student.no + "\n" + student.name + "的电脑品牌是:" + student.a.pinPai + "\n颜色是:" + student.a.yanSe + "\n型号是: " + student.a.xingHao);

 
    }
}

class Student01{
    int no;
    String name;
    Computer a;

}
class Computer{
    String pinPai;
    String yanSe;
    String xingHao;

}
