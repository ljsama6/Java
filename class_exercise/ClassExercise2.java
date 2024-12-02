package class_exercise;

public class ClassExercise2 {
    public static void main(String[] args){
        //定义变量华氏温度
        double fahrenheit = 1234.6;
        //转换为摄氏温度的公式
        double centigrade = 5.0 / 9 * (fahrenheit - 100);
        System.out.println("华氏温度为:"+fahrenheit+"℉");
        System.out.println("对应的摄氏温度为:"+centigrade+"℃");
    }
}
