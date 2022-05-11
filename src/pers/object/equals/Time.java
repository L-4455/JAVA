package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/11/21:57
 */
public class Time {
    private int year;
    private int moth;
    private int day;

    public Time() {

    }

    public Time(int year, int moth, int day) {
        this.year = year;
        this.moth = moth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoth() {
        return moth;
    }

    public void setMoth(int moth) {
        this.moth = moth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // 方法重写:返回值相同,方法名相同,形式参数列表相同.
    /* public boolean equals(Object obj) {
     *//*
     * 判断time和time1中的内容是否相等
     *
     * *//*
//        获取time的时间
        int year1 = this.year;
        int moth1 = this.moth;
        int day1 = this.day;
//        获取time1的时间
//        time.equals(time1);所以obj就是time1
        *//*java: 找不到符号
        符号:   变量 year
        位置: 类型为java.lang.Object的变量 obj
        int year2 = obj.year;
        int moth2 = obj.moth;
        int day2 = obj.day;*//*
     *//*编译错误:
     * 在Object中找不到year,moth,day.
     * time.equals(time1);
     * Time是子类,Object是夫类.所以当使用obj时是从Object中找obj所调用的属性,但是Object中没有year....需要强转
     * *//*
        if (obj instanceof Time) {
            // 当obj等于空时,这片代码没有执行.
            Time time = (Time) obj;
            int year2 = time.year;
            int moth2 = time.moth;
            int day2 = time.day;
            if (year1 == year2 && moth1 == moth2 && day1 == day2) {
                return true;
            }
        }
        return false;
    }*/
//    改良版
    /*public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Time)){
            return false;
        }
        if(this == obj){
            return true;
        }
        Time time = (Time)obj;
        if(this.year == time.year && this.moth == time.moth && this.day == time.day){
            return true;
        }
        return false;
    }*/
//    再次改良
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Time)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Time time = (Time) obj;
        return (this.year == time.year && this.moth == time.moth && this.day == time.day);
    }

    @Override
    public String toString() {
        return "Time{" +
                "year=" + year +
                ", moth=" + moth +
                ", day=" + day +
                '}';
    }
}
