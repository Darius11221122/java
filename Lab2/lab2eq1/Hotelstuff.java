public class Hotelstuff{



public static void main(String []args){
    HotelRoom roomA = new HotelRoom();
    HotelRoom roomB = new HotelRoom();
    HotelRoom roomC = new HotelRoom(202, "single", true, 90);

    roomA.setrType("Single");
    roomA.setrNumber(200);
    roomA.setrVacant(true);
    roomA.setrRate(100);

    roomB.setrType("Double");
    roomB.setrNumber(201);
    roomB.setrVacant(false);
    roomB.setrRate(80);

    System.out.println("Room A:" + roomA.getrNumber() + "," + roomA.getrType() + ". Room A is " + roomA.getrVacant() + "with a rate of: " + roomA.getrRate() + "per night.");
    System.out.println("Room B:" + roomB.getrNumber() + "," + roomB.getrType() + "> Room B is " + roomB.getrVacant() + "with a rate of: " + roomB.getrRate() + "per night.");
    System.out.println(roomC);
    }
    
}