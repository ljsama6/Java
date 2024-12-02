package class_exercise;

public class ClassExercise1 {
    public static void main(String[] args){
        //加入还有59天放假，合XX个星期零XX天
        //存放59天
        int days = 59;
        //计算还有多少星期
        int weeks = days / 7;
        //计算剩余天数
        int leftDays = days % 7;
        //打印
        System.out.println("合" + weeks + "个星期零" + leftDays + "天");
    }
}
