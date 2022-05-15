package pers.clone;

/**
 * @Author LiZiHao
 * @Date 2022/5/15/22:48
 */
public class CloneTest {
    /*
        对象的克隆
        protected native Object clone() throws CloneNotSupportedException;
    */
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.clone();
    }
}

class Monkey implements Cloneable {

    public Object clone() {
        System.out.println("222");
        return 0;
    }
}
