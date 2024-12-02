package chapter08.polyparameter_;

public class PloyParameter {
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不进行操作...");
        }
    }
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 5000);
        Manager smith = new Manager("smith", 8500, 20000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(smith);
        ployParameter.testWork(tom);
        ployParameter.testWork(smith);
    }
}
