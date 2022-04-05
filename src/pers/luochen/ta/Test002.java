package pers.luochen.ta;


public class Test002 {
    public static void main(String[] args) {
        Husband liZiHao = new Husband();
        liZiHao.name = "李子昊";
        Wife liManMan = new Wife();
        liManMan.name = "李漫漫";
        liZiHao.Wife = liManMan;
        liManMan.Husband = liZiHao;
        System.out.println(liZiHao.name + "的妻子名字：" + liZiHao.Wife.name);
        System.out.println(liZiHao.name + "的妻子名字：" + liManMan.name);
    }
}
