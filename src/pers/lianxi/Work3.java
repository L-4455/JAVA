package pers.lianxi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author LiZiHao
 * @Date 2022/7/5/17:34
 */
public class Work3 {
    /*
    3.分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
        那在成绩排序的基础上按照年龄由小到大排序。
        姓名（String）年龄（int）分数（float）
        liusan			20				90.0F
        lisi			22				90.0F
        wangwu			20				99.0F
        sunliu			22				100.0F
        编写一个Student类用来实现Comparable<Student>接口,并在其中重写CompareTo(Student o)方法　
        在主函数中使用Comparable 与 Comparetor 分别对ArrayList进行排序.
     */
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        ArrayList<Student> arrayList = new ArrayList<>();

        Student s1 = new Student("liusan", 20, 90.0F);
        Student s2 = new Student("lisi", 22, 90.0F);
        Student s3 = new Student("wangwu", 20, 99.0F);
        Student s4 = new Student("sunliu", 22, 100.0F);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

//        降序排序
        for (Student student : arrayList) {
            System.out.println(student);
        }
        System.out.println("========================");
//      升序排序
        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student>, Comparator<Student> {
    String name;
    int age;
    float fenSu;

    public Student(String name, int age, float fenSu) {
        this.name = name;
        this.age = age;
        this.fenSu = fenSu;
    }

    @Override
    public int compareTo(Student o) {
        if (o.fenSu - this.fenSu == 0) {
            return this.age - o.age;
//        return Integer.compare(this.age - o.age , 0);
        } else {
            return (int) (o.fenSu - this.fenSu);
//            return Float.compare(o.fenSu - this.fenSu , 0);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1 == o2) {
            return o1.age - o2.age;
        } else {
            return (int) (o2.fenSu - o1.fenSu);
        }
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fenSu=" + fenSu +
                ']';
    }
}
