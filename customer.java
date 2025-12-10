import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private ArrayList<Reservation> reservations;


    public Customer(String name, String surname, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.reservations = new ArrayList<>();

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone (String phone) {
        this.phone = phone;
    }

    public void addReservation(Reservation r) {
        reservations.add(r);
    }
    public void removeReservation(Reservation r) {
        reservations.remove(r);
    }
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
    }

