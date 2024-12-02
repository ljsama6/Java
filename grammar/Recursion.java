package grammar;

class Mytools {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
//阶乘
public class Recursion {
    public static void main(String[] args) {
        Mytools f = new Mytools();
        System.out.println(f.factorial(5));
    }
}
