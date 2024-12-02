package class_exercise;

//可变参数应用.
class HspMethod {
    public String showScore(String name, int... score) {
        int res = 0;
        for (int i = 0; i < score.length; i++) {
            res += score[i];
        }
        return "姓名:" + name + " " + score.length + "门" + "成绩总分:" + res;
    }
}

public class ClassExercise23 {
    public static void main(String[] args) {
        HspMethod a = new HspMethod();
        System.out.println(a.showScore("张三", 12, 20, 30, 50 ));
    }
}
