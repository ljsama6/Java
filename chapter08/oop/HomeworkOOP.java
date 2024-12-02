package chapter08.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeworkOOP {
    boolean loop = true;
    Scanner myScanner = new Scanner(System.in);
    String key = "";
    String details = "-------零钱通明细--------";
    double balance = 0;
    double money = 0;
    Date date = null;
    String note = "";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    public void mainMemu() {
        do {
            System.out.println("\n-------零钱通菜单--------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");
            System.out.println("请选择(1-4):");
            key = myScanner.next();
            switch (key) {
                case "1" :
                    this.details();
                    break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                    this.exit();
                    break;
            }
        }while(loop);
    }
    public void details() {
        System.out.println(details);
    }
    public void income() {
        System.out.println("收益入账金额:");
        money = myScanner.nextDouble();
        if (money <= 0) {
            System.out.println("请输入收益金额为大于0的数");
            return; //退出方法不再执行后面的代码
        }
        balance += money;
        date = new Date();
        details += "\n收益入账 " + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
    }
    public void pay() {
        System.out.println("消费金额:");
        money = myScanner.nextDouble();
        if (money <= 0) {
            System.out.println("请输入消费金额为大于0的数");
            return;
        }
        balance -= money;
        if (balance < 0) {
            System.out.println("余额不足");
            return;
        }
        System.out.println("消费说明:");
        note = myScanner.next();
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
    }
    public void exit() {
        //建议一段代码是一个功能，不能混在一起
        char choice = ' ';
        //判断输入的是否是y/n其中一个
        while(true) {
            System.out.println("确定要退出吗? (y/n)");
            choice = myScanner.next().charAt(0);
            if (choice == 'y' || choice == 'n') {
                break;
            } else {
                System.out.println("请输入y/n");
            }
        }
        //判断确定要退出系统
        if (choice == 'y') {
            loop = false;
        }
    }
}
