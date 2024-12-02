package chapter08.polyarr_;

public class Teacher extends Person{
    private int salary;
    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String say() {
        return "老师" + super.say() + "薪水:" + salary;
    }
}
