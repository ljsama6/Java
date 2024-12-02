package homework;
import java.util.Random;
import java.util.Scanner;

class Tom {
    //玩家出拳的类型
    int tomGuessNum;
    //电脑出拳的类型
    int comGuessNum;
    //玩家赢的次数
    int winCountnum;
    //比赛的次数
    int count = 1;
    public void showInfo() {

    }
    public int computerNum() {
        Random r = new Random();
        int comGuessNum = r.nextInt(3);
        this.comGuessNum = comGuessNum;
        return comGuessNum;
    }
    public void setTomGuessNum(int tomGuessNum) {
        if (tomGuessNum > 2 || tomGuessNum < 0) {
            System.out.println("数字输入错误");
        }
        this.tomGuessNum = tomGuessNum;
    }
    public int getTomGuessNum() {
        return tomGuessNum;
    }
    public String vsComputer() {
        if (tomGuessNum == comGuessNum) {
            return "平局";
        } else if (tomGuessNum == 2 && comGuessNum == 0) {
            return "你赢了";
        } else if (tomGuessNum == 0 && comGuessNum == 1) {
            return "你赢了";
        } else if (tomGuessNum == 1 && comGuessNum == 2) {
            return "你赢了";
        } else {
            return "你输了";
        }
    }
    public int winCount(String s) {
        count++;
        if (s.equals("你赢了")) {
            winCountnum++;
        }
        return winCountnum;
    }
}

public class Homework28 {
    public static void main(String[] args) {
        Tom t = new Tom();
        int isWinCount = 0;
        int[][] arr1 = new int[3][3];
        int j = 0;
        String[] arr2 = new String[3];
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //获取玩家出的拳
            System.out.println("请输入(0——石头,1——剪刀,2——布):");
            int userNum = myScanner.nextInt();
            t.setTomGuessNum(userNum);
            int tomGuess = t.getTomGuessNum();
            arr1[i][j + 1] = tomGuess;
            //获取电脑出的拳
            int comGuess = t.computerNum();
            arr1[i][j + 2] = comGuess;
            //将玩家猜的拳与电脑做比较
            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;
            System.out.println("=============================================");
            System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
            System.out.println(t.count + "\t" + tomGuess + "\t\t\t" + comGuess + "\t\t\t" + isWin);
            System.out.println("=============================================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
        }

        //对游戏的最终结果进行输出
        System.out.println("局数\t\t\t玩家的出拳\t电脑的出拳\t输赢情况");
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1[a].length; b++) {
                System.out.print(arr1[a][b] + "\t\t\t");
            }
            System.out.println(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + isWinCount + "次");
    }
}
