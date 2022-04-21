package pers.luochen.lianxi01;

/**
 * @Author LiZiHao
 * @Date 2022/04/20/23:19
 */
public class VehicleTest {
    public static void main(String[] args) {
//      通过无参数构造方法创建对象
        Vehicle vehicle = new Vehicle();
//      通过set设置对象属性值
        vehicle.setSize(5);
        vehicle.setSped(100);

        System.out.println("size: " + vehicle.getSize() + "\n" + "最初sped: " + vehicle.getSped());
//      调用加速方法
        vehicle.spedUp(10);
        System.out.println("加速后sped: " + vehicle.getSped());
//      调用加速方法
        vehicle.spedUp(20);
        System.out.println("加速后sped: " + vehicle.getSped());
//      调用减速方法
        vehicle.spedDown(5);
        System.out.println("减速后sped: " + vehicle.getSped());
//      调用减速方法
        vehicle.spedDown(10);
        System.out.println("减速后sped: " + vehicle.getSped());


        /*通过构造方法初始化对象属性特征。*/
        //Vehicle vehicle1 = new Vehicle();

    }
}

class Vehicle {
    private int sped;
    private int size;

    public Vehicle() {
    }

    public Vehicle(int sped, int size) {
        this.sped = sped;
        this.size = size;
    }

    public int getSped() {
        return sped;
    }

    public void setSped(int sped) {
        this.sped = sped;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /*移动方法*/
    public void move() {
        System.out.println("公共汽车在移动");
    }

    /*加速方法*/
    public void spedUp(int upSped) {
        if (upSped <= 0) {
            System.out.println("加速错误,加速数值不能为0");
        } else {
            /*加速,在原有的基础上加速.*/
//        int oldSped = this.getSped();
            if (this.getSped() >= 200) {
                System.out.println("速度过高,不再加速.");
            } else {
                int oldSped = this.getSped();
                this.setSped(oldSped + upSped);
            }
        }
    }

    /*减速方法*/
    public void spedDown(int downSped) {
        /*减速,在原有的速度上减速.*/
//        int oldSped = this.getSped();
        if (this.getSped() <= 10) {
            System.out.println("速度过低,不再减速.");
            System.exit(0);
        } else {
            int oldSped = this.getSped();
            this.setSped(oldSped - downSped);
        }


    }
}
