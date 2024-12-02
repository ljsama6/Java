package class_exercise;
import java.util.Scanner;

public class ClassExercise6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("=====歌手比赛初赛=====");
        //输入分数
        System.out.println("请输入您的初赛分数(1~10):");
        double score = myScanner.nextDouble();
        if (score > 8.0){
            //输入性别
            System.out.println("请输入您的性别(男/女):");
            char gender = myScanner.next().charAt(0);
            if (gender == '男'){
                System.out.println("恭喜您进入男子组决赛");
            } else if (gender == '女') {
              System.out.println("恭喜您进入女子组决赛");
            } else {
                System.out.println("请输入正确的性别");
            }
        } else {
            System.out.println("很遗憾，您没有进入决赛");
        }
    }
}
