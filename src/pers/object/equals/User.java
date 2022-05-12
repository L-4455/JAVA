package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/22:42
 */
public class User {
    /*
            所以再重写equals方法时要写的彻底.
     */
    String name;
    Address address;

    public User() {
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    //    重写equals方法
//    规则:姓名相同,城市相同,代表两个对象相同.
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) return false;
        if (this == obj) return true;
        User user = (User) obj;
//        我们调用了String,里面重写了equals方法.但是我们调用了address,里面并没有重写equals方法.
//        在没有重写equals方法时默认使用JAVA提供的默认执行代码,使用的是==判断,而==判断的是对象的内存地址,并不是内容.
        if (this.name.equals(user.name) && this.address.equals(user.address)) {
            return true;
        }
        return false;
    }
}
