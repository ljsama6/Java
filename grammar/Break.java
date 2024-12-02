package grammar;

public class Break {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if (i == 3){
                break;
            }
            System.out.println("ok" + i);
        }
        System.out.println("退出for循环,继续执行");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 10; j++){
                if (j == 2){
                    break;
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
