package class_exercise;

import java.util.Scanner;

class BB {
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            return 0;
        }
    }
}

public class ClassExercise22 {
    public static void main(String[] args) {
        System.out.println("=====猴子吃桃=====");
        /*
        猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，
         然后再多吃一个。当到第10天时,想再吃时(即还没吃)，发现只有1个桃子了。问题:最初共多少个桃子?
        */
        BB p = new BB();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("您想查看哪一天桃子的数量(day <= 10):");
        int day = myScanner.nextInt();
        int peachNum = p.peach(day);
        System.out.println("第" + day + "天有" + peachNum + "个桃子");
    }
}
