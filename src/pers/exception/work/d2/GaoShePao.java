package pers.exception.work.d2;

/**
 * @Author LiZiHao
 * @Date 2022/6/26/15:11
 */
public class GaoShePao extends Weapon implements Shotable {
    private final String name = "高射炮";


    @Override
    public String toString() {
        return name;
    }

    @Override
    public void shot() {
        System.out.println("高射炮开炮--");
    }
}
