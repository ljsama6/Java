package class_exercise;

class Person2 {
    String name;
    int age;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person2 p) {
        if (this.age == p.age && this.name.equals(p.name)){
            return true;
        } else {
            return false;
        }
    }
}

public class ClassExercise25 {
    public static void main(String[] args) {
        Person2 TestPerson1 = new Person2("Jack", 19);
        Person2 TestPerson2 = new Person2("Mary", 19);
        System.out.println("比较的结果:" + TestPerson1.compareTo(TestPerson2));
    }
}
