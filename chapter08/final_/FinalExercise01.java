package chapter08.final_;

import java.util.Scanner;

class Circle {
    private double radius;
    private final double PI = 3.14;
//    private final double PI;
//    {
//        PI = 3.14;
//    }
    public Circle(double radius) {
        this.radius = radius;
        //PI = 3.14
    }

    public double area() {
        return radius * radius * PI;
    }
}

public class FinalExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("圆的面积为" + circle.area() + "㎡");
    }
}
