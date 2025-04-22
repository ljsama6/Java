package chapter08.SingleTon;

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        System.out.println(Cat.getCat());
    }
}

//懒汉式 单例模式
class Cat {
    private String name;
    public static int n1 = 100;
    private static Cat cat;

    public Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getCat() {
        if (cat == null) {
            cat = new Cat("小红");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}