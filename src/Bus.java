public class Bus implements TicketPricing{

    double calculateTicketPrice(int source, int destination, int tickets){

        double totalPrice = 0;
        totalPrice+=tickets * getPrice(source, destination);
        return totalPrice;
    }

    @Override
    public double getPrice(int src, int des) {
        return prices[src][des];
    }

    @Override
    public double getAuditList() {
        return 0;
    }
}
