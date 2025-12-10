public class StandardRoom extends Room{
    
    public StandardRoom(String roomNumber, String capacity, double price, boolean isAvailable ) {
        super(roomNumber, capacity, price, isAvailable);
    }
    
    @Override
   public void printAvailable() {
        System.out.println("Suite Room availability: " + isAvailable());
    }
}
