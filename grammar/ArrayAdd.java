package grammar;
import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int nunNew = 0;
        int[] arr1 = {1, 2, 3};
        do {
            int[] arrNew = new int[arr1.length + 1];
            for (int i = 0; i < arr1.length; i++) {
                    arrNew[i] = arr1[i];
            }
            //添加元素
            System.out.println("请选择你想加入的数字:");
            int addNew = myScanner.nextInt();
            arrNew[arrNew.length - 1] = addNew;
            arr1 = arrNew;
            //遍历添加后的数组
            System.out.println("添加后的数组:");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + "\t");
            }
            System.out.println( );
            //询问是否继续
            System.out.println("是否继续添加（y/n）");
            char answer = myScanner.next().charAt(0);
            //输入n，结束循环
            if (answer == 'n'){
                System.out.println("退出循环");
                break;
            }
        } while (true);
    }
}

