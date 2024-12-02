package homework;

class Dog {
    String name;
    String color;
    int age;
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show() {
        System.out.println("狗的名字:" + this.name + " " + "狗的颜色:" + this.color + " " + "狗的年龄:" + this.age);
    }
}

public class Homework23 {
    public static void main(String[] args) {
        Dog dog = new Dog("小白","白色",5);
        dog.show();
    }
}
