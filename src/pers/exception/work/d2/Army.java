package pers.exception.work.d2;

/**
 * @Author LiZiHao
 * @Date 2022/6/26/15:11
 */
public class Army {
    private Weapon[] weapons;

    //    有参数构造并初始化武器数量
    public Army(int count) {
        weapons = new Weapon[count];
    }

    /**
     * 添加武器
     *
     * @param weapon 武器数量
     */
    public void addWeapon(Weapon weapon) throws AddWeaponException {

        for (int i = 0; i < weapons.length; i++) {
            if (null == weapons[i]) {
                weapons[i] = weapon;
                System.out.println(weapon + ":武器添加成功");
                return;
            }
        }
        throw new AddWeaponException("武器数量上限");
    }

    public void moveAll() {
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Moveable) {
                Moveable moveable = (Moveable) weapons[i];
                moveable.move();
            }
        }
    }

    public void shotall() {
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Shotable) {
                Shotable shotable = (Shotable) weapons[i];
                shotable.shot();
            }
        }
    }
}
