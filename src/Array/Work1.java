package Array;

public class Work1 {
    public static void main(String[] args) {
        //����һ��12345�����鲢���
        int [] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i ������������ÿһ��������
            //arr[i]���ɱ�ʾ�������ÿһ��Ԫ��
            sum = sum + arr[i];
        }
        System.out.println(sum);

        System.out.println("------------------------------------------------------------------------");

        //ͳ�Ƹ���
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if ( arr2[i]%3==0 ) {
//                System.out.println(arr2[i]);
                count++;
            }
        }
        System.out.println("�������ܱ�3���������У�" + count + "��");

        System.out.println("------------------------------------------------------------------------");

        //�仯����
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
