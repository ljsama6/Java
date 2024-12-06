package homework;

class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
class LabeledPoint extends Point {
    private String label;
    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public void printInfo() {
        System.out.println(label + " " + getX()+ " " + getY());
    }
}


public class Homework36 {
    public static void main(String[] args) {
        LabeledPoint black = new LabeledPoint("Black", 1929, 230.07);
        black.printInfo();
    }
}
