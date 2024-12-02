package class_exercise;

import java.util.Scanner;

// 1 1 2 3 5 8
class AA {
    public int factorial(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return factorial(n - 1) + factorial(n - 2);
            }
        } else {
            System.out.println("要求数字是大于零的整数!");
            return 0;
        }
    }
}

public class ClassExercise21 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("=====斐波那契数=====");
        System.out.println("请输入一个数字:");
        int num = myScanner.nextInt();
        AA f = new AA();
        System.out.println(f.factorial(num));
        System.out.println("=====猴子吃桃=====");
    }
}
