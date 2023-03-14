package Array.ImportantWork;

public class Room{

    /*
        房间编号
        1楼：101 102 103
        2楼：201 202 203
        3楼：301 302 303
     */
    private int no;

    /*
        房间类型
  单人间，双人间……
     */
    private String type;

    /*
        房间是否空闲
        true 表示空闲，可预订
        false 表示占用 ，不可预订
     */
    private boolean status;

    //构造方法
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

    //equals方法重写
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) return false;
        if (this == obj) return true;
        Room room = (Room) obj;
        //当前房间编号 等于 传过来的房间编号
        return this.no == room.getNo();
    }

    //toString方法重写

    @Override
    public String toString() {
//        return no + "号" + type + "目前处于" + (status ? "空闲状态，可以预定" : "占用状态,不可以预定");
        return "["+no+","+type+","+(status ? "空闲" : "占用")+"]";
    }

}
