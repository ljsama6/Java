package homework;

class Cale {
    double num1;
    double num2;
    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //求和
    public double sum() {
        return this.num1 + this.num2;
    }
    //差
    public double subtraction() {
        return this.num1 - this.num2;
    }
    //乘
    public double multiplication() {
        return this.num1 * this.num2;
    }
    //商
    public double division() {
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("不能为零");
            return 0;
        } else {
            return this.num1 / this.num2;
        }
    }
}

public class Homework21 {
    public static void main(String[] args) {
        Cale cale = new Cale(5, 0);
        System.out.println("和 = " + cale.sum());
        System.out.println("差 = " + cale.subtraction());
        System.out.println("乘 = " + cale.multiplication());
        if (cale.division() != 0) {
            System.out.println("商 = " + cale.division());
        } else {
        }
    }
}
