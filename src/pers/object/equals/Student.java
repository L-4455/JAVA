package pers.object.equals;

/**
 * @Author LiZiHao
 * @Date 2022/5/12/21:53
 */
public class Student {
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    //    重写toString方法
    public String toString() {
        return "学号:" + this.no + "姓名:" + this.name;
    }

    //    重写equals方法
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)) return false;
        if (this == obj) return true;
        Student student = (Student) obj;

//        使用 == 判断,输出结果为:true.虽然结果是真,但是我们改一下测试程序,结果就不为真了.
//        return this.no == student.no && this.name == student.name;
//        这里的this.no之所以调用不了equals是因为no是基本数据类型.
//        只有引用数据类型才可以调用方法
//        true
        return this.no == student.no && this.name.equals(student.name);

    }
}
