public class HotelRoom {

    private int roomNumber;
    private String roomType;
    private boolean roomVacant;
    private double roomRate;

    // get
    public int getrNumber(){
        return roomNumber;
    }
    public String getrType(){
        return roomType;
    }
    public boolean getrVacant(){
        return roomVacant;
    }
    public double getrRate(){
        return roomRate;
    }

    // set
    public void setrNumber(int newRoomNumber){
        roomNumber = newRoomNumber;
    }
    public  void setrType(String newRoomType){
        roomType = newRoomType;
    }
    public void setrVacant(boolean newRoomVacant){
        roomVacant = newRoomVacant;
    }
    public void setrRate(double newRoomRate){
        roomRate = newRoomRate;
    }

    // constructor
    public HotelRoom(){
    }

    public HotelRoom(int roomNr, String roomTy, boolean roomVa, double roomRa){
        roomNumber = roomNr;
        roomType = roomTy;
        roomVacant = roomVa;
        roomRate = roomRa;
    }

    // method for boolean vacancy
    public void isOccupied(){
        if (roomVacant == false){
            System.out.println("occupied");
        }
        else {
            setrVacant(roomVacant == true);
            System.out.println("Vacant");
        }
    }

    //for pringint room C
    public String toString(){
        return "Room number: " + roomNumber + " Room Type:" + roomType + " Room Vacant:" + roomVacant + " Room Rate:" + roomRate;
    }

}