package pers.luochen.customer;

/**
 * @author LiZhiHao
 */
public class Customer {

    private String name;

    /**
     * 无参构造方法
     */
    public Customer() {
        System.out.println("你调用了无参数构造方法");
    }

    /**
     * 有参数构造方法
     *
     * @param name
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * 实例方法
     */
    public void shopping() {
        System.out.println(this.name + "在购物");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

