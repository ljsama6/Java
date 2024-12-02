package grammar;

public class ArrayReverse2 {
    public static void main(String[] args){
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr1.length];
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++){
            arr2[j] = arr1[i];
        }
        System.out.println("arr2的情况:");
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("arr1的情况:");
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
