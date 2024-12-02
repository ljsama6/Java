package grammar;

public class Multipleloops {
    public static void main(String[] args){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("内部循环 i=" + i + " j=" + j);
            }
        }
    }
}
