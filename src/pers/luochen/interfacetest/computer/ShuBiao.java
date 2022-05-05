package pers.luochen.interfacetest.computer;

/**
 * @Author LiZiHao
 * @Date 2022/5/5/23:05
 */
public class ShuBiao implements Drawable {
    public void insert() {
        System.out.println("鼠标成功连接");

    }

    public void pull() {
        System.out.println("鼠标断开连接");
    }
}
