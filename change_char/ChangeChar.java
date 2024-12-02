package change_char;

public class ChangeChar {
    public static void main(String[] args){
        //转义字符的类型..
        //1.\t:一个制表位，实现对齐的功能
        System.out.println("-------------------");
        System.out.println("福建省\t泉州市\t晋江市");
        System.out.println("-------------------");
        //2.\n:换行符
        System.out.println("福建省\n泉州市\n晋江市");
        System.out.println("-------------------");
        //3.\\:一个\
        System.out.println("福建省\\泉州市\\晋江市");
        System.out.println("-------------------");
        //4.\":一个"
        System.out.println("福建省\"泉州市\"晋江市");
        System.out.println("-------------------");
        //5.\':一个'
        System.out.println("福建省\'泉州市\'晋江市");
        System.out.println("-------------------");
        //6.\r:一个回车
        System.out.println("福建省\r泉州市\r晋江市");
        System.out.println("-------------------");
        //回车+换行=换行
        System.out.println("福建省\r\n泉州市\r\n晋江市");
        System.out.println("-------------------");
        //课堂小测
        System.out.println("书名 \t作者 \t价格 \t销量 \n三国 \t罗贯中 \t120 \t1000");
    }
}
