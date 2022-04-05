package pers.luochen.user;

/*
public class User {
    //用户名
    String name;
    //用户编号
    int number;
    //用户性别
    boolean sex;
    //用户住址
    Address addr;
}

 */
public class User{
    private int age;
    //set
    public void setAge(int age1){
        if(age1 < 0 || age1 > 150){
            System.out.println("对不起，您输入的年龄不合法");
            return;
        }
        age = age1;
    }
    //get
    public int getAge(){
        return age;
    }
}
