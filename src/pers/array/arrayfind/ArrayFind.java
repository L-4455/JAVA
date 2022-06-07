package pers.array.arrayfind;

/**
 * @Author LiZiHao
 * @Date 2022/6/5/9:47
 */
public class ArrayFind {
    /*
        数组查找
        在数组中查找某个元素的下标一般分为两种方式
        1:遍历查找,一个挨一个查找直到找出目标元素为止;
        2:二分法查找(折半查找)
     */
    public static void main(String[] args){
//        使用遍历查找
        int[] array = {1232,41,457,14,5671,123,745};

//        查找123元素的下标
        /*
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 745){
                System.out.println("该元素的下标为:" + i);
                return;
            }
        }
        System.out.println("该元素不存在");
        */
        int index = arrayFind(array,123);
        System.out.println(index == -1 ? "该元素不存在" : "该元素的下标为:" + index);
    }

    /**
     * 遍历查找目标值
     * @param array 被查找的数组
     * @param ele 被查找元素
     * @return -1表示该元素不存在
     */
    public static int arrayFind(int[] array, int ele) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == ele){
                return i;
            }
        }
        return -1;
    }
}
