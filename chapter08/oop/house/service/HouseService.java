package chapter08.oop.house.service;

import chapter08.oop.house.domain.House;
import chapter08.oop.house.utils.Utility;

public class HouseService {
     //记录当前有多少个房屋信息
    private House[] houses;
    private House[] newHouses;
    private int houseNums = 1;
    private int idCounter = 1;
    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "131", "晋江市", 2000, "未出租");
    }

    public boolean add(House newHouse) {
        int newSize;
        if (houseNums == houses.length) {
            char choice = Utility.readConfirmSelection02();
            if (choice == 'Y') {
                System.out.println("想扩容至多少个空位?:");
                newSize = Utility.readInt();
                newHouses = new House[newSize];
                for (int i = 0; i < houses.length; i++) {
                    newHouses[i] = houses[i];
                }
                houses = newHouses;
                houses[houseNums++] = newHouse;
                newHouse.setId(++idCounter);
                return true;
            } else {
                return false;
            }
        }
        //将newHouse对象加入到houses数组中，新增一个房屋信息
        houses[houseNums++] = newHouse;
        //id自增长，更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId) {
        int index = -1;
        //需要指向数组数据的下标，而不是简单的房屋编号
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public House find(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
            return null;
    }

    public House[] list() {
        return houses;
    }
}
