import java.util.Arrays;

public class BookingDetails {
    int iter=1;

    void ticketDetails(){
        if(!TicketPricing.ticketList.isEmpty()) {
            iter =1;
            for (Ticket ticket : TicketPricing.ticketList) {
                System.out.println("||----Ticket details of booking "+iter+" -----||");
                iter+=1;
                for(int i=0; i<ticket.getNumOfTickets();i++) {
                    System.out.println("Passenger "+(i+1)+":");
                    System.out.print(" Name: " + ticket.getName()[i] + ",");
                    System.out.print(" Age: " + ticket.getAge()[i]+ ",");
                    System.out.println(" Gender: " + ticket.getGender()[i]+ ",");
                }
                System.out.println("Source: " + ticket.getSource());
                System.out.println("Destination: " + ticket.getDestination());
                System.out.println("Number of Tickets: " + ticket.getNumOfTickets());
                System.out.println("Ticket Numbers: " + Arrays.toString(ticket.getSeatNumber()));
                System.out.println("Contact Number: " + Arrays.toString(ticket.getContact()));
                System.out.println("Booked on: " + ticket.getTimeStamp());
                double cost = ticket.getPrice() * 8 / 100 + ticket.getPrice();
                System.out.println("Total bill for " + ticket.getNumOfTickets() + " tickets (with 8% tax): " + cost + "$");

            }
        }
        else{
            System.out.println("No tickets have been booked today.");
        }
    }
    void seatDetails(){
        System.out.println("Available Seats:");
        int i;
        for(i=0; i<TicketPricing.seats.length-1; i++){
            if(!TicketPricing.seats[i]){
                System.out.print(i+1 +", ");
            }
        }
        System.out.println(i+1 + ".");

    }

    void personDetails(){
        iter = 1;
        if(!TicketPricing.passengerList.isEmpty()) {
            for (Passenger passenger : TicketPricing.passengerList) {
                System.out.println("|--Information of passenger "+iter+" --|");
                iter+=1;
                System.out.print("Name: " + passenger.getName() + ",");
                System.out.print("Age: " + passenger.getAge()+ ",");
                System.out.println("Gender: " + passenger.getGender()+ ",");
                System.out.println("Source: " + passenger.getPickup());
                System.out.println("Destination: " + passenger.getDropOff());
                System.out.println("Ticket Numbers: " + passenger.getTicketNumber());
                System.out.println("Contact number: " + passenger.getContact());
                System.out.println("Booked " + passenger.getTimeStamp());
                double cost = passenger.getPrice() * 8 / 100 + passenger.getPrice();
                System.out.println("Cost of Ticket (with 8% tax):" + cost +"$");


            }
        }
        else{
            System.out.println("No tickets have been booked today.");
        }


    }
}
