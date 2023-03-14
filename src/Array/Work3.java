package Array;

import java.util.Random;

public class Work3 {
    public static void main(String[] args) {
        //随机打乱数组中的数据

        int[] arr = {1,2,3,4,5};

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {

            int randomIndex = r.nextInt(arr.length);

            int temp = arr[i];

            arr[i] = arr[randomIndex];

            arr[randomIndex] = temp;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
