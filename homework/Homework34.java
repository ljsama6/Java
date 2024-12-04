package homework;

class Staff {
    private String name;
    private double salary;
    private int salMonth = 12;
    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getSalMonth() {
        return salMonth;
    }
    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }
    public void printSal() {
        System.out.println(name + " 年工资:" + (salary * salMonth));
    }
}
class Worker extends Staff {
    public Worker(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void printSal() {
        System.out.print("工人 ");
        super.printSal();
    }
}
class Peasant extends Staff {
    public Peasant(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void printSal() {
        System.out.print("农民 ");
        super.printSal();
    }
}
class Teacher02 extends Staff {
    private int classDay;
    private double classSal;
    public Teacher02(String name, double salary, int classDay, double classSal) {
        super(name, salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }
    public int getClassDay() {
        return classDay;
    }
    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }
    public double getClassSal() {
        return classSal;
    }
    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
    @Override
    public void printSal() {
        System.out.print("老师 ");
        System.out.println(getName() + " 年工资:" + (getSalary() * getSalMonth()) + " 课时费:" + (classSal * classDay));
    }
}
public class Homework34 {
    public static void main(String[] args) {
        Worker mike = new Worker("Mike", 7000);
        mike.printSal();
        Peasant smith = new Peasant("smith", 5000);
        smith.printSal();
        Teacher02 jack = new Teacher02("Jack", 10000, 20, 500);
        jack.printSal();
    }
}
