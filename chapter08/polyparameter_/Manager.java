package chapter08.polyparameter_;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage() {
        System.out.println("经理:" + getName() + "正在管理员工...");
    }
    public double getAnnual(Employee e) {
        return getSalary() * 12;
    }
}
