package chapter08.interface_.In02;

public class DBMysql implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接Mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭Mysql");
    }
}
