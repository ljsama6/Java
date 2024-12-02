package chapter08.polyarr_;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String mike, int age, String javaEE工程师) {
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
        return " 姓名:" + name + " 年龄:" + age;
    }
}
