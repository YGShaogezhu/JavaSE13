package Array.ImportantWork;

import java.util.Arrays;

public class Hotel {


    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "标准间", true);
                } else if (i == 2) {
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "豪华房", true);
                }
            }
        }
    }
    
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            //换行
            System.out.println();
        }
    }

    /**
     * 订房方法
     * @param roomNo
     */
    public void order(int roomNo) {
        //订房是将房间对象的status由true修改为false
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(false);
        System.out.println("已预定");
    }

    /**
     * 退房方法
     * @param roomNo
     */
    public void exit(int roomNo) {
        //订房是将房间对象的status由true修改为false
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(true);
        System.out.println("已退订");
    }

    public void duibi(int roomNo) {
        //退房时对比房间是否处于空闲状态
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        if (room.getStatus() == true) {
            System.out.println("可以退房");
        } else if (room.getStatus() == false) {
            System.out.println("此房间处于空闲状态，不可退订");
        }

    }
}
