package pers.lianxi;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author LiZiHao
 * @Date 2022/7/5/17:05
 */
public class Work2 {
    /*
        2.已知数组存放一批QQ号码，QQ号码最长为11位，
        最短为5位String[] stars =
        {"12345","67891","12347809933","98765432102","67891","12347809933"}。
        将该数组里面的所有qq号都存放在LinkedList中，
        将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。
     */
    public static void main(String[] args) {
        String[] array = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};


        List<String> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
            list.add(array[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (list.get(i).equals(list.get(i))) {
                list.remove(list.get(i));
            }
        }
    }
}
