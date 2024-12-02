package grammar;
import java.util.Scanner;

public class If {
    public static void main(String[] args){
        boolean isPass = false;
        if (isPass == true) {
            System.out.println("考试通过！");
        } else {
            System.out.println("考试未通过,请等待后续补考.");
        }
        //输入语句
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的芝麻信用分:");
        //输入您的信用分
        int zmscore = myScanner.nextInt();
        //判断信用程度
        if (zmscore >= 1 && zmscore <= 100){
            if (zmscore == 100){
                System.out.println("信用极好");
            }
            else if (zmscore > 80 && zmscore <= 99){
                System.out.println("信用优秀");
            }
            else if (zmscore >= 60 && zmscore <= 80){
                System.out.println("信用一般");
            } else {
                System.out.println("信用不合格");
            }
        } else {
            System.out.println("请输入一个1~100的整数");
        }
    }
}
