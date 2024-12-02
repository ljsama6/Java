package class_exercise;
import java.util.Scanner;

public class ClassExercise17 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double[] scores = new double[5];
        for (int i = 0; i < scores.length; i++){
            System.out.println("请输入第" + (i+1) + "名同学的成绩:");
            scores[i] = myScanner.nextDouble();
        }
        for (int i = 0; i < scores.length; i++){
            System.out.println("第" + (i+1) + "的成绩为:" + scores[i]);
        }
    }
}
