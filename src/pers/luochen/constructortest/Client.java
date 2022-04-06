/**
 * @author: LiZhiHao
 * @Date: 2022-04-02 22:04:12
 * @LastEditTime: 2022-04-06 18:19:26
 */
package pers.luochen.constructortest;

public class Client {
    /**
     * 客户类.
     */
    public Client() {
        int number = 0, number1 = 10;
        for (int i = n; i <= number1; i++) {
            System.out.println(i);
        }
        System.out.println("你调用了无参数构造方法");
    }

    public Client(int i) {
        System.out.println("你调用了有参数构造方法" + (i + 10));
    }

    private int age;
    private int id;
    private String name;
    private String adder;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int iD) {
        this.id = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
    }

}
