public class Room {
    private int roomNo;
    private boolean occupied;
    private String studentRegNo;
    
    public Room(int roomNo){
        this.roomNo = roomNo;
        this.occupied = false;
        this.studentRegNo = null;
    }

    public Room(int roomNo, boolean occupied, String studentRegNo) {
        this.roomNo = roomNo;
        this.occupied = occupied;
        this.studentRegNo = studentRegNo;
    }
    
    public int getRoomNo(){ return roomNo; }
    public boolean isOccupied(){ return occupied; }
    public String getStudentRegNo(){ return studentRegNo; }
}
