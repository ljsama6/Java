package homework;

class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double len() {
        return  2 * Math.PI * this.radius;
    }
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

public class Homework22 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("周长 = " + circle.len());
        System.out.println("面积 = " + circle.area());
    }
}
