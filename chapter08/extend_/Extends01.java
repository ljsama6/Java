package chapter08.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.name = "大白";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
        System.out.println("==============================");
        Pupil pupil = new Pupil();
        pupil.name = "小白";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();
    }
}
