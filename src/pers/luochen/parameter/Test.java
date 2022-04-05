package pers.luochen.parameter;

public class Test {
    public static void main(String[] args) {
        User u = new User(20);
        add(u);
        System.out.println("main--->" + u.i);
    }
    public static void add(User u){
      u.i++;
      System.out.println("add---->" + u.i);
    }
}
class User{
    int i;
    public User(int age) {
        i = age;
    }
}
