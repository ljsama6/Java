package homework;

class Student01 extends Person03{
    private String stu_id;
    public Student01(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
    public String getStu_id() {
        return stu_id;
    }
    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study() {
        System.out.println("我承诺，我会好好学习");
    }
    @Override
    public String play() {
        return super.play() + "足球";
    }
    public void printInfo() {
        System.out.println("学生的信息:");
        System.out.println(super.basicInfo());
        System.out.println("学号:" + stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return super.toString() + "Student01{" +
                "stu_id='" + stu_id + '\'' +
                '}';
    }
}
class Teacher01 extends Person03{
    private int work_age;
    public Teacher01(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public int getWork_age() {
        return work_age;
    }
    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }
    @Override
    public String play() {
        return super.play() + "象棋";
    }
    public void printInfo() {
        System.out.println("老师的信息:");
        System.out.println(super.basicInfo());
        System.out.println("工龄:" + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher01{" +
                "work_age=" + work_age +
                '}';
    }
}
class Person03 {
    private String name;
    private char sex;
    private int age;
    public Person03(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String play() {
        return name + "爱玩";
    }
    public String basicInfo() {
        return "姓名:" + name + " 年龄:" + age + " 性别" + sex;
    }
    @Override
    public String toString() {
        return "Person03{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

public class Homework39 {
    public void test(Person03 p) {
        if (p instanceof Student01) {
            ((Student01) p).study();
        } else if (p instanceof Teacher01) {
            ((Teacher01) p).teach();
        } else {
            System.out.println("do nothing");
        }
    }
    public void bubbleSort(Person03[] person03s) {
        Person03 temp = null;
        for (int i = 0; i < person03s.length - 1; i++) {
            for (int j = 0; j < person03s.length - i - 1; j++) {
                if (person03s[j].getAge() > person03s[j + 1].getAge()) {
                    temp = person03s[j];
                    person03s[j] = person03s[j + 1];
                    person03s[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Person03[] person03s = new Person03[4];
        person03s[0] = new Student01("Jack", '男', 21, "0001");
        person03s[1] = new Student01("Smith", '女', 20, "0002");
        person03s[2] = new Teacher01("Mike", '男', 29, 2);
        person03s[3] = new Teacher01("Tom", '男', 30, 3);
        System.out.println("=====排序前的数组=====");
        for (int i = 0; i < person03s.length; i++) {
            System.out.println(person03s[i]);
        }
        Homework39 homework39 = new Homework39();
        homework39.bubbleSort(person03s);
        System.out.println("=====排序后的数组=====");
        for (int i = 0; i < person03s.length; i++) {
            System.out.println(person03s[i]);
        }
        System.out.println("================");
        for (int i = 0; i < person03s.length; i++) {
            homework39.test(person03s[i]);
        }
    }
}
