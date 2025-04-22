package chapter08.abstract_;

//类中存在抽象方法，类也要变为抽象类
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    public void eat() {
//        System.out.println("这是一个动物，但是不知道吃什么..");
//    }
    public abstract void eat();
}

public class Abstract01 {
    public static void main(String[] args) {

    }
}
