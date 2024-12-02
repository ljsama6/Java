package class_exercise;

public class ClassExercise4 {
    public static void main(String[] args){
        System.out.println(2 | 3);
        System.out.println(2 ^ 3);
        System.out.println(-2 | 3);
        System.out.println(-10.5 % 3); //a % b 当a是小数时，公式= a - (int)a / b * b
        int i = 66;
        System.out.println(++i+i);

        String num1 = "666.6";
        double num2 = Double.parseDouble(num1);
        System.out.println(num2);
        char num3 = 'A';
        String num4 = num3 + "";
        System.out.println(num4);
    }
}
