package pers.exception.work.d2;

/**
 * @Author LiZiHao
 * @Date 2022/6/26/16:27
 */
public class Fighter extends Weapon implements Moveable, Shotable {

    private final String name = "战斗机";

    @Override
    public void move() {
        System.out.println("战斗机移动");
    }

    @Override
    public void shot() {
        System.out.println("战斗机射击");
    }

    @Override
    public String toString() {
        return name;
    }
}
