/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-04-06 18:19:52
 */
package pers.luochen.ta;


public class Test002 {
    public static void main(String[] args) {
        Husband liZiHao = new Husband();
        liZiHao.name = "李子昊";
        Wife liManMan = new Wife();
        liManMan.name = "李漫漫";
        liZiHao.wife = liManMan;
        liManMan.husband = liZiHao;
        System.out.println(liZiHao.name + "的妻子名字：" + liZiHao.wife.name);
        System.out.println(liZiHao.name + "的妻子名字：" + liManMan.name);
    }
}
