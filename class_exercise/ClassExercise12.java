package class_exercise;
import java.util.Scanner;

public class ClassExercise12 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int score = 0;
        int sum = 0;
        int gSum = 0;
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 5; j++){
                System.out.println("请输入第" + i + "个班级" + "第" + j + "位同学的成绩:");
                score = myScanner.nextInt();
                sum += score;
                gSum += score ;
            }
            System.out.println(i + "班的总分:" + sum + "平均分:" + (sum / 5));
            sum = 0;
        }
        System.out.println("年级的总分:" + gSum + "平均分:" + (gSum / 15));
    }
}
