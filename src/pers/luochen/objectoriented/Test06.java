package pers.luochen.objectoriented;

/**
 * @author: LiZhiHao
 * @Date: 2022-03-27 14:24:31
 * @LastEditTime: 2022-03-27 22:34:13
 */
public class Test06 {
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

    public static void main(String[] args) {

        Student student = new Student();
        //Computer computer = new Computer();
        student.computer = new Computer();

        student.no = 73;
        student.name = "LiSi";
        //student.a = computer;
        student.computer.pinPai = "华硕";
        student.computer.yanSe = "蓝色";
        student.computer.xingHao = "aXSW-9345U231";
        System.out.println("姓名:" + student.name + "\n学号:" + student.no);
        System.out.println(student.name + "的电脑品牌是:" + student.computer.pinPai);
        System.out.println("型号是: " + student.computer.xingHao);
        System.out.println("颜色是: " + student.computer.yanSe);
    }
}