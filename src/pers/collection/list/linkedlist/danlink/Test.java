package pers.collection.list.linkedlist.danlink;

/**
 * @Author LiZiHao
 * @Date 2022/7/1/11:30
 */
public class Test {
    public static void main(String[] args) {

        MyLinkedList link = new MyLinkedList();

        link.add("www");
        link.add(10);
        link.add("i love you");

//        输入集合中的个数
        System.out.println("元素中的个数:" + link.size());

//        遍历集合
        link.traverse();
        /**/
//        删除集合中的10;
//        link.remove(10);
        System.out.println("元素中的个数:" + link.size());
        link.traverse();

        System.out.println("=================");
//        link.remove("www");
        System.out.println("元素中的个数:" + link.size());
        link.traverse();

//        link.remove("i love you");

        link.traverse();


        link.add(100);
        link.traverse();
        link.set(100, 20);
        link.traverse();
        System.out.println("元素个数:" + link.size());


        link.traverse();
        link.remove(10);
        link.remove(3000);
        link.traverse();

    }
}
