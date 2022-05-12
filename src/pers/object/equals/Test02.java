package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/22:43
 */
public class Test02 {
    public static void main(String[] args) {
        User user1 = new User("李四", new Address("漯河", "召陵", "462000"));
        User user2 = new User("李四", new Address("漯河", "召陵", "462000"));

//        System.out.println(flag);//false 按照正常逻辑来算,应该输出为:true.
        System.out.println(user1.equals(user2));//true
        User user3 = new User("张三", new Address("郑州", "新郑", "451192"));
        System.out.println(user1.equals(user3));//false
        System.out.println(user2.equals(user3));//false

    }
}
