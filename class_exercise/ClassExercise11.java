package class_exercise;
import java.util.Scanner;

public class ClassExercise11 {
    public static void main(String[] args){
        //打印1-100
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
        System.out.println("======================");
        //计算1-100的和
        int j = 1;
        int sum1 = 0;
        do {
            sum1+=j;
            j++;
        } while (j <= 100);
        System.out.println("1-100的和为:" + sum1);
        System.out.println("======================");
        //统计1-200之间能被5整除但不能被3整除的个数
        int k = 1;
        int num = 0;
        do {
            if (k % 5 == 0 && k % 3 != 0){
                num++;
            }
            k++;
        } while (k <= 200);
        System.out.println("1-200之间能被5整除但不能被3整除的个数为:" + num + "个");
        System.out.println("======================");
        //如果李三不还钱，贼老韩将一直使出五连鞭，直到李三说还钱为止
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("吃俺老韩闪电五连鞭！");
            System.out.println("老韩问:\"还钱吗\"(y/n):");
            answer = myScanner.next().charAt(0);
        } while (answer != 'y');
            System.out.println("有借有还，再借不难~");

    }
}
