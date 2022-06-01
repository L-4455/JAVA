package pers.array.work.d2;

import java.util.Scanner;

/**
 * @Author LiZiHao
 * @Date 2022/6/1/15:36
 */
public class Hotel {
    Scanner scanner = new Scanner(System.in);
    private Room[][] rooms;

    public Hotel() {
        /*
         * 101 102 103 104 105 106
         * 201 202 203 204 205 206
         * 301 302 303 304 305 306
         * */
        rooms = new Room[3][6];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", true);
                } else {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "总统房", true);
                }
            }
        }
        System.out.println("欢迎使用本系统");
        while (true) {
            System.out.println("请选择:" + "[1订房][2退房][3查看房间信息][0退出系统]");
            String a = scanner.next();
             /*if (a.equals("1")) {
                System.out.println("要订哪个房?");
                int roomNo = scanner.nextInt();
                orderRoom(roomNo);
            }else if(a.equals("2")){
                System.out.println("要退哪个房?");
                int roomNo = scanner.nextInt();
                exitRoom(roomNo);
            }else if (a.equals("3")) {
                printRoom();
            } else if(a.equals("0")){
                System.out.println("拜拜了您");
                return;
            }else{
                System.out.println("孙子,你输错了");
            }*/
            switch (a) {
                case "1": {
                    System.out.println("要订哪个房?");
                    int roomNo = scanner.nextInt();
                    orderRoom(roomNo);
                    break;
                }
                case "2": {
                    System.out.println("要退哪个房?");
                    int roomNo = scanner.nextInt();
                    exitRoom(roomNo);
                    break;
                }
                case "3":
                    printRoom();
                    break;
                case "0":
                    System.out.println("拜拜了您");
                    return;
                default:
                    System.out.println("孙子,你输错了");
                    break;
            }
        }
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    /**
     * 输出房间信息
     */
    public void printRoom() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }

    /**
     * 订房方法
     *
     * @param roomNo 该方法需要传递订房编号,用房间编号计算出数组的下标.
     */
    public void orderRoom(int roomNo) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (((roomNo / 100) - 1) < rooms.length && ((roomNo % 100) - 1) < rooms[i].length) {
                    Room room = rooms[(roomNo / 100) - 1][(roomNo % 100) - 1];
                    if (room.getState()) {
                        room.setState(false);
                        System.out.println(roomNo + "订房成功!!");
                    } else {
                        System.out.println(roomNo + "订房失败!!房间已被预订");
                    }
                } else {
                    System.out.println("订房失败,房间不存在");
                }
                return;
            }
        }

    }

    /**
     * 退房方法
     *
     * @param roomNo 该方法需要传递退房编号,用房间编号计算出数组的下标.
     */
    public void exitRoom(int roomNo) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (((roomNo / 100) - 1 < rooms.length) && (roomNo % 100) - 1 < rooms[i].length) {
                    Room room = rooms[(roomNo / 100) - 1][(roomNo % 100) - 1];
                    if (!room.getState()) {
                        room.setState(true);
                        System.out.println(roomNo + "退房成功!!");
                    } else {
//                        room.setState(false);
                        System.out.println(roomNo + "退房失败!!房间没有被预定");
                    }
                } else {
                    System.out.println(roomNo + "退房失败!!房间不存在");
                }
                return;
            }
        }
    }
}
