package pers.array.work.d2;

/**
 * @Author LiZiHao
 * @Date 2022/6/1/14:47
 */
public class Room {
    private int no;
    private String type;
    private boolean state;

    public Room() {
    }

    public Room(int no, String type, boolean state) {
        this.no = no;
        this.type = type;
        this.state = state;
    }


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

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String toString() {
        return "[" + no + "," + type + "," + (state ? "空闲" : "占用") + "]";
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) return false;
        if (obj == this) return true;
        Room room = (Room) obj;
        return this.no == room.no;
    }
}
