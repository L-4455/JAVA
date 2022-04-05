/**
 * @author: LiZhiHao
 * @Date: 2022-04-02 17:22:30
 * @LastEditTime: 2022-04-02 19:33:01
 */
package pers.luochen.privatetest;
/*
 * 测试类
 * 
 */
public class StudentTest {
    public static void main(String []args){
        
        //创建学生对象
        Student student = new Student();
        
        // 读取并修改没有加 private的 学生对象中的实例变量 age
        // 可以看到，age的值没有任何安全性，使用者可以随意修改。
        
        System.out.println(student.age = -10);
        
        // 读取加了 private 的属性
        // 报错 The field Student.no is not visible。意为 Student中的no变量不可见。是私有的无法读取、
        // 这里我们可以看出加了 private的属性是安全的，但这个安全太安全了。以至于这个属性不能使用，这是不行的。
        // 对于封装的属性，我们需要提供一个入口来让使用者可以读取或修改这个属性。
        // 访问属性一般有两种形式：
                    // set 修改
                    // get 读取
        /**
         * 那么入口要怎么写？
         * get语法格式：
         *      public 返回值类型 set+属性名首字母大写(){
         *          return 实例变量名;
         * }
         * set语法格式:
         *      public void get+属性名首字母大写(形参){
         *          实例变量名 = 形参变量名;
         * }
         */
        //student.no;

        //访问封装过的属性No
        /**
         * 我们知道，在一个类中有属性和方法两个大体。那么：
         * 
         * 对于带有static的方法，我们的访问方法是：类名.方法名;
         * 对于不带static的方法，我们的访问方法是：引用.方法名;
         */
        //学号并不适合这样命名，对于常理来说。所以我们需要对学号进行判断。
        student.setNo(1111111110);
        student.setNo(10);
        System.out.println(student.getNo());

        student.setName("zhangSan");
        System.out.println(student.getName());
    }
}
