package pers.string;

/**
 * @Author LiZiHao
 * @Date 2022/6/7/10:29
 */
public class UserString {

    private int no;
    private String name;

    public UserString() {
    }

    public UserString(int no, String name) {
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
}
