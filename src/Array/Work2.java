package Array;

import java.util.Random;

public class Work2 {
    public static void main(String[] args) {
        //��������10��1~100֮����������������
        //1������������ݵĺ�
        //2������������ݵ�ƽ����
        //3��ͳ���ж��ٸ����ݱ�ƽ��ֵС


        int[] arr = new int[10];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("----------------------");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }

        System.out.println(sum);

        System.out.println("----------------------");

        int average = sum / 10;

        System.out.println(average);

        System.out.println("----------------------");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("----------------------");

        //���������ݵĵ���
        int[] arr2 = {1,2,3,4,5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        for (int i = 0,j = arr2.length - 1; i < j; i++, j--) {
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
