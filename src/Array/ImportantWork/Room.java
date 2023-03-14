package Array.ImportantWork;

public class Room{

    /*
        ������
        1¥��101 102 103
        2¥��201 202 203
        3¥��301 302 303
     */
    private int no;

    /*
        ��������
  ���˼䣬˫�˼䡭��
     */
    private String type;

    /*
        �����Ƿ����
        true ��ʾ���У���Ԥ��
        false ��ʾռ�� ������Ԥ��
     */
    private boolean status;

    //���췽��
    public Room() {
    }

    public Room(int roomNumber, String type, boolean status) {
        no = roomNumber;
        this.type = type;
        this.status = status;
    }

    //getter and setter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals������д
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) return false;
        if (this == obj) return true;
        Room room = (Room) obj;
        //��ǰ������ ���� �������ķ�����
        return this.no == room.getNo();
    }

    //toString������д

    @Override
    public String toString() {
//        return no + "��" + type + "Ŀǰ����" + (status ? "����״̬������Ԥ��" : "ռ��״̬,������Ԥ��");
        return "["+no+","+type+","+(status ? "����" : "ռ��")+"]";
    }

}
