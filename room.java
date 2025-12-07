public class Room {
    private String roomNumber;
    private String capacity;
    private double price;
    private boolean isAvailable;

    public Room(String roomNumber, String capacity, double price, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Room(String roomNumber, String capacity, double price) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.price = price;
        this.isAvailable = true;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}
