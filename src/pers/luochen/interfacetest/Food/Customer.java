package pers.luochen.interfacetest.Food;

/**
 * @Author LiZiHao
 * @Date 2022/5/5/20:59
 */
public class Customer {

    //客户手里有一张菜单
    private Food food;

    public Customer() {

    }

    public Customer(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void display() {

//        Food food1 = this.getFood();
        food.XiHongSiChaoDan();
        food.maLaXiangGuo();
    }
}
