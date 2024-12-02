package chapter08;

public class Encap01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");;
        person.setAge(20);
        person.setSalary(30000);
        person.setJob("程序员");
        System.out.println(person.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;
    private String job;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对,需要(2-6)的字符长度");
            this.name = "无名";
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            this.age = 20;
        }
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String info() {
        return "姓名:" + name + " 年龄:" + age + " 薪水:" + salary + " 职位:" + job;
    }
}
