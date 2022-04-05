/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-03-29 20:24:29
 */
package pers.luochen.parameter;

public class Student {
    private int age;
    private String name;
    private double fraction;

    public Student(){
        System.out.println(" The world is changing. We should be happy in time. ");
        System.out.println(" Never let anything stop you from pursuing your dreams, " +
                "from living or falling in love ");
    }
    public Student(int s, String w, double q) {
        age= s;
        name = w;
        fraction = q;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getFraction() {
        return fraction;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFraction(double fraction) {
        this.fraction = fraction;
    }

}



