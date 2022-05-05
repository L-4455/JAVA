package pers.luochen.interfacetest;

/**
 * @Author LiZiHao
 * @Date 2022/5/5/20:55
 */
public class Test01 {
    public static void main(String[] args) {
        Food food = new ChinaChuSi();
        Customer customer = new Customer(food);
        customer.display();


        Food food1 = new AmalChuSi();
        Customer customer1 = new Customer(food1);
        customer1.display();

    }
}
