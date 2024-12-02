package grammar;

public class ArrayCopy {
    public static void main(String[] args){
        //拷贝新的数组，两个数组之间的数据独立
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        arr2[0] = 100;
        System.out.println("arr2数组的数值：");
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("arr1数组的数值：");
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
