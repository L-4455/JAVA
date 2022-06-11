package pers.integer;

/**
 * @Author LiZiHao
 * @Date 2022/6/11/9:33
 */
public class MyInteger {
    private int value;

    public MyInteger() {

    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}
