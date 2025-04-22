package chapter08.interface_.In01;

public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机工作中...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作...");
    }
}
