import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();
        BookingDetails bookingDetails = new BookingDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to TBC (Ticket Booking Centre).!");
        TicketPricing.stops.add("Boston");
        TicketPricing.stops.add("Salem");
        TicketPricing.stops.add("Harvard");
        TicketPricing.stops.add("Lowell");
        TicketPricing.stops.add("Fitchburg");
//        System.out.println(TicketPricing.seats);
        while(true){
            System.out.println("\n1. display bus route");
            System.out.println("2. Book a ticket");
            System.out.println("3. Show booked tickets");
            System.out.println("4. Show booked passengers");
            System.out.println("5. Show available seats");
            System.out.println("6. Exit");

            System.out.println("Enter choice:");
            int choice = scanner.nextInt();

            if (choice == 6){
                System.out.println("Thanks for visiting! See You Again!");
                break;
            }
            else {
                switch (choice){
                    case 1: booking.displayRoute();
                        break;
                    case 2:booking.book();
                        break;
                    case 3:bookingDetails.ticketDetails();
                        break;
                    case 4:bookingDetails.personDetails();
                        break;
                    case 5:bookingDetails.seatDetails();
                }
            }

        }
    }
}