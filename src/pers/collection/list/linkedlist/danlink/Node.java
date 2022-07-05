package pers.collection.list.linkedlist.danlink;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/11:20
 */
public class Node {

    Object data;
    Node next;

    private int index;
    private int size;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
