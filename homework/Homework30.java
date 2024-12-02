package homework;

class Computer {
    private String CPU;
    private String RAM;
    private String HDD;
    public Computer(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }
    public String getDetail() {
        return "CPU = " + CPU + "\n" + "RAM = " + RAM + "\n" + "HDD = " + HDD;
    }
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public String getRAM() {
        return RAM;
    }
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    public String getHDD() {
        return HDD;
    }
    public void setHDD(String HDD) {
        this.HDD = HDD;
    }
}
class PC extends Computer {
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public PC(String CPU, String RAM, String HDD, String brand) {
        super(CPU, RAM, HDD);
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println("=======PC信息=======");
        System.out.println(getDetail() + "\n品牌 = " + brand);
    }
}
class NotePad extends PC {
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public NotePad(String CPU, String RAM, String HDD, String brand , String color) {
        super(CPU, RAM, HDD, brand);
        this.color = color;
    }
}


public class Homework30 {
    public static void main(String[] args) {
        PC pc = new PC("i5-13500HX", "16GB", "1TB", "宏碁");
        pc.printInfo();
    }
}
