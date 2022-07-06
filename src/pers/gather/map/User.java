package pers.gather.map;

import java.util.Objects;

/**
 * @Author LiZiHao
 * @Date 2022/7/3/0003/17:39
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
//    没有重写HashCode和equals

    //    重写equals
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) return false;
        if (obj == this) return true;
        User user = (User) obj;
        return this.name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
