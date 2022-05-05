package pers.luochen.interfacetest.computer;

/**
 * @Author LiZiHao
 * @Date 2022/5/5/22:49
 */
public class JianPan implements Drawable {
    public void insert() {
        System.out.println("键盘成功连接");
    }

    public void pull() {
        System.out.println("键盘断开连接");
    }
}
