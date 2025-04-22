package chapter08.abstract_;

class B extends A {
    @Override
    public void hi() {
        System.out.println("Hello");
    }
}

abstract class A {
    public abstract void hi();
}

public class AbstractDetail01 {
    public static void main(String[] args) {
        new B().hi();
    }
}
