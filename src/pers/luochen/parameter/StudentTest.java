/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-06 17:58:51
 */
package pers.luochen.parameter;

/**
 * @author LiZhiHao
 */
public class StudentTest {
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
