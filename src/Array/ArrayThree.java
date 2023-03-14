package Array;

public class ArrayThree {
    public static void main(String[] args) {
        //动态初始化
        //数据类型[]数组名 = new 数据类型[数组长度]
//        int[] arr = new int[3];

        //定义一个数组，有50个同学，姓名未知
        String[] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
