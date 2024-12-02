package grammar;

public class TwoDimensionalArray02 {
    public static void main(String[] args){

        int[][] arr = new int[3][]; //创建二维数组，一个有3个一维数组，但是每个一维数组还没开数据空间

        //遍历arr每个一维数组
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[i + 1]; //给每个一维数组开空间 new
            //如果没有给一维数组new，拿么arr[i]就是null
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = i + 1; //赋值
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
