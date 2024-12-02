package grammar;

 class Person01 {
     String name;
     int age;
     public Person01(String pName, int pAge) {
         System.out.println("调用了构造器......");
         name = pName;
         age = pAge;
     }
}

public class Constructor {
    public static void main(String[] args) {
        Person01 p1 = new Person01("小明", 20);
        System.out.println("调用的名称:" + p1.name);
        System.out.println("调用的年龄:" + p1.age);
    }
}
