package pers.luochen.lianxi01;

/**
 * @author LiZhiHao
 */
public class Customer {
    private String name;


    public Customer() {

    }

    public Customer(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("姓名:" + getName());
    }


}
