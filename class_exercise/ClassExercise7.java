package class_exercise;
import java.util.Scanner;

public class ClassExercise7 {
    public static void main(String[] args) {
        System.out.println("请输入想转换成大写的字母(a-e)");
        Scanner myScanner = new Scanner(System.in);
        char words = myScanner.next().charAt(0);
        switch (words) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("ohther");
        }
    }
}
