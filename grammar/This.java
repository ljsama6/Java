package grammar;

class T {
    String name;
    int age = 90;
    int num = 100;
    public T() {
        this("jack", 20);
        System.out.println("T() 构造器");
    }
    public T(String name, int age) {
        System.out.println("T(String name, int age) 构造器");
    }
    public void f1() {
        //传统方式(就近原则,先看局部变量中有没有这个变量,有的话就使用局部变量中的值,没有则使用全局变量中的值)
        int num = 200;
        System.out.println("name = " + name + " num = " + num);
        //this访问属性(访问全局变量中的值)
        System.out.println("name = " + this.name + " num = " + this.num);
    }
}

public class This {
    public static void main(String[] args) {
        T t1 = new T();
        t1.f1();
    }
}
