import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Booking {
    Bus bus = new Bus();
    BookingDetails bookingDetails = new BookingDetails();
    Scanner scan = new Scanner(System.in);
    void displayRoute(){
        System.out.println("Our Journey Route:");
        System.out.println("Route-1. " + TicketPricing.stops.getFirst() + " --> " + TicketPricing.stops.getLast() + ":");

        int i;
        for ( i=0; i< TicketPricing.stops.size()-1;i++){
            System.out.print(TicketPricing.stops.get(i) +" -> ");
        }
        System.out.println(TicketPricing.stops.get(i));

        System.out.println("Route-2. " + TicketPricing.stops.getLast() + " --> " + TicketPricing.stops.getFirst() +":");

        for (i=TicketPricing.stops.size()-1; i>0; i--){
            System.out.print(TicketPricing.stops.get(i) +" -> ");
        }
        System.out.println(TicketPricing.stops.get(i));
        System.out.println("||---------------------------------------||");
    }

    void book(){
        System.out.println("Select the source and destination places to book a Ticket: ");
        AtomicInteger k = new AtomicInteger(1);
        TicketPricing.stops.forEach(stop -> System.out.println(k.getAndIncrement() +". "+ stop));
        System.out.println("Enter the source stop:");
        int source = scan.nextInt();
        System.out.println("Enter the destination stop:");
        int destination = scan.nextInt();
        System.out.println("Enter the number of tickets needed:");
        int tickets = scan.nextInt();
        int[] seatNumbers = new int[tickets];
        for (int i=0; i<tickets;i++) {
            System.out.println("Select the seat numbers from ");
            bookingDetails.seatDetails();
            seatNumbers[i] = scan.nextInt();
            TicketPricing.seats[seatNumbers[i]-1] = true;
        }
//        System.out.println("source: "+ TicketPricing.stops.get(source) + "Des: "+  TicketPricing.stops.get(destination) + "num Tickets: " + tickets);
        double totalBill = bus.calculateTicketPrice(source-1, destination-1, tickets);
        System.out.println("Cost of " + tickets+ " tickets is: "+ totalBill +"\nDo you want to proceed (Y/N):");
        String choice = scan.next();
        String[] name = new String[tickets];
        int[] age = new int[tickets];
        String[] gender = new String[tickets];
        String[] contact = new String[tickets];
        if(choice.equalsIgnoreCase("Y")){
            System.out.println("Enter details to book a ticket:");
            for(int i=0; i<tickets; i++) {
                System.out.println("    Passenger " + (i+1));
                System.out.println("        Enter Name : "); name[i] = scan.next();
                System.out.println("        Enter Age: ");  age[i] = scan.nextInt();
                System.out.println("        Enter Gender (Male/Female): "); gender[i] = scan.next();
                System.out.println("        Enter Contact Number "); contact[i] = scan.next();
            }
            Ticket ticket = new Ticket(name, age, gender, contact, TicketPricing.stops.get(source-1), TicketPricing.stops.get(destination-1), tickets, seatNumbers, totalBill, LocalDateTime.now());
            TicketPricing.ticketList.add(ticket);
            for(int i=0; i<tickets; i++){
                double personBill = bus.calculateTicketPrice(source-1, destination-1, 1);
                Passenger passenger = new Passenger(name[i], age[i], gender[i], contact[i], seatNumbers[i], TicketPricing.stops.get(source-1), TicketPricing.stops.get(destination-1), personBill, LocalDateTime.now());
                TicketPricing.passengerList.add(passenger);
            }
            bookingDetails.ticketDetails();

        }
        else {
            System.out.println(" Thank you for visiting. See you again! ");
        }
    }



}
