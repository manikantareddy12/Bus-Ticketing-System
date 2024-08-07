import java.util.ArrayList;

public interface TicketPricing {
    int numSeats = 25;

    boolean[] seats = new boolean[numSeats];
    ArrayList<String> stops = new ArrayList<>();
    ArrayList<Ticket> ticketList = new ArrayList<>();
    ArrayList<Passenger> passengerList = new ArrayList<>();


    double[][] prices = {
            {0.0, 20.0, 30.0, 40.0, 50.0},  // Prices from Boston to other stops (round trip)
            {20.0, 0.0, 25.0, 35.0, 45.0},  // Prices from Salem to other stops (round trip)
            {30.0, 25.0, 0.0, 20.0, 30.0},   // Prices from Harvard to other stops (round trip)
            {40.0, 35.0, 20.0, 0.0, 25.0},   // Prices from Lowell to other stops (round trip)
            {50.0, 45.0, 30.0, 25.0, 0.0}    // Prices from Fitchburg to other stops (round trip)
    };

    double getPrice(int src, int des);

    double getAuditList();

}
