package chapter08.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("普通员工:" + getName() + "正在努力干活...");
    }
    public double getAnnual(Employee e) {
        return getSalary() * 12;
    }
}
