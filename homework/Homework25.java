package homework;

class Method {
    public double method(double num1, double num2) {
        System.out.println(method(method(10.0, 20.0), 100));
        return 0;
    }
}

public class Homework25 {
    public static void main(String[] args) {
        Method method = new Method();
        method.method(1,2);
    }
}
