package pers.collection.danlink;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/11:20
 */
public class Node {
    Object date;
    Node next;
    Node header;
    private int size = 0;

    public Node() {

    }

    public Node(Object date, Node next) {
        this.date = date;
        this.next = next;
    }
}
