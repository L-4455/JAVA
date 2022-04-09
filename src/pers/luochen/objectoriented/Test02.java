package pers.luochen.objectoriented;

/**
 * @author: LiZhiHao
 * @Date: 2022-03-26 17:38:22
 * @LastEditTime: 2022-03-27 22:27:36
 */
public class Test02 {
    public static void main(String[] args) {
        //实例化用户对象
        User u = new User();

        u.name = "jack";
        //通过实例化对象创建一个新的对象
        u.addr = new Adders();

        //输出jack的城市
        u.addr.city = "北京";
        u.addr.zipcode = 2222;
        u.addr.street = "朝阳";
        System.out.println(u.name + "的城市在:" + u.addr.city + "-街道在:" + u.addr.street + "-邮编是:" + u.addr.zipcode);
        
        /*
        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.sex);
        */
    }
}
