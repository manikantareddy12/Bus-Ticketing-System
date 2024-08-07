import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {

    protected String[] Name;
    protected int[] Age;
    protected String[]  Gender;
    protected String[] Contact;
    protected String Source;
    protected String Destination;
    protected int NumOfTickets;
    protected int[] SeatNumber;
    protected double Price;
    protected LocalDateTime TimeStamp;

    public Ticket(String[] name, int[] age, String[] gender, String[] contact, String source,
                  String destination, int numOfTickets, int[] seatNumber, double price, LocalDateTime timeStamp) {
        Name = name;
        Age = age;
        Gender = gender;
        Contact = contact;
        Source = source;
        Destination = destination;
        NumOfTickets = numOfTickets;
        SeatNumber = seatNumber;
        Price = price;
        TimeStamp = timeStamp;
    }

    public String[] getName() {
        return Name;
    }

    public int[] getAge() {
        return Age;
    }

    public String[] getGender() {
        return Gender;
    }
    public String[] getContact() {
        return Contact;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return Destination;
    }

    public int getNumOfTickets() {
        return NumOfTickets;
    }

    public int[] getSeatNumber() {
        return SeatNumber;
    }

    public double getPrice() {
        return Price;
    }

    public String getTimeStamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Time:' hh:mm a , 'Date:' MM-dd-yyyy");
        return TimeStamp.format(formatter);
    }
}
