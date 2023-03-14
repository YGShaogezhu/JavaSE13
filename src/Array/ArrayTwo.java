package Array;

public class ArrayTwo {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};

        //太麻烦
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[3]);

        //用循环
//        for (int i = 0; i <= 4; i++) {
//            System.out.println(i);
//        }


        //length可以调用数组长度
//        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        //通用的遍历
        //快的的生成方式==数组名.fori

    }
}
