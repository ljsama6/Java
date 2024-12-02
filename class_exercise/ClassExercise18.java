package class_exercise;

public class ClassExercise18 {
    public static void main(String[] args){
        char[] arr1 = new char[26];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (char)('A' + i); //加号计算默认是int,无法将int->char,需要强转
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println( );
        System.out.println("========================");
        int index = 0;
        int max = 0;
        int[] arr2 = {4, -1, 9, 10, 23};
        for (int i = 0; i < arr2.length; i++){
            if (max < arr2[i]){
               max = arr2[i];
               index = i;
            }
        }
        System.out.println("最大值是:" + max + " 对应的下标是:" + index);

        System.out.println("========================");
        double[] arr3 = {3, 5, 1, 3.4, 2, 50};
        double avaWeight = 0;
        double sum = 0;
        for (int i = 0 ;i < arr3.length; i++){
            avaWeight = arr3[i] / arr3.length;
            sum += arr3[i];
        }
        System.out.println("和是:" + sum + "平均体重:" + avaWeight);
    }
}
