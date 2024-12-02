package class_exercise;

public class ClassExercise26 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("ljs");
        account.setBalance(22);
        account.setPassword("666666");
        account.showInfo();
    }
}

class Account {
    private String name = "";
    private double balance;
    private String password;
    public Account() {
    }

    public Account(String name, double balance, String password, int len) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对,需要(2-4)的字符长度");
            this.name = "无名";
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
            this.balance = 0;
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码长度必须为6位数");
            this.password = "000000";
        }
    }
    public void showInfo() {
        System.out.println("姓名:" + name + " 余额:" + balance + " 密码:" + password);
//        if () {
//            System.out.println("姓名:" + name + " 余额:" + balance + " 密码:" + password);
//        } else {
//            System.out.println("你无权查看......");
//        }

    }
}
