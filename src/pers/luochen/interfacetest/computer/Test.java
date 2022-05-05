package pers.luochen.interfacetest.computer;

/**
 * @Author LiZiHao
 * @Date 2022/5/5/22:57
 */
public class Test {
    public static void main(String[] args) {
//        夫类型引用指向子类型对象.这里是指向了显示器,所以只有显示器的连接.
        Drawable drawable = new XianSiQi();
        Computer computer = new Computer(drawable);
        computer.display();
//        夫类型引用指向子类型对象.这里是指向了键盘,所以只有键盘的连接.
        Drawable drawable1 = new JianPan();
        Computer computer1 = new Computer(drawable1);
        computer1.display();
//        夫类型引用指向子类型对象.这里是指向了鼠标,所以只有鼠标的连接.
        Drawable drawable2 = new ShuBiao();
        Computer computer3 = new Computer(drawable2);
        computer3.display();
    }
}
