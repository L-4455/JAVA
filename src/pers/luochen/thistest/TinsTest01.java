package pers.luochen.thistest;

/**
 * @author: LiZhiHao
 * @Date: 2022-04-04 23:36:05
 * @LastEditTime: 2022-04-05 00:09:59
 */
public class TinsTest01 {
    public static void main(String[] args) {
        /*
         * 测试类
         */
        Student student = new Student();

        //System.out.println(student.getName());
        //System.out.println(student.getAge());
        //System.out.println(student.getNo());

        student.setAge(111);
        student.setName("lisi");
        student.setNo(20);
        System.out.println("年龄:" + student.getAge());
        System.out.println("姓名:" + student.getName());
        System.out.println("学号:" + student.getNo());


    }

}
