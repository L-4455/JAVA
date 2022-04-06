/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-06 18:17:15
 */
package pers.luochen.computer;



public class Test004 {
    public static void main(String [] args) {
        Computer01 bjJiBen = new Computer01();
        bjJiBen.brand ="惠普";
        bjJiBen.color="black";
        bjJiBen.model=1213;
        Student02 q = new Student02();
        q.studentId = 1231231;
        q.name="李哥";
        q.w = bjJiBen;
        //q.w = new Computer();
        //q.w.brand = "惠普";
        //q.w.color = "黑色";
        //q.w.model = 88888;
        System.out.println("你好:" + "\n" +"你的ID为" + q.studentId + "\n" + "你的姓名为:" + q.name);
        System.out.println("你使用的电脑品牌为：" + q.w.brand +"\n"+"颜色:" + q.w.color + "\n" +"型号:" +q.w.model);

    }
}
class Computer01 {
    String brand;
    int model;
    String color;
}

class Student02 {
    int studentId;
    String name;
    Computer01 w;
}
