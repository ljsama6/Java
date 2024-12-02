package class_exercise;

public class ClassExercise19 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[][] = {{4, 6},
                       {1, 4, 5, 7},
                       {-2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println( );
        }
        System.out.println("数组中的元素的和:" + sum);
    }
}