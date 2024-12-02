package grammar;
import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        do {
            for (int i = 0; i < arr1.length; i++){
                arr2[i] = arr1[i];
            }
            //缩减元素
            System.out.println("是否要对该数组进行缩减？（y/n）");
            char answer = myScanner.next().charAt(0);
            if (answer == 'y'){
                arr2 = new int[arr1.length - 1];
                for (int i = 0;i < arr1.length - 1; i++){
                    arr2[i] = arr1[i];
                }
                arr1 = arr2;
                for (int i = 0; i < arr1.length; i++){
                    System.out.print(arr1[i] + "\t");
                }
                System.out.println( );
                if (arr1.length == 1){   //元素长度为1时
                        System.out.println("不能再缩减了");
                        System.out.println("该数组情况:");
                        arr1 = arr2;
                        for (int i = 0; i < arr1.length; i++){
                            System.out.print(arr1[i] + "\t");
                        }
                        break;
                }
            } else {
                System.out.println("该数组情况:");
                arr1 = arr2;
                for (int i = 0; i < arr1.length; i++){
                    System.out.print(arr1[i] + "\t");
                }
                break;
            }
        }while (true);
    }
}
