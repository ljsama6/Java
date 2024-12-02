package class_exercise;

public class ClassExercise {
    public static void main(String[] args){
        int num = 1;
        System.out.println("1~100之间所有能被3整除的数:");
        while (num <= 100){
            if (num % 3 == 0){
                System.out.println(num);
            }
            num++;
        }
        System.out.println("================");
        int num2 = 40;
        while (num2 <= 200){
            if (num2 % 2 == 0){
                System.out.println(num2);
            }
            num2++;
        }
    }
}
