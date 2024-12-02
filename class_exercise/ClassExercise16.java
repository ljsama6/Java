package class_exercise;
import java.util.Scanner;

public class ClassExercise16 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
            if (sum > 20){
                System.out.println("i=" + i);
                break;
            }
        }
        //登录验证
        Scanner myScanner = new Scanner(System.in);
        for (int i = 2; i >= 0; i--){
            String name = " ";
            int pd = 0;
            System.out.println("请输入您的用户名:");
            name = myScanner.next();
            System.out.println("请输入您的密码:");
            pd = myScanner.nextInt();
            //name表示变量
            //name.equals用于比较输入的文字是否符合标准,用于String的判断
            //推荐使用"xxx".equals(name) 这个可以避免空指针
            if ("丁真".equals(name) && pd == 666){
                System.out.println("登录成功!");
                break;
            }
            System.out.println("您还有" + i + "次登录机会" );
        }
    }
}
