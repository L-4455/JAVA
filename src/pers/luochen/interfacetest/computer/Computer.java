package pers.luochen.interfacetest.computer;

/**
 * @Author LiZiHao
 * @Date 2022/5/5/22:43
 */
public class Computer {
    private Drawable drawable;

    //无参构造
    public Computer() {

    }

    //有参构造
    public Computer(Drawable drawable) {
        this.drawable = drawable;
    }

    //提供get方法
    public Drawable getDrawable() {
        return drawable;
    }

    //提供set方法
    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public void display() {
        drawable.pull();
        drawable.insert();
    }
}
