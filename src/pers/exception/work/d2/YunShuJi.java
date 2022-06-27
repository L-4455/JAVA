package pers.exception.work.d2;

/**
 * @Author LiZiHao
 * @Date 2022/6/26/16:30
 */
public class YunShuJi extends Weapon implements Movable {

    private final String name = "运输机";

    @Override
    public void move() {
        System.out.println("运输机在移动");
    }

    @Override
    public String toString() {
        return name;
    }
}
