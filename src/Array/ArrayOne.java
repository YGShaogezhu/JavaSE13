package Array;

public class ArrayOne {
    public static void main(String[] args) {
        //��������
        int [] a = new int[] {1,2,3};
        //int [] a = {1, 2, 3}

        //��������
        int [] arr1 = new int[]{11, 12, 13};
        int [] arr2 = {11, 12, 13};

        //����ѧ������
        String [] name1 = new String[] {"����", "����", "����"};
        String [] name2 = {"����", "����", "����"};

        System.out.println(arr2);//[I@4c873330
        /*[ ��ʾһ������
          I ��ʾ��������
        */

        //��ȡ�������Ԫ��
        int c =arr2[2];
        System.out.println(c);
        System.out.println(arr2[2]);
        //�洢Ԫ�ص���������ǣ�
        arr2[2] = 14;
        System.out.println(arr2[2]);//һ�����ǣ�ԭ�������ݾ�û����


    }
}

