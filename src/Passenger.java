import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Passenger extends Bus{
    private String Name;
    private int Age;
    private String Gender;
    private String Contact;
    private int TicketNumber;
    protected String Pickup;
    protected String DropOff;
    protected double Price;
    protected LocalDateTime TimeStamp;

    public Passenger(String name, int age, String gender, String contactNumber, int ticketNumber, String pickup, String dropOff, double price, LocalDateTime timeStamp) {
        Name = name;
        Age = age;
        Gender = gender;
        Contact = contactNumber;
        TicketNumber = ticketNumber;
        Pickup = pickup;
        DropOff = dropOff;
        Price = price;
        TimeStamp = timeStamp;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getContact() {
        return Contact;
    }

    public int getTicketNumber() {
        return TicketNumber;
    }

    public String getPickup() {
        return Pickup;
    }

    public String getDropOff() {
        return DropOff;
    }
    public double getPrice() {
        return Price;
    }
    public String getTimeStamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Time:' hh:mm a , 'Date:' MM-dd-yyyy");
        return TimeStamp.format(formatter);
    }

}
