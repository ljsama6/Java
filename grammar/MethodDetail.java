package grammar;

class AA {
    //一个方法最多有一个返回值 [如果要返回多个值，可以采用返回数组的方式]
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }
}

public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("和= " + res[0]);
        System.out.println("差= " + res[1]);
    }
}
