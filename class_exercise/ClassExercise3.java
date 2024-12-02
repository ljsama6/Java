package class_exercise;

public class ClassExercise3 {
    public static void main(String[] args){
        int a = 3;
        int b = 0;
        int res = 0;
        if (a > b){
            res=a++;
        }
        else{
            res=--b;
        }
        System.out.println(res);
    }
}
