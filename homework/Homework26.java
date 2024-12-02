package homework;

class Employee {
    String name;
    char gender;
    int age;
    String job;
    double sal;
    public Employee(String name,char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }
    public Employee(String name, char gender, int age, String job, double sal) {
        this(name, gender, age);
        //this(job, sal) X this构造器只能用于第一行
        this.job = job;
        this.sal = sal;
    }
}

public class Homework26 {
    public static void main(String[] args) {

    }
}
