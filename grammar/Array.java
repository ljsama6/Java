package grammar;

public class Array {
    public static void main(String[] args){
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        //总体重
        double totalWeight = 0;
        //平均体重
        double avgWeight = 0;
        //遍历鸡的体重，并算出鸡的总体重
        for (int i = 0; i< hens.length; i++){
            System.out.println("第" + (i+1) + "只鸡的体重是" + hens[i] + "kg");
            totalWeight += hens[i];
        }
        avgWeight = totalWeight / hens.length;
        System.out.println("平均体重:" + avgWeight + "kg");
    }
}
