package class_exercise;

class Person {
    int age;
    String name;
    public Person() {
        age = 18;
    }
    public Person(String pname,int page) {
        name = pname;
        page = age;
    }
}

public class ClassExercise24 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("p1的信息: name = " +  p1.name +" " + "age = " + p1.age);
        Person p2 = new Person("zhangsan", 19);
        System.out.println("p2的信息: name = " + p2.name + " " + "age = " + p2.age);
    }
}
