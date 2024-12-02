package grammar;

//创建方法
class Person {
    String name;
    int age;

    public void speak () {
        System.out.println("我是一个好人");
    }
    public void cal01() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("1+..+1000的和=" + sum);
    }
    //形参
    public void cal02(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("1+..+" + n + "的和=" + sum);
    }
    //两个形参
    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}

public class Method {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak(); //调用方法
        p1.cal01();
        p1.cal02(50);
        //调用getSum方法，把方法getSum 返回的值 赋给 变量returnRes
        int returnSum = p1.getSum(10, 20);
        System.out.println("getSum返回的值=" + returnSum);
    }
}
