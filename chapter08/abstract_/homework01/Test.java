package chapter08.abstract_.homework01;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", 01, 9500, 10000);
        CommonEmployee commonEmployee = new CommonEmployee("李四", 02, 6500);
        manager.work();
        commonEmployee.work();
    }
}
