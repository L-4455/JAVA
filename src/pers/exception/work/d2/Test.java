package pers.exception.work.d2;

/**
 * @Author LiZiHao
 * @Date 2022/6/26/15:18
 */
public class Test {
    public static void main(String[] args) {
        Army army = new Army(4);

        TanKe tanke = new TanKe();
        GaoShePao gaoShePao = new GaoShePao();
        Fighter fighter = new Fighter();
        YunShuJi yunShuJi = new YunShuJi();


        try {
            army.addWeapon(gaoShePao);
            army.addWeapon(tanke);
            army.addWeapon(fighter);
            army.addWeapon(yunShuJi);
        } catch (AddWeaponException e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
        army.moveAll();
        army.should();
    }
}
