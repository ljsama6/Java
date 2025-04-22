package chapter08.abstract_.homework02;

public class Sub extends Template{
    private int num;
    @Override
    public void job() {
        for (int i = 0; i < 8000000; i++) {
            num += i;
        }
    }
}
