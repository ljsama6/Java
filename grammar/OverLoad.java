package grammar;

import java.util.Scanner;

class Methods {
    public void m(int n1) {
        System.out.println(n1 * n1);
    }
    public void m(int n1,int n2) {
        System.out.println(n1 * n2);
    }
    public void m(String n1) {
        System.out.println(n1);
    }
    public int max(int n1, int n2) {
        return Math.max(n1, n2);
    }
    public double max(double n1, double n2) {
        return Math.max(n1, n2);
    }
    public double max(double n1, double n2, double n3) {
        double a = Math.max(n1,n2);
        return Math.max(a,n3);
    }
}

public class OverLoad {
    public static void main(String[] args) {
        Methods w = new Methods();
        w.m(2);
        w.m(1,2);
        w.m("666");
        System.out.println(w.max(2,3));
        System.out.println(w.max(1.1,0.9));
        System.out.println(w.max(2.1,0.9,1.1));
    }
}
