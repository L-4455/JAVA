package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/22:43
 */
public class AddressTest {
    public static void main(String[] args) {
        User user1 = new User("李四", new Address("漯河", "召陵", "462000"));
        User user2 = new User("李四", new Address("漯河", "召陵", "462000"));

        boolean flag = user1 == user2;
//        false直观的来看,结果应该输出为:true.但是结果为false
//        因为 == 号在对引用数据类型做判断时,判断是的引用保存对象的内存地址,而不是具体的值,
//        user1和user2都是new出来的,所以内存地址肯定不同.
        System.out.println(flag);

//        使用equals判断
        System.out.println(user1.equals(user2));//true


        User user3 = new User("张三", new Address("郑州", "新郑", "451192"));
        System.out.println(user1.equals(user3));//false
        System.out.println(user2.equals(user3));//false

    }
}
