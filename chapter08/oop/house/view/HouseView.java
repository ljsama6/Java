package chapter08.oop.house.view;

import chapter08.oop.house.domain.House;
import chapter08.oop.house.service.HouseService;
import chapter08.oop.house.utils.Utility;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(2);

    public void listHouses() {
        System.out.println("\n-------房屋列表--------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("\n-------显示完成--------");

    }
    public void addHouse() {
        System.out.println("\n-------添加房屋--------");
        System.out.println("姓名");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址:");
        String address = Utility.readString(16);
        System.out.println("月租");
        int rent = Utility.readInt();
        System.out.println("状态:");
        String state = Utility.readString(3);
        //创建新的house对象,id是系统分配的,用户无法输入/修改
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("\n-------添加成功--------");
        } else {
            System.out.println("\n-------添加失败--------");
        }
    }
    public void delHouse() {
        System.out.println("\n-------删除房屋--------");
        System.out.println("请选择待删除的房屋编号(-1放弃删除):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("\n-------放弃删除--------");
            return;
        }
        char choice = Utility.readConfirmSelection01();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("\n-------删除成功--------");
            } else {
                System.out.println("\n-------编号未知--------");
            }
        } else {
            System.out.println("\n-------放弃删除--------");
            return;
        }
    }
    public void exitHouse() {
        char choice = Utility.readConfirmSelection01();
        if (choice == 'Y') {
            loop = false;
        }
    }
    public void findHouse() {
        System.out.println("\n-------查询房屋信息--------");
        System.out.println("请选择想要查询的的房屋信息:");
        int findId = Utility.readInt();
        House house = houseService.find(findId);
        if (house != null) {
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
            System.out.println(house);
            System.out.println("\n-------查询成功--------");
        } else {
            System.out.println("\n-------编号未知--------");
        }
    }
    public void updateHouse() {
        System.out.println("\n-------修改房屋信息--------");
        System.out.println("请选择想要修改的的房屋信息(-1表示放弃修改):");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("\n-------放弃修改--------");
            return;
        }
        House house = houseService.find(updateId);
        if (house == null) {
            System.out.println("\n-------编号未知--------");
            return;
        }
        System.out.println("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "noname");
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setName(phone);
        }

        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(8, "");
        if (!"".equals(address)) {
            house.setName(address);
        }

        System.out.println("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setName(address);
        }

        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(18, "");
        if (!"".equals(state)) {
            house.setName(state);
        }

        System.out.println("\n-------修改成功--------");
    }
    public void mainMenu() {
        do {
            System.out.println("\n-------房屋出租系统--------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请选择(1-6):");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exitHouse();
                    break;
            }

        } while (loop);
    }
}
