package chapter08.interface_.In01;

public class Inerface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();

        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("====================");
        computer.work(camera);
    }
}
