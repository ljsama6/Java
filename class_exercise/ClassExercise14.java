package class_exercise;

public class ClassExercise14 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                sum = i * j;
                System.out.print(j + "*" + i + "=" + sum + "\t");
            }
            System.out.println();
        }
    }
}
