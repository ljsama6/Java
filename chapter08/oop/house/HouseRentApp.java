package chapter08.oop.house;

import chapter08.oop.house.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("退出了房屋出租系统...");
    }
}
