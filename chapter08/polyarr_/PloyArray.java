package chapter08.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("tende", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 19, 80);
        persons[3] = new Teacher("scott", 31, 20000);
        persons[4] = new Teacher("king", 28, 17000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
        }
    }
}
