package pers.collection.danlink;


/**
 * @Author LiZiHao
 * @Date 2022/7/1/11:18
 */
public class Link {
    Node header;
    private int size = 0;

    /**
     * [增]添加数据
     *
     * @param obj 要添加的数据
     */
    public void add(Object obj) {
        new Node();
//        判断头部元素是否为null
        if (header == null) {
            header = new Node(obj, null);
        } else {
            Node lastNode = findNode(header);
            lastNode.next = new Node(obj, null);
        }
        size++;
    }

    /**
     * [删]删除指定的元素
     *
     * @param obj 指定元素
     */
    public void remove(Object obj) {
    }

    /**
     * [改]修改指定下标上的元素
     *
     * @param index 指定元素
     */
    public void set(int index) {

    }

    /**
     * [查]获取指定下标上的元素
     *
     * @param index 指定元素
     */
    public void get(int index) {

    }

    /**
     * 打印集合里面的所有元素
     */
    public void print() {
//        Node node = new Node();
    }

    /**
     * 寻找末尾节点
     *
     * @param node 一个node节点
     * @return 继续寻找, 直到传递过来的node节点next为null
     */
    private Node findNode(Node node) {
        if (node.next == null) {
            return node;
        }
        return findNode(node.next);
    }

    /**
     * 返回集合元素中的个数
     *
     * @return 返回个数
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Link{" +
                "size=" + size +
                ", header=" + header +
                '}';
    }
}
