package class_exercise;

public class ClassExercise5 {
    public static void main(String[] args){
        double num1 = 15.0;
        double num2 = 15.0;
        if (num1 > 10.0 && num2 < 20.0){
            System.out.println("两个数之和="+(num1+num2));
        }
        int num3 = 10;
        int num4 = 20;
        int sum = num3+ num4;
        if (sum % 3 == 0 && sum % 5 == 0){
            System.out.println("该");
        }
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year & 400) == 0){
            System.out.println("是闰年");
        }
        else {
            System.out.println("不是闰年");
        }
    }
}
