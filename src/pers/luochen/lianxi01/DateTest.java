package pers.luochen.lianxi01;

/**
 * @Author LiZiHao
 * @Date 2022/04/21/12:20
 */
public class DateTest {
    public static void main(String[] args) {
        /*使用无参数构造方法初始化MyTime属性特征.
        MyTime myTime = new MyTime();
        使用set修改MyTime中的成员变量
        myTime.setHour(1);
        myTime.setMinute(20);
        myTime.setSecond(33);*/

        /*通过有参数构造方法创建对象并赋值*/
        MyTime mytime = new MyTime(1, 20, 33);
        System.out.println("原始时间信息:  " + mytime.getHour() + "时" + mytime.getMinute() + "分" + mytime.getSecond() + "秒");

        /*调用MyTime中的方法来增时间.*/
        mytime.addHour(12);
        mytime.addMinute(34);
        mytime.addSecond(150);
        /*使用MyTime中的display方法打印时间信息*/
        mytime.display("增加后时间信息: ");

        /*调用MyTime中的方法来减时间*/
        mytime.subHour(1);
        mytime.subMinute(21);
        mytime.subSecond(5);
        /*使用MyTime中的display方法打印时间信息*/
        mytime.display("减少后时间信息: ");


    }
}

class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    /*打印时间信息方法*/
    public void display(String info) {
        System.out.println(info + this.getHour() + "时" + this.getMinute() + "分" + this.getSecond() + "秒");
    }

    /*增加"秒"时间*/
    public void addSecond(int second) {
        if (second < 0) {
            System.out.println("增加\"秒\"时间错误,请正确输入.");
            return;
        }
        this.setSecond(this.getSecond() + second);

        if (this.getSecond() >= 60) {
            this.setMinute(this.getMinute() + (this.getSecond() / 60));
            this.setSecond(this.getSecond() - (60 * (this.getSecond() / 60)));
        }
    }

    /*增加"分钟"时间*/
    public void addMinute(int minute) {
        this.setMinute(this.getMinute() + minute);

        if (this.getMinute() >= 60) {
            this.setHour(this.getHour() + (this.getMinute() / 60));
            this.setMinute(this.getMinute() - (60 * (this.getMinute() / 60)));
        }
    }

    /*增加"小时"时间*/
    public void addHour(int hour) {
        if ((this.getHour() + hour) > 24) {
            System.out.println("\"小时\"时间错误");
            return;
        }
        if (hour <= 0) {
            System.out.println("增加\"小时\"时间错误,请正确输入.");
            return;
        }
        this.setHour(this.getHour() + hour);
    }

    /*减少"秒"时间*/
    public void subSecond(int second) {

        if (second < 0) {
            System.out.println("减少\"秒\"时间错误,请正确输入.");
            return;
        }
        this.setSecond(this.getSecond() - second);
    }

    /*减少"分钟"时间*/
    public void subMinute(int minute) {
        if (minute > 60 || minute < 0) {
            System.out.println("减少\"分钟\"时间错误,请正确输入.");
        } else {
            this.setMinute(this.getMinute() - minute);
        }
    }

    /*减少"小时"时间*/
    public void subHour(int hour) {
        if (hour > 24 || hour <= 0) {
            System.out.println("减少\"小时\"时间错误,请正确输入.");
        } else {
            this.setHour(this.getHour() - hour);
        }
    }
}

