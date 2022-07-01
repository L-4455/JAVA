package pers.collection.danlink;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/11:30
 */
public class Test {
    public static void main(String[] args) {
        Link link = new Link();
        link.add("a");
        link.add("adf");
        System.out.println(link.size());
        link.print();
    }
}
