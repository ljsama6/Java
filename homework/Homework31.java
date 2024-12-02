package homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Homework31 {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        String details = "-------零钱通明细--------";
        double balance = 0;
        double money = 0;
        Date date = null;
        String note = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
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
                    System.out.println(details);
                    break;
                case "2" :
                    System.out.println("收益入账金额:");
                    money = myScanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("请输入收益金额为大于0的数");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账 " + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;
                case "3" :
                    System.out.println("消费金额:");
                    money = myScanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("请输入消费金额为大于0的数");
                        break;
                    }
                    balance -= money;
                    if (balance < 0) {
                        System.out.println("余额不足");
                        break;
                    }
                    System.out.println("消费说明:");
                    note = myScanner.next();
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;
                case "4" :
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

                    break;
                default:
                    System.out.println("您输入的数字有误,请重新输入(1-4)");
            }
        }while(loop);
        System.out.println("退出了零钱通项目");
    }
}