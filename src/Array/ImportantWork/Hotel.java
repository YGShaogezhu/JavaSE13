package Array.ImportantWork;

import java.util.Arrays;

public class Hotel {


    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "���˼�", true);
                } else if (i == 1) {
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "��׼��", true);
                } else if (i == 2) {
                    rooms[i][j] = new Room((i+1) * 100 + j + 1, "������", true);
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
            //����
            System.out.println();
        }
    }

    /**
     * ��������
     * @param roomNo
     */
    public void order(int roomNo) {
        //�����ǽ���������status��true�޸�Ϊfalse
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(false);
        System.out.println("��Ԥ��");
    }

    /**
     * �˷�����
     * @param roomNo
     */
    public void exit(int roomNo) {
        //�����ǽ���������status��true�޸�Ϊfalse
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(true);
        System.out.println("���˶�");
    }

    public void duibi(int roomNo) {
        //�˷�ʱ�Աȷ����Ƿ��ڿ���״̬
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        if (room.getStatus() == true) {
            System.out.println("�����˷�");
        } else if (room.getStatus() == false) {
            System.out.println("�˷��䴦�ڿ���״̬�������˶�");
        }

    }
}
