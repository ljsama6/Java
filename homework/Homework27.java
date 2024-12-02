package homework;

class Circle01 {
    double radius;
    public Circle01(double radius) {
        this.radius = radius;
    }
    //返回面积
    public double findArea() {
        return Math.PI * radius * radius;
    }
    //修改对象的半径
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle01 c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i); //修改c 对象的半径
            System.out.println(i + "\t" + c.findArea());
            c.findArea();
        }
    }
}

public class Homework27 {
    public static void main(String[] args) {
        Circle01 c = new Circle01(5.5);
        System.out.println("圆的面积为 = " + c.findArea());
        PassObject po = new PassObject();
        po.printAreas(c, 5);
    }
}
