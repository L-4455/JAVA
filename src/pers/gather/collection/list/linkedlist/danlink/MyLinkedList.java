package pers.gather.collection.list.linkedlist.danlink;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/11:18
 */
public class MyLinkedList {
    Node header;
    private int size = 0;
    private int pointer = 0;


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
        pointer++;
    }


    /**
     * [删]删除指定的元素
     *
     * @param obj 指定元素
     */
    public void remove(Object obj) {
        Node temp = header;
        while (temp != null) {
            if (temp.data == obj) {
                if (header.data == obj) {
                    header = temp.next;
                } else {
                    header.next = temp.next;
                }
                System.out.println(temp.data + "删除成功");
            }
            temp = temp.next;
        }
        size--;
        pointer--;
    }


    /**
     * [改]修改指定元素
     *
     * @param obj    旧元素
     * @param newObj 新元素
     */
    public void set(Object obj, Object newObj) {
        if (obj == null || newObj == null) {
            System.out.println("sb");
            return;
        }
        Node temp = header;
        while (temp != null) {
            if (temp.data == obj) {
                temp.data = newObj;
                System.out.println(obj + "修改为:" + newObj);
            }
            temp = temp.next;
        }
    }

    /**
     * [查]获取指定下标上的元素
     *
     * @param index 指定元素
     */
    public void get(int index) {
        if (index > 0 || index <= size) {
            System.out.println("sb");
            return;
        }
        Node temp = header;
    }

    /**
     * 遍历集合中的元素
     */
    public void traverse() {
        if (header == null) {
            System.out.println("遍历失败,链表不存在");
            return;
        }
        Node temp = header;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    /**
     * 打印集合里面的所有元素
     */
    public void print() {
        traverse();
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




