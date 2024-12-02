package homework;

class Music {
    String name;
    int times;
    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }
    public void play() {
        System.out.println("音乐《" + name + "》正在播放中.... 时长为" + times + "秒");
    }
    public String getInfo() {
        return "音乐《" + name + "》时长为" + times + "秒";
    }
}

public class Homework24 {
    public static void main(String[] args) {
        Music music = new Music("人是_", 275);
        music.play();
        System.out.println(music.getInfo());
    }
}
