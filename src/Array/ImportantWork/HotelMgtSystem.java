package Array.ImportantWork;


import java.util.Scanner;

/**
    Ϊĳ���Ƶ��д���򣬾Ƶ����ϵͳ��ģ�ⶩ�����˷�����ӡ���з����״̬����
        Ҫ��
            1����ϵͳ���û��ǣ��Ƶ�ǰ̨
            2���Ƶ�ϵͳ����ʹ��һ����ά������ģ��
            3���Ƶ��е�ÿһ������Ӧ����һ��Java����Room
            4��ÿһ������RoomӦ���У������š������������ԡ������Ƿ����
            5��ϵͳӦ�ö����ṩ�Ĺ��ܣ�
                        ����Ԥ�����䣺�û����뷿��ţ�����
                        �����˷����û����뷿���ţ��˷�
                        ���Բ鿴���з����״̬���û�����ĳ��ָ��Ӧ�ÿ��Բ鿴���з���״̬

 */
public class HotelMgtSystem {

    public static void main(String[] args) {

        //�����Ƶ����
        Hotel hotel = new Hotel();
        //��ӡ����״̬
//        hotel.print();

        /*
        ��ӭҳ��
         */
        System.out.println("��ӭʹ�þƵ����ϵͳ");
        System.out.println("�������Ӧ�ı�Ź��ܣ�[1]��ʾ�鿴�����б�[2]��ʾ������[3]��ʾ�˷���[0]��ʾ�˳���");
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("��ѡ���ܱ�ţ�");
            int i = s.nextInt();
            if (i == 1) {
                hotel.print();
            } else if (i == 2) {
                System.out.println("��������ҪԤ���ķ�����:");
                Scanner a = new Scanner(System.in);
                hotel.order(a.nextInt());
            } else if (i == 3) {
                System.out.println("��������Ҫ�˶��ķ�����:");
                Scanner a = new Scanner(System.in);
                int a1 = a.nextInt();
                hotel.exit(a1);
            } else if (i == 0) {
                System.out.println("�ѽ�����ϵϵͳ");
                return;
            }else {
                System.out.println("������ı���������������룡");
            }
        }

    }

}
