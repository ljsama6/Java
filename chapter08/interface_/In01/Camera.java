package chapter08.interface_.In01;

public class Camera implements UsbInterface {
    @Override
    public void start() {
        System.out.println("相机工作中...");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作...");
    }
}
