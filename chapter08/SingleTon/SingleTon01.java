package chapter08.SingleTon;

public class SingleTon01 {
    public static void main(String[] args) {
        System.out.println(GirlFriend.getGf());
    }
}

//饿汉式 单例模式
class GirlFriend {
    private String name;
    static GirlFriend gf = new GirlFriend("小白");

    public GirlFriend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static GirlFriend getGf() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
