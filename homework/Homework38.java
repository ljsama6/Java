package homework;

class Person02 {
    public void run() {
        System.out.println("Person run");
    }
    public void eat() {
        System.out.println("Person eat");
    }
}
class Student extends Person02 {
    @Override
    public void run() {
        System.out.println("Student run");
    }
    public void studnet() {
        System.out.println("Student study..");
    }
}

public class Homework38 {
    public static void main(String[] args) {
        Person02 p = new Student();
        p.eat();
        p.run();
        Student student = (Student)p;
        student.eat();
        student.run();
        student.studnet();
    }
}
