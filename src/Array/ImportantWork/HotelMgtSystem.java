package Array.ImportantWork;


import java.util.Scanner;

/**
    为某个酒店编写程序，酒店管理系统，模拟订房、退房、打印所有房间的状态功能
        要求：
            1、该系统的用户是：酒店前台
            2、酒店系统房间使用一个二维数组来模拟
            3、酒店中的每一个房间应该是一个Java对象：Room
            4、每一个房间Room应该有：房间编号、房间类型属性、房间是否空闲
            5、系统应该对外提供的功能：
                        可以预定房间：用户输入房间号，订房
                        可以退房：用户输入房间编号，退房
                        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态

 */
public class HotelMgtSystem {

    public static void main(String[] args) {

        //创建酒店对象
        Hotel hotel = new Hotel();
        //打印房间状态
//        hotel.print();

        /*
        欢迎页面
         */
        System.out.println("欢迎使用酒店管理系统");
        System.out.println("请输入对应的编号功能：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出。");
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("请选择功能编号：");
            int i = s.nextInt();
            if (i == 1) {
                hotel.print();
            } else if (i == 2) {
                System.out.println("请输入你要预定的房间编号:");
                Scanner a = new Scanner(System.in);
                hotel.order(a.nextInt());
            } else if (i == 3) {
                System.out.println("请输入你要退订的房间编号:");
                Scanner a = new Scanner(System.in);
                int a1 = a.nextInt();
                hotel.exit(a1);
            } else if (i == 0) {
                System.out.println("已结束本系系统");
                return;
            }else {
                System.out.println("你输入的编号有误，请重新输入！");
            }
        }

    }

}
