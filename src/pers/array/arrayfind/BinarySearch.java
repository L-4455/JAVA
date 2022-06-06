package pers.array.arrayfind;

/**
 * @Author LiZiHao
 * @Date 2022/6/5/10:07
 */
public class BinarySearch {
    /*
        二分法查找原理
        在一堆数据中使用二分法查找
        1:
            二分法查找的数据必须是排序好的
        2:
            二分法查找是将第一个元素的下标加上最后一个元素的下标除以2求出中间元素的下标
            如果中间元素小于目标值那么就代表目标值在中间元素的右边,此时开始下标需要重新赋值;
            使用重新赋值后的开始下标加最后元素的下标除以2在求出中间值,再用中间值去和目标值对比
            直到中间值为目标值,或则是中间值下标等于目标值
     */

    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int index = binarysearch(array, 17);
        System.out.println(index == -1 ? "该元素不存在" : array[index] + "元素的下标为:" + index);

    }

    /**
     * 二分法查找目标值
     *
     * @param array 被查找数组
     * @param ele   被查找元素
     * @return -1表示该元素不存在
     */
    public static int binarysearch(int[] array, int ele) {
        int begin = 0;
        int end = array.length - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (array[mid] == ele) {
                return mid;
            } else if (array[mid] < ele) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
