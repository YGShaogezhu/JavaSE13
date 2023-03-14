package Array;

public class Work1 {
    public static void main(String[] args) {
        //生成一个12345的数组并求和
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 依旧是数组里每一个的索引
            //arr[i]依旧表示数组里的每一个元素
            sum = sum + arr[i];
        }
        System.out.println(sum);

        System.out.println("------------------------------------------------------------------------");

        //统计个数
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if ( arr2[i]%3==0 ) {
//                System.out.println(arr2[i]);
                count++;
            }
        }
        System.out.println("数组中能被3整除的数有：" + count + "个");

        System.out.println("------------------------------------------------------------------------");

        //变化数据
        int [] arr3 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0) {
                arr3[i] = arr3[i] / 2;
            }
            else {
                arr3[i] = arr3[i] * 2;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
