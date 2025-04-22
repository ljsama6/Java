package chapter10.com.hspedu.static_;

class Student {
    private String name;
    public static int fee = 0;
    public Student(String name) {
        this.name = name;
    }

    public static void payFee(int fee) {
        Student.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有:" + Student.fee);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Student mike = new Student("Mike");
        Student.payFee(5400);
        Student mary = new Student("Mary");
        Student.payFee(6000);
        Student.showFee();
    }
}
