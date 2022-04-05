package pers.luochen.parameter;

/**
 * @author LiZhiHao
 */
public class Student_Test {
    public static void main(String[] args) {
        Student e = new Student(20,"张三",20.1);
        System.out.println(e.getFraction());
        System.out.println(e.getName());
        System.out.println(e.getAge());

        /*
        Student e = new Student();
        */
    }
}
