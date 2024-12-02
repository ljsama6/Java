package homework;

import chapter08.polyarr_.Person;

import java.util.Arrays;

class Person01 {
    private String name;
    private int age;
    private String job;
    public Person01(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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
    @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

public class Homework32 {
    public static void main(String[] args) {
        Person01[] person01 = new Person01[3];
        Person01 temp = null;
        person01[0] = new Person01("Mike", 25, "JavaEE工程师");
        person01[1] = new Person01("Jake", 22, "大数据工程师");
        person01[2] = new Person01("Tom", 23, "大数据工程师");
        System.out.println("排序前的效果:");
        for (int i = 0; i < person01.length; i++) {
            System.out.println(person01[i]);
        }
        for (int i = 0; i < person01.length - 1; i++) {
            for (int j = 0; j < person01.length - 1 - i; j++) {
                if (person01[j].getAge() < person01[j + 1].getAge()) {
                    temp = person01[j];
                    person01[j] = person01[j + 1];
                    person01[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的效果(按照年龄从大到小):");
        for (int i = 0; i < person01.length; i++) {
            System.out.println(person01[i]);
        }
        for (int i = 0; i < person01.length - 1; i++) {
            for (int j = 0; j < person01.length - 1 - i; j++) {
                if (person01[j].getName().length() < person01[j + 1].getName().length()) {
                    temp = person01[j];
                    person01[j] = person01[j + 1];
                    person01[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的效果(按照名称长度从大到小):");
        for (int i = 0; i < person01.length; i++) {
            System.out.println(person01[i]);
        }
    }
}
