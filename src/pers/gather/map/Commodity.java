package pers.gather.map;

import java.util.Objects;

/**
 * @Author LiZiHao
 * @Date 2022/7/3/0003/18:03
 */
public class Commodity {
    private int no;
    private String name;

    public Commodity() {
    }

    public Commodity(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    要求:商品姓名和编号相同,算是同一个商品

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return no == commodity.no && Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
