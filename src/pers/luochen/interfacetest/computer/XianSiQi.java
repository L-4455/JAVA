package pers.luochen.interfacetest.computer;

/**
 * @Author LiZiHao
 * @Date 2022/5/5/22:51
 */
public class XianSiQi implements Drawable {

    public void insert() {
        System.out.println("显示器成功连接");
    }

    public void pull() {
        System.out.println("显示器断开连接");
    }
}
