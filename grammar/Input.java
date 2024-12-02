package grammar;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        //Scanner类 表示 简单文本扫描器,在java.util 包
        Scanner myScanner = new Scanner(System.in);
        //接受用户的输入,使用的是相关的方法
        System.out.println("请输入您的姓名:");
        String name = myScanner.next(); //接收信息
        System.out.println("请输入您的年龄:");
        int age = myScanner.nextInt();
        System.out.println("请输入您的大致月薪:");
        Double sal = myScanner.nextDouble();
        System.out.println("信息如下:");
        System.out.println("姓名:"+name+" 年龄:"+age+" 大致月薪:"+sal);

    }
}
