package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/21:59
 */
public class StudentTest {
    public static void main(String[] args) {
    /*        当是这样写时候,使用==判断对象就不再可以了
        Student student = new Student(101,new String("张三"));
        Student student1 = new Student(101,new String("张三"));
        boolean flag = student.equals(student1);
        System.out.println(flag);*/

        Student student = new Student(101, new String("张三"));
        Student student1 = new Student(101, new String("张三"));
        boolean flag = student.equals(student1);
        System.out.println(flag);
//        使用equals判断,即使是使用new方式传递参数,最终结果还是为true

    }
}
