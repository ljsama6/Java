package grammar;

//提高代码复用性
//可以将视线的细节封装起来，供其他用户来调用
class Arr {
    public void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Method2 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1},
                       {1, 1, 1},
                       {2, 2, 2}};
        Arr arr1 = new Arr();
        arr1.printArr(arr);
    }
}
