/**
 * @author: LiZhiHao
 * @Date: 2022-04-02 17:32:27
 * @LastEditTime: 2022-04-02 19:31:10
 */
package pers.luochen.privatetest;
/**
 * 封装的使用
 * 在需要封装的属性前加修饰符 private 代表私人的。
 * 
 */
public class Student {
    /**
     * 学生类
     */
    //不加封装的属性
    int age;
    //加了封装的属性
    private int no;
    private String name;

    // 提供get入口
    public int getNo(){
        // 语法错误，因为java有就近原则，此时的两个age指的都是形参中的age。并没有把传过来的age的值赋值给实例变量中保存
        return no;
    }
    //提供set入口
    public void setNo(int a){
        //在set入口是可以写逻辑业务的
        if(a > 100000 || a < 0){
            System.out.println("你的学号不正确");
            return;
        }else{
            no = a;
        }
        
    }
    
    public String getName(){
        return name;
    }
    public void setName(String b){
        name = b;
    }
}
