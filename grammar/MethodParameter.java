package grammar;

class CC {
    public void swap (int a, int b) {
        System.out.println("\na和b交换前的值\na=" + a + "\b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\na和b交换后的值\na=" + a + "\b=" + b);
    }
}

public class MethodParameter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        CC obj = new CC();
        obj.swap(10, 20);
        System.out.println("main方法中的 a=" + a + " b=" + b);
    }
}
