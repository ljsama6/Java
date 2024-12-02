package class_exercise;
import java.util.Scanner;

public class ClassExercise13 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int score = 0;
        int num = 0;
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 5; j++){
                System.out.println("请输入第" + i + "个班级" + "第" + j + "位同学的成绩:");
                score = myScanner.nextInt();
                if (score >= 60){
                    num++;
                }
            }
        }
        System.out.println("年级中及格的人数有:" + num);
    }
}
