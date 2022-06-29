package pers.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author LiZiHao
 * @Date 2022/6/29/17:17
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User b1 = new User("哈哈");
        c.add(b1);

        User b2 = new User("哈哈");
        /*
            分析结果是true/false
            结果:
            1、在没有重写equals情况下,contains调用的是Object的equals,Object的equals使用的是==方式判断,
            ==判断的是内存地址,b1和b2的内存地址肯定不一样,所以结果是false
           2、在重写equals后,contains会优先调用重写后的equals,equals是用来比较对象所保存的内容,不是内存地址,
           所以当重写equals后结果是:true
         */
//        重写equals前:false
        System.out.println(c.contains(b2));
//        重写equals后:true
        System.out.println(c.contains(b2));


    }
}

class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof User)) return false;
        if (o == this) return true;
        User user = (User) o;
        return user.name.equals(this.name);
    }
}

