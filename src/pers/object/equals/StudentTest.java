package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/21:59
 */
public class StudentTest {
    public static void main(String[] args) {
        /*
        当时用new的方式创建对象时,使用"=="判断JAVA对象就不再可以了
        Student student = new Student(101,new String("张三"));
        Student student1 = new Student(101,new String("张三"));
        boolean flag = student.equals(student1);
        System.out.println(flag);
        */

//       使用equals判断,即使是使用new方式传递参数,最终结果还是为true
        Student student = new Student(101, "张三");
        Student student1 = new Student(101, "张三");
        boolean flag = student.equals(student1);
//        true
        System.out.println(flag);

//      重新赋值,使用不同的数据来测试.
        student = new Student(202, "王五");
        student1 = new Student(301, "李四");
        boolean is = student.equals(student1);
//        false
        System.out.println(is);


    }
}
