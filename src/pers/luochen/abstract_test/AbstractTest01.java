package pers.luochen.abstract_test;

/**
 * @Author LiZiHao
 * @Date 2022/04/23/22:04
 */
/*
 * 抽象类的概念:
 * 1:类和类之间有共同特征,把这个特征提取出来,形成一个类,这个类就叫抽象类.
 * 2:因为类是不存在的,所以抽象类无法实例化对象.
 * 3:抽象类语法格式:
 *  [修饰符列表] abstract class 类名{
 *
 *  }
 *  4:abstract无法与final一起使用.
 *  5:抽象类无法实例化对象,所以只能被继承.
 *  6:抽象类的子类也可以作为一个抽象类.但是被抽象后就无法实例化对象了.
 *  5:抽象类是有构造方法的,是供给子类创建对象时使用的.
 */
public class AbstractTest01 {
    public static void main(String[] args) {
        /*Bank是抽象的; 无法实例化
        Bank bank = new Bank();*/
        /*Debit_Card是抽象的; 无法实例化
        Debit_Card debit_card = new Debit_Card();*/
        Debit_Card debit_card = new Debit_Card("LISI", "rgba");
        debit_card.display();
    }
}

/*非法的修饰符组合: abstract和final
final abstract class  Bank{

}*/
abstract class Bank {
    private String name;

    public Bank() {

    }

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Debit_Card extends Bank {
    String name;

    public Debit_Card() {
    }

    /*无法将类Bank中的构造器 Bank应用到给定类型
        在构造方法中如果既没有this()或super()
        那么默认有一个super()
        super()来默认调用父类中的无参数构造方法(无参数构造方法默认提供)
        当父类中只有有参数构造方法,那么就不在默认提供无参数构造方法.如果没有手动写出来,那么子类创建对象时就会报错.
        所以抽象类中是有构造方法的.目的就是为了给子类创建对象使用.
        public Debit_Card(){
        }*/
    public Debit_Card(String name, String name1) {
        setName(name1);
        this.name = name;
    }

    public void display() {
        System.out.println(this.name + "\n" + super.getName());
    }

}

