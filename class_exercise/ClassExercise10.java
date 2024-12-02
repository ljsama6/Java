package class_exercise;

public class ClassExercise10 {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i%9==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("1-100中能被9整除的有:"+count+"个  "+"总和为:"+sum);

        for (int i = 0, j = 5; i <= 5; i++, j--){
            System.out.println(i + " + " + j + " = " + ( i + j ));
        }
    }
}
