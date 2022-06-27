package pers.exception.work.d2;

/**
 * @Author LiZiHao
 * @Date 2022/6/26/14:59
 */
public class TanKe extends Weapon implements Movable, Shotable {

    private final String name = "坦克";


    @Override
    public String toString() {
        return name;

    }

    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shot() {
        System.out.println("坦克射击");
    }
}
