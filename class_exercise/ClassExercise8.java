package class_exercise;
import java.util.Scanner;
public class ClassExercise8 {
    public static void main(String[] args){
    //分数
    System.out.println("请输入您的成绩：");
    Scanner myScanner = new Scanner(System.in);
    int score = myScanner.nextInt();
        switch ((int)(score / 60)){
            case 1:
                System.out.println("合格");
                break;
            case 0:
                System.out.println("不合格");
                break;
            default:
                System.out.println("请输入一个正确的数字");
        }
    }
}
