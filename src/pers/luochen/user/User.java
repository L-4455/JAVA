
package pers.luochen.user;

/**
public class User {
    //用户名
    String name;
    //用户编号
    int number;
    //用户性别
    boolean sex;
    //用户住址
    Address addr;
}
*/
/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-06 17:55:51
 */
public class User {
    int age;
    int number;
    String name;
    Address addr;
    boolean sex;

    /**
     * set
     */
    public void setAge(int age1) {
        int number = 0;
        int number1 = 150;
        if (age1 < number || age1 > number1) {
            System.out.println("对不起，您输入的年龄不合法");
            return;
        }
        age = age1;
    }

    /**
     * get
     */
    public int getAge() {
        return age;
    }
}
