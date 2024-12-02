package class_exercise;

class Person01 {
    private String name;
    private int age;
    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String say() {
       return  "我的名字叫" + name + "，今年" + age + "岁了";
    }
}
class Student extends Person01 {
    private int id;
    private double score;
    public Student(String name, int age) {
        super(name, age);
    }
    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String say() {
        return super.say() + "  ID:" + id + "分数:" + score;
    }
}

public class ClassExercise27 {
    public static void main(String[] args) {
        Student student = new Student("小明", 18);
        System.out.println(student.say());
    }
}
