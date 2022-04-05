package pers.luochen.computer;

class Computer01 {
    String brand;
    int model;
    String color;
}

class Student02 {
    int studentID;
    String name;
    Computer01 w;
}


public class Test004 {
    public static void main(String [] args) {
        Computer01 BiJiBen = new Computer01();
        BiJiBen.brand ="惠普";
        BiJiBen.color="black";
        BiJiBen.model=1213;
        Student02 q = new Student02();
        q.studentID = 1231231;
        q.name="李哥";
        q.w = BiJiBen;
        //q.w = new Computer();
        //q.w.brand = "惠普";
        //q.w.color = "黑色";
        //q.w.model = 88888;
        System.out.println("你好:" + "\n" +"你的ID为" + q.studentID + "\n" + "你的姓名为:" + q.name);
        System.out.println("你使用的电脑品牌为：" + q.w.brand +"\n"+"颜色:" + q.w.color + "\n" +"型号:" +q.w.model);

    }
}
