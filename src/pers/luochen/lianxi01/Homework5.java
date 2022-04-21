package pers.luochen.lianxi01;

/**
 * @Author LiZiHao
 * @Date 2022/04/21/17:27
 */
public class Homework5 {
    public static void main(String[] args) {
        /*使用无参数构造方法创建人类对象*/
        Person person1 = new Person();
        person1.setAge(20);
        person1.setName("王五");
        /*调用人类对象中的display方法*/
        person1.display();

        /*使用有参数构造方法创建对象并赋值*/
        Person person2 = new Person("李四", 6);
        person2.display();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("姓名: " + this.name);
        if (this.age < 0 || this.age > 150) {
            System.out.println("错误!,年龄范围在0-150");
            return;
        }
        System.out.println("年龄: " + this.age);

        /*
        System.out.println("姓名: " + this.getName() + "年龄: " + this.getAge());
        System.out.println("姓名: " + name + "年龄: " + age);
        */

    }
}

