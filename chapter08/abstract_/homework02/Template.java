package chapter08.abstract_.homework02;

public abstract class Template {
    public abstract void job();
    public void caleTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - start));
    }
}
