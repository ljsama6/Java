package chapter08.polyarr_;

public class Student extends Person{
    private double score;
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String say() {
        return "学生" + super.say() + " 分数:" + score;
    }
}
