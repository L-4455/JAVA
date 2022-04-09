package pers.luochen.qizi;

/**
 * @author LiZhiHao
 */
public class Test01 {
    public static void main(String[] args) {
        ZhangFu w = new ZhangFu();
        w.age = 10;
        w.name = "李四";
        System.out.println(w.age + "\n" + w.name);
        w.q = new QiZi();
        w.q.name = "杰斯";
        System.out.println(w.q.name);
    }
}
