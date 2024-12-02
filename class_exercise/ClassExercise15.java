package class_exercise;

public class ClassExercise15 {
    public static void main(String[] args){
        int totalLevel = 8;
        for (int i = 1; i <= totalLevel; i++){
                for (int j = totalLevel; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++){
                    if ( k == 1 || k == 2 * i - 1 || i == totalLevel){
                        System.out.print("*");
                    } else {
                      System.out.print(" ");
                    }
                }
            System.out.println( );
        }
    }
}
