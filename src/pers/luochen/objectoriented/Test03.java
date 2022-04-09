package pers.luochen.objectoriented;

/**
 * @author: LiZhiHao
 * @Date: 2022-03-26 19:04:00
 * @LastEditTime: 2022-03-27 22:28:29
 */
public class Test03 {
    public static void main(String[] args) {
        //实例化User对象
        User u = new User();
        //实例化Adders对象
        Adders a = new Adders();

        u.addr = a;
        //null
        System.out.println(u.addr.city);
        a.city = "河南";
        //河南
        System.out.println(u.addr.city);
    }
}
