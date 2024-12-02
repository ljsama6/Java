package grammar;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        System.out.println("请输入一个字母(a~g):");
        Scanner myScanner = new Scanner(System.in);
        char week = myScanner.next().charAt(0);
        switch (week){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的字母不在范围内");
        }
        System.out.println("退出了switch,继续执行");
    }
}
