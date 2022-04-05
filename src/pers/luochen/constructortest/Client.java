/**
 * @author: LiZhiHao
 * @Date: 2022-04-02 22:04:12
 * @LastEditTime: 2022-04-02 22:16:33
 */
package pers.luochen.constructortest;

public class Client {
    /**
     * 客户类.
     */
    public Client(){
        for(int i =0;i <= 10;i++){
            System.out.println(i);
        }
        System.out.println("你调用了无参数构造方法");
    }
    public Client(int i){
        System.out.println("你调用了有参数构造方法" + (i + 10));
    }
    private int age;
    private int ID;
    private String name;
    private String adder;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
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
