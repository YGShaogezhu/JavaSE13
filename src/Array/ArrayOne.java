package Array;

public class ArrayOne {
    public static void main(String[] args) {
        //数据类型
        int [] a = new int[] {1,2,3};
        //int [] a = {1, 2, 3}

        //定义年龄
        int [] arr1 = new int[]{11, 12, 13};
        int [] arr2 = {11, 12, 13};

        //定义学生姓名
        String [] name1 = new String[] {"张三", "李四", "王五"};
        String [] name2 = {"张三", "李四", "王五"};

        System.out.println(arr2);//[I@4c873330
        /*[ 表示一个数组
          I 表示数据类型
        */

        //获取数组里的元素
        int c =arr2[2];
        System.out.println(c);
        System.out.println(arr2[2]);
        //存储元素到数组里（覆盖）
        arr2[2] = 14;
        System.out.println(arr2[2]);//一旦覆盖，原来的数据就没有了


    }
}

