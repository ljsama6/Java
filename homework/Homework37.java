package homework;

import java.util.Objects;

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;
    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (! (obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor)obj;
        return this.name.equals(doctor.name) && this.age == doctor.age && this.job.equals(doctor.job) &&
                this.gender == doctor.gender && this.sal == doctor.sal;

    }
}

public class Homework37 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Mike", 25, "程序员", '男', 12000);
        Doctor doctor2 = new Doctor("Mike", 26, "程序员", '男', 12000);
        System.out.println(doctor1.equals(doctor2));
    }
}
