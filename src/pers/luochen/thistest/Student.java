/**
 * @author: LiZhiHao
 * @Date: 2022-04-04 23:36:44
 * @LastEditTime: 2022-04-05 18:01:36
 */
package pers.luochen.thistest;

public class Student {
    /**
     * 学生类
     * 什么情况下this不能省略?
     * 1.在有参数构造方法里可以看到,当在set的方法中需要提供形参,这个形参的变量名可以命名为其他的,但为了见名知意.
     *      我们通常取名为和实例变量一致的名字,但因为java有仅就原则,在set中的no = no 全部匹配为形参中的no.
     *      实例变量中的no和set方法中的no没有关系.这个时候需要写为 this.no = no;
     * 2.也就是说,在区分局部变量和成员变量时候是需要使用this的.
     */
    int no;
    int age;
    String name;

    //无参数构造方法
    public Student(){

    }
    //有参数构造方法
    /*public  Student(int no, int age,String name){
        
        this.age = age;
        this.no = no;
        this.name = name;
}
*/



    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        //this指的是当前对象,那么这个no就是实例变量中的no了.
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150){
            System.out.println("Error,年龄范围在<0-150>");
            return;
        }else{
        this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
