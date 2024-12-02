package grammar;

import java.util.Scanner;

public class Class {
    //定义类
    static class Cat {
        String name;
        int age;
        String skin;
        double weight;
    }
    public static void main(String[] args){
        //定义函数并赋值
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.skin = "白色";
        cat1.weight = 10;
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.skin = "花色";
        cat2.weight = 20;
        //问用户查看猫的信息
        Scanner myScanner = new Scanner(System.in);
        System.out.println("想要查看的猫(小白/小花):");
        String name = myScanner.next();
        //判断并输出
        if (name.equals("小白")){
            System.out.println("名字:" + cat1.name + " " + "年龄:" + cat1.age
                                + "岁" + " " + "颜色:" + cat1.skin + " " + "体重:" + cat1.weight + "kg");
        } else if (name.equals("小花")) {
            System.out.println("名字:" + cat2.name + " " + "年龄:" + cat2.age
                    + "岁" +" " + "颜色:" + cat2.skin + " " +"体重:" + cat2.weight + "kg");
        } else {
            System.out.println("您输入的名称未录入");
        }
    }
}
