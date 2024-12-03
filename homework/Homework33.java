package homework;

class Teacher {
    private String name;
    private int age;
    private String post; //职称
    private double salary;
    private double grand; //工资级别.
    public Teacher(String name, int age, String post, double salary, double grand) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grand = grand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getGrand() {
        return grand;
    }

    public void setGrand(double grand) {
        this.grand = grand;
    }
    public void introduce() {
        System.out.println("老师:" + name + " 年龄:" + age + " 职称:" + post + " 工资级别:" + grand + " 基本工资:" + salary);
    }
}
class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grand) {
        super(name, age, post, salary, grand);
    }
    @Override
    public void introduce() {
        System.out.println("=====这是教授的信息=====");
        super.introduce();
    }
}
class AsProfessor extends Teacher {
    public AsProfessor(String name, int age, String post, double salary, double grand) {
        super(name, age, post, salary, grand);
    }
    @Override
    public void introduce() {
        System.out.println("=====这是副教授的信息=====");
        super.introduce();
    }
}
class Division extends Teacher {
    public Division(String name, int age, String post, double salary, double grand) {
        super(name, age, post, salary, grand);
    }
    @Override
    public void introduce() {
        System.out.println("=====这是讲师的信息=====");
        super.introduce();
    }
}

public class Homework33 {
    public static void main(String[] args) {
        Professor professor = new Professor("Mike", 35, "教授", 12345, 1.3);
        professor.introduce();
    }
}
